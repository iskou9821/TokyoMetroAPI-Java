package local.iskou9821.tokyometro.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import local.iskou9821.tokyometro.api.config.DefaultConfiguration;
import local.iskou9821.tokyometro.api.model.Station;
import local.iskou9821.tokyometro.api.model.Train;
import local.iskou9821.tokyometro.api.util.QueryParam;

public class WrapperTest extends AbsApiTest {
	public void test01() throws IOException {
		TokyoMetroApiWrapper w = new TokyoMetroApiWrapper(
						new DefaultConfiguration(getConsumerKeyProvider()));
		
		List<QueryParam> params = new ArrayList<QueryParam>();
		params.add(new QueryParam("owl:sameAs", "odpt.Station:TokyoMetro.Ginza.Ueno"));
		List<Station> l = w.get(Station.class, params);
		for (Station s : l) {
			System.out.println(ToStringBuilder.reflectionToString(s));
		}
	}
	
	public void test02() throws IOException {
		TokyoMetroApiWrapper w = new TokyoMetroApiWrapper(
						new DefaultConfiguration(getConsumerKeyProvider()));
		
		List<Station> l = w
				.queryParam("owl:sameAs", "odpt.Station:TokyoMetro.Ginza.Ueno")
				.queryParam("odpt:operator", "TokyoMetro")
				.get(Station.class);
		
		for (Station s : l) {
			System.out.println(ToStringBuilder.reflectionToString(s));
		}
	}	
	
	public void test03() throws IOException {
		TokyoMetroApiWrapper w = new TokyoMetroApiWrapper(
						new DefaultConfiguration(getConsumerKeyProvider()));
		
		List<Train> l = w
				.queryParam("odpt:railway", "odpt.Railway:TokyoMetro.Ginza")
				.get(Train.class);
		
		for (Train t : l) {
			System.out.println(ToStringBuilder.reflectionToString(t));
		}
	}	
	
	
}
