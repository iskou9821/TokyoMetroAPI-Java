package local.iskou9821.tokyometro.api.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class TransferInformation extends AbsSubModel {
	@JsonProperty("odpt:railway")
	private String railway;
	
	@JsonProperty("odpt:railDirection")
	private String railDirection;
	
	@JsonProperty("odpt:necessaryTime")
	private Integer necessaryTime;
	
	public String getRailway() {
		return railway;
	}
	public void setRailway(String railway) {
		this.railway = railway;
	}
	public String getRailDirection() {
		return railDirection;
	}
	public void setRailDirection(String railDirection) {
		this.railDirection = railDirection;
	}
	public Integer getNecessaryTime() {
		return necessaryTime;
	}
	public void setNecessaryTime(Integer necessaryTime) {
		this.necessaryTime = necessaryTime;
	}
}
