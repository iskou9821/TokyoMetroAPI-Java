package local.iskou9821.tokyometro.api.model;

import java.util.Date;
import java.util.List;

import local.iskou9821.tokyometro.api.model.sub.StationTimetableObject;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName("odpt:StationTimetable")
public class StationTimetable extends AbsMainModel {
	@JsonProperty("owl:sameAs")
	private String sameAs;
	
	@JsonProperty("dc:date")
	private Date date;
	
	@JsonProperty("odpt:station")
	private String station;
	
	@JsonProperty("odpt:railway")
	private String railway;
	
	@JsonProperty("odpt:operator")
	private String operator;

	@JsonProperty("odpt:railDirection")
	private String railDirection;
	
	@JsonProperty("odpt:weekdays")
	private List<StationTimetableObject> weekdays;
	
	@JsonProperty("odpt:saturdays")
	private List<StationTimetableObject> saturdays;
	
	@JsonProperty("odpt:holidays")
	private List<StationTimetableObject> holidays;
	
	public String getSameAs() {
		return sameAs;
	}

	public void setSameAs(String sameAs) {
		this.sameAs = sameAs;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getRailway() {
		return railway;
	}

	public void setRailway(String railway) {
		this.railway = railway;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getRailDirection() {
		return railDirection;
	}

	public void setRailDirection(String railDirection) {
		this.railDirection = railDirection;
	}

	public List<StationTimetableObject> getWeekdays() {
		return weekdays;
	}

	public void setWeekdays(List<StationTimetableObject> weekdays) {
		this.weekdays = weekdays;
	}

	public List<StationTimetableObject> getSaturdays() {
		return saturdays;
	}

	public void setSaturdays(List<StationTimetableObject> saturdays) {
		this.saturdays = saturdays;
	}

	public List<StationTimetableObject> getHolidays() {
		return holidays;
	}

	public void setHolidays(List<StationTimetableObject> holidays) {
		this.holidays = holidays;
	}
	
}
