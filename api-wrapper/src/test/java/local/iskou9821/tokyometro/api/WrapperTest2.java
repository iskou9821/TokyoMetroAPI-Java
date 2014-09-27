package local.iskou9821.tokyometro.api;

import java.util.List;

import local.iskou9821.tokyometro.api.config.DefaultConfiguration;
import local.iskou9821.tokyometro.api.model.PassengerSurvey;
import local.iskou9821.tokyometro.api.model.Railway;
import local.iskou9821.tokyometro.api.model.RailwayFare;
import local.iskou9821.tokyometro.api.model.Station;
import local.iskou9821.tokyometro.api.model.StationFacility;
import local.iskou9821.tokyometro.api.model.StationTimetable;
import local.iskou9821.tokyometro.api.model.Train;
import local.iskou9821.tokyometro.api.model.TrainInformation;

public class WrapperTest2 extends AbsApiTest {
	private TokyoMetroApiWrapper w() {
		return new TokyoMetroApiWrapper(
				new DefaultConfiguration(getConsumerKeyProvider()));		
	}
	
	private interface CB<T> {
		void func(T data);
	}
	
	private <T> void each(List<T> data, CB<T> callback) {
		for (T d : data) {
			callback.func(d);
		}
	}
	
	public void testPassengerSurvey() {
		List<PassengerSurvey> l = w()
				.queryParam("owl:sameAs", "odpt.PassengerSurvey:TokyoMetro.Ueno.2013")
				.get(PassengerSurvey.class);
		
		each(l, new CB<PassengerSurvey>() {
			@Override
			public void func(PassengerSurvey data) {
				System.out.println(data);
			}
		});
	}
	
	public void testRailway() {
		List<Railway> l = w()
				.queryParam("odpt:lineCode", "G")
				.get(Railway.class);
		
		each(l, new CB<Railway>() {
			@Override
			public void func(Railway data) {
				System.out.println(data);
			}
		});
	}

	public void testRailwayFare() {
		List<RailwayFare> l = w()
				.queryParam("odpt:fromStation", "odpt.Station:TokyoMetro.Ginza.Asakusa")
				.queryParam("odpt:toStation", "odpt.Station:TokyoMetro.Ginza.Tawaramachi")
				.get(RailwayFare.class);
		
		each(l, new CB<RailwayFare>() {
			@Override
			public void func(RailwayFare data) {
				System.out.println(data);
			}
		});
	}
	
	public void testStation() {
		List<Station> l = w()
				.queryParam("owl:sameAs", "odpt.Station:TokyoMetro.Ginza.Ueno")
				.get(Station.class);
		
		each(l, new CB<Station>() {
			@Override
			public void func(Station data) {
				System.out.println(data);
			}
		});
	}
	
	public void testStationFacility() {
		List<StationFacility> l = w()
				.queryParam("owl:sameAs", "odpt.StationFacility:TokyoMetro.Ueno")
				.get(StationFacility.class);
		
		each(l, new CB<StationFacility>() {
			@Override
			public void func(StationFacility data) {
				System.out.println(data);
			}
		});		
	}
	
	public void testStationTimetable() {
		List<StationTimetable> l = w()
				.queryParam("odpt:station", "odpt.Station:TokyoMetro.Ginza.Ueno")
				.get(StationTimetable.class);
		
		each(l, new CB<StationTimetable>() {
			@Override
			public void func(StationTimetable data) {
				System.out.println(data);
			}
		});
	}
	
	public void testTrain() {
		List<Train> l = w()
				.queryParam("odpt:railway", "odpt.Railway:TokyoMetro.Ginza")
				.get(Train.class);
		
		each(l, new CB<Train>() {
			@Override
			public void func(Train data) {
				System.out.println(data);
			}
		});		
	}
	
	public void testTrainInformation() {
		List<TrainInformation> l = w()
				.queryParam("odpt:railway", "odpt.Railway:TokyoMetro.Ginza")
				.get(TrainInformation.class);
		
		each(l, new CB<TrainInformation>() {
			@Override
			public void func(TrainInformation data) {
				System.out.println(data);
			}
		});				
	}
}
