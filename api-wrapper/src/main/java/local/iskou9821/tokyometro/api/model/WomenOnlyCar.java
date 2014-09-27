package local.iskou9821.tokyometro.api.model;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class WomenOnlyCar extends AbsSubModel {
	@JsonProperty("odpt:fromStation")
	private String fromStation;
	
	@JsonProperty("odpt:toStation")
	private String toStation;
	
	@JsonProperty("odpt:operationDay")
	private String operationDay;
	
	@JsonProperty("odpt:availableTimeFrom")
	private Date availableTimeFrom;
	
	@JsonProperty("odpt:availableTimeUntil")
	private Date availableTimeUntil;
	
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

	public Date getAvailableTimeFrom() {
		return availableTimeFrom;
	}

	public void setAvailableTimeFrom(Date availableTimeFrom) {
		this.availableTimeFrom = availableTimeFrom;
	}

	public Date getAvailableTimeUntil() {
		return availableTimeUntil;
	}

	public void setAvailableTimeUntil(Date availableTimeUntil) {
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
