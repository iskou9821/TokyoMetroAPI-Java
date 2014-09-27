package local.iskou9821.tokyometro.api.model.sub;

import java.util.List;

import local.iskou9821.tokyometro.api.json.TimeDeserializer;
import local.iskou9821.tokyometro.api.model.property.Time;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

public class WomenOnlyCar extends AbsSubModel {
	@JsonProperty("odpt:fromStation")
	private String fromStation;
	
	@JsonProperty("odpt:toStation")
	private String toStation;
	
	@JsonProperty("odpt:operationDay")
	private String operationDay;
	
	@JsonProperty("odpt:availableTimeFrom")
	@JsonDeserialize(using=TimeDeserializer.class)
	private Time availableTimeFrom;
	
	@JsonProperty("odpt:availableTimeUntil")
	@JsonDeserialize(using=TimeDeserializer.class)
	private Time availableTimeUntil;
	
	@JsonProperty("odpt:carComposition")
	private Integer carComposition;
	
	@JsonProperty("odpt:carNumber")
	private List<Integer> carNumber;

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	public String getOperationDay() {
		return operationDay;
	}

	public void setOperationDay(String operationDay) {
		this.operationDay = operationDay;
	}

	public Time getAvailableTimeFrom() {
		return availableTimeFrom;
	}

	public void setAvailableTimeFrom(Time availableTimeFrom) {
		this.availableTimeFrom = availableTimeFrom;
	}

	public Time getAvailableTimeUntil() {
		return availableTimeUntil;
	}

	public void setAvailableTimeUntil(Time availableTimeUntil) {
		this.availableTimeUntil = availableTimeUntil;
	}

	public Integer getCarComposition() {
		return carComposition;
	}

	public void setCarComposition(Integer carComposition) {
		this.carComposition = carComposition;
	}

	public List<Integer> getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(List<Integer> carNumber) {
		this.carNumber = carNumber;
	}
}
