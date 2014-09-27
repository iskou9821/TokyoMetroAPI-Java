package local.iskou9821.tokyometro.api.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class TravelTime extends AbsSubModel {
	@JsonProperty("odpt:fromStation")
	private String fromStatine;
	
	@JsonProperty("odpt:toStation")
	private String toStation;
	
	@JsonProperty("odpt:necessaryTime")
	private String necessaryTime;

	public String getFromStatine() {
		return fromStatine;
	}

	public void setFromStatine(String fromStatine) {
		this.fromStatine = fromStatine;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	public String getNecessaryTime() {
		return necessaryTime;
	}

	public void setNecessaryTime(String necessaryTime) {
		this.necessaryTime = necessaryTime;
	}	
}
