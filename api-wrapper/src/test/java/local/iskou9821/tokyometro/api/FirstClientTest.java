package local.iskou9821.tokyometro.api;

import java.io.IOException;

import junit.framework.TestCase;
import local.iskou9821.tokyometro.api.model.Station;

import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;

public class FirstClientTest extends TestCase {
	//とりあえず実験用で作ったやつ。メモとして残しておくだけ。。。
	public void test01() {
		String key = System.getProperty("TokyoMetro.consumerKey");
		
		Client client = Client.create();
		ClientResponse s =  
		client.resource("https://api.tokyometroapp.jp/api/v2/")
				.path("datapoints")
				.queryParam("rdf:type", "odpt:Station")
				.queryParam("owl:sameAs", "odpt.Station:TokyoMetro.Ginza.Ueno")
				.queryParam("acl:consumerKey", key)
				.get(ClientResponse.class);
		
		ObjectMapper m = new ObjectMapper();
		try {
			String st = s.getEntity(String.class);
			System.out.println(st);
			
			Station[] sts = m.readValue(st, Station[].class);
			System.out.println(sts);
			/*
			List<Map<String, Object>> items = m.readValue(st, List.class);
			
		
			for (Map<String, Object>  map : items) {
				System.out.println("******************************");
				for (Map.Entry<String, Object> en : map.entrySet()) {
					System.out.println(en);
				}
				System.out.println("******************************");
			}
			*/
		} catch (ClientHandlerException | UniformInterfaceException | IOException e) {
			e.printStackTrace();
		}
		
		//System.out.println(s.getEntity(Station[].class));
	}
}
