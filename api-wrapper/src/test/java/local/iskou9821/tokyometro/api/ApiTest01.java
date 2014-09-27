package local.iskou9821.tokyometro.api;

import java.io.IOException;

import local.iskou9821.tokyometro.api.model.Station;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class ApiTest01 extends AbsApiTest {
	public void test01() {
		//JSONのデータを取得
		Client client = Client.create();
		ClientResponse s =  
		client.resource("https://api.tokyometroapp.jp/api/v2/")
				.path("datapoints")
				.queryParam("rdf:type", "odpt:Station")
				.queryParam("owl:sameAs", "odpt.Station:TokyoMetro.Ginza.Ueno")
				.queryParam("acl:consumerKey", getKey())
				/*
				 * ここにStringとか、@XmlRootElementの付いたclassを渡すと、(うまくいけば)
				 * そのオブジェクトに変換される。今回はうまくできなかったけど。。。
				 * ちなみにgetはHTTPメソッドのGETのこと。
				 * 他にもpostとかputとかがある。
				 */
				.get(ClientResponse.class); 

		//とりあえずString文字列として出力してみる。
		String st = s.getEntity(String.class);
		System.out.println(st);
		
		/*
		 * JSONをオブジェクトに変換
		 * 上記のとおりJersey-Clientの機能を使った変換がうまくいかなかったのでそれは一旦諦め
		 * JSON文字列を取得 → Jacksonでオブジェクトに変換という流れに。
		 */
		ObjectMapper m = new ObjectMapper();
		
		try {
			/*
			 * オブジェクトをJSONに変換。レスポンスは常に配列っぽい。
			 * 引数にしているクラスは独自に作っているもので、@JsonPropertyとかで変換ルールを指定。
			 */
			Station[] objs = m.readValue(st, Station[].class);
			for (Station obj : objs) {
				System.out.println(ToStringBuilder.reflectionToString(obj));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
