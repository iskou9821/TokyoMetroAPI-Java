package local.iskou9821.tokyometro.api;

import java.io.IOException;
import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.lang3.builder.ToStringBuilder;

import local.iskou9821.tokyometro.api.config.Configuration;
import local.iskou9821.tokyometro.api.config.DefaultConfiguration;
import local.iskou9821.tokyometro.api.model.Station;
import local.iskou9821.tokyometro.api.util.impl.PropertyFileConsumerKeyProviderImpl;

public class UsageSample extends TestCase {
	/**
	 * 使い方の説明です。
	 * @throws IOException 
	 */
	public void testGetStatin() throws IOException {
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
		 * 　＊パラメータの意味については東京メトロの開発者サイトを参照してください。
		 * 　　書き方は、まだまだ改善の余地ありです・・・
		 */
		List<Station> items = new TokyoMetroApiWrapper(config)
								.queryParam("owl:sameAs", "odpt.Station:TokyoMetro.Ginza.Ueno")
								.get(Station.class);
		
		for (Station item : items) {
			System.out.println(ToStringBuilder.reflectionToString(item));
		}
	}
}
