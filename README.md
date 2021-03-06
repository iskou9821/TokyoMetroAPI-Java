# 東京メトロAPIのJavaラッパー

## 概要
東京メトロのAPIをJavaから利用しやすくするためのラッパー的なものを作ろうとしています。

Jersey-clientとjacksonを主に利用します。

## 作る予定のもの
 * 取得可能データのEntity定義(＊自分の使う範囲で)
 * Entity定義を元にデータを取得する仕組み
 * クエリーパラメータの組み立ての面倒を少なくするための仕組み
 
気力の続く限り作ります。。。

## サンプル
こんな感じです。  

    	/*
		 * consumerKeyをプロパティファイルから取得します。
		 * プロパティファイルのサンプルはsrc/test/resourcesに配置してます。
		 * 環境編集からconsumerKeyを取得する場合はEnvParamConsumerKeyProviderImplというクラスがあります。
		 * (TOKYOMETRO_CONSUMER_KEYという環境変数を用意してください)
		 */
		Configuration config = new DefaultConfiguration(
			new PropertyFileConsumerKeyProviderImpl("src/test/resources/tokyo-metro.properties"));
		
		/*
		 * クエリーの例:
		 * 銀座線 上野駅の情報を取得します。
		 * get()の引数には欲しいオブジェクトのクラスを指定します。
		 * 　＊パラメータの意味については東京メトロの開発者サイトを参照してください。
		 * 　　書き方は、まだまだ改善の余地ありです・・・
		 */
		List<Station> items = new TokyoMetroApiWrapper(config)
								.queryParam("owl:sameAs", "odpt.Station:TokyoMetro.Ginza.Ueno")
								.get(Station.class);
		
		for (Station item : items) {
			System.out.println(ToStringBuilder.reflectionToString(item));
		}
		
## TODO
 * 対応するオブジェクトとプロパティの拡充。
 * クエリーパラメータを扱うのに便利な仕組み。
