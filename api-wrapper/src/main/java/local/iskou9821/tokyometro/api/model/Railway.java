package local.iskou9821.tokyometro.api.model;

import java.util.Date;
import java.util.List;

import local.iskou9821.tokyometro.api.json.GeoJsonDeserializer;
import local.iskou9821.tokyometro.api.model.property.GeoJson;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

@JsonTypeName("odpt:Railway")
public class Railway extends AbsMainModel {
	@JsonProperty("owl:sameAs")
	private String sameAs;
	
	@JsonProperty("dc:title")
	private String title;
	
	@JsonProperty("odpt:operator")
	private String operator;
	
	@JsonProperty("dc:date")
	private Date date;
	
	@JsonProperty("odpt:lineCode")
	private String lineCode;
	
	@JsonProperty("ug:region")
	@JsonDeserialize(using=GeoJsonDeserializer.class)
	private GeoJson region;
	
	@JsonProperty("odpt:stationOrder")
	private List<StationOrder> stationOrders;
	
	@JsonProperty("odpt:travelTime")
	private List<TravelTime> travelTimes;
	
	@JsonProperty("odpt:womenOnlyCar")
	private List<WomenOnlyCar> womenOnlyCars;
	
	public String getSameAs() {
		return sameAs;
	}
	public void setSameAs(String sameAs) {
		this.sameAs = sameAs;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getLineCode() {
		return lineCode;
	}
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}
	public List<StationOrder> getStationOrders() {
		return stationOrders;
	}
	public void setStationOrders(List<StationOrder> stationOrders) {
		this.stationOrders = stationOrders;
	}
	public List<TravelTime> getTravelTimes() {
		return travelTimes;
	}
	public void setTravelTimes(List<TravelTime> travelTimes) {
		this.travelTimes = travelTimes;
	}
	public List<WomenOnlyCar> getWomenOnlyCars() {
		return womenOnlyCars;
	}
	public void setWomenOnlyCars(List<WomenOnlyCar> womenOnlyCars) {
		this.womenOnlyCars = womenOnlyCars;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public GeoJson getRegion() {
		return region;
	}
	public void setRegion(GeoJson region) {
		this.region = region;
	}
}
