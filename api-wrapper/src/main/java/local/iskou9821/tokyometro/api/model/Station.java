package local.iskou9821.tokyometro.api.model;

import java.util.Date;
import java.util.List;

import local.iskou9821.tokyometro.api.json.ConnectingRailwayDeserializer;
import local.iskou9821.tokyometro.api.json.GeoUrlDeserializer;
import local.iskou9821.tokyometro.api.json.GeoUrnDeserializer;
import local.iskou9821.tokyometro.api.json.PassengerSurveyLinkSerializer;
import local.iskou9821.tokyometro.api.json.StationFacilityLinkDeserializer;
import local.iskou9821.tokyometro.api.model.property.ConnectingRailway;
import local.iskou9821.tokyometro.api.model.property.GeoDocumentLink;
import local.iskou9821.tokyometro.api.model.property.PassengerSurveyLink;
import local.iskou9821.tokyometro.api.model.property.StationFacilityLink;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

@JsonTypeName("odpt:Station")
public class Station extends AbsMainModel {
	@JsonProperty("owl:sameAs")
	private String sameAs;
	
	@JsonProperty("dc:title")
	private String title;
	
	@JsonProperty("dc:date")
	private Date date;
	
	@JsonProperty("geo:long")
	private Double geoLong;
	
	@JsonProperty("geo:lat")
	private Double geoLat;
	
	@JsonProperty("ug:region")
	@JsonDeserialize(using=GeoUrlDeserializer.class)
	private GeoDocumentLink region;
	
	@JsonProperty("odpt:operator")
	private String operator;
	
	@JsonProperty("odpt:railway")
	private String railway;
	
	@JsonProperty("odpt:stationCode")
	private String stationCode;
	
	@JsonProperty("odpt:connectingRailway")
	@JsonDeserialize(contentUsing=ConnectingRailwayDeserializer.class)
	private List<ConnectingRailway> connectingRailways;
	
	@JsonProperty("odpt:facility")
	@JsonDeserialize(contentUsing=StationFacilityLinkDeserializer.class)
	private StationFacilityLink facilities;
	
	@JsonProperty("odpt:passengerSurvey")
	@JsonDeserialize(contentUsing=PassengerSurveyLinkSerializer.class)
	private List<PassengerSurveyLink> passengerSurveys;
	
	@JsonProperty("odpt:exit")
	@JsonDeserialize(contentUsing=GeoUrnDeserializer.class)
	private List<GeoDocumentLink> exits;
	
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
	public String getRailway() {
		return railway;
	}
	public void setRailway(String railway) {
		this.railway = railway;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getGeoLong() {
		return geoLong;
	}
	public void setGeoLong(Double geoLong) {
		this.geoLong = geoLong;
	}
	public Double getGeoLat() {
		return geoLat;
	}
	public void setGeoLat(Double geoLat) {
		this.geoLat = geoLat;
	}
	public GeoDocumentLink getRegion() {
		return region;
	}
	public void setRegion(GeoDocumentLink region) {
		this.region = region;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getStationCode() {
		return stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public List<ConnectingRailway> getConnectingRailways() {
		return connectingRailways;
	}
	public void setConnectingRailways(List<ConnectingRailway> connectingRailways) {
		this.connectingRailways = connectingRailways;
	}
	public StationFacilityLink getFacilities() {
		return facilities;
	}
	public void setFacilities(StationFacilityLink facilities) {
		this.facilities = facilities;
	}
	public List<PassengerSurveyLink> getPassengerSurveys() {
		return passengerSurveys;
	}
	public void setPassengerSurveys(List<PassengerSurveyLink> passengerSurveys) {
		this.passengerSurveys = passengerSurveys;
	}
	public List<GeoDocumentLink> getExits() {
		return exits;
	}
	public void setExits(List<GeoDocumentLink> exits) {
		this.exits = exits;
	}
}
