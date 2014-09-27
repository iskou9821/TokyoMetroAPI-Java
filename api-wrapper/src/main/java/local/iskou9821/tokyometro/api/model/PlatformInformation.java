package local.iskou9821.tokyometro.api.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class PlatformInformation extends AbsSubModel  {
	@JsonProperty("odpt:carComposition")
	private Integer carComposition;
	
	@JsonProperty("odpt:carNumber")
	private Integer carNumber;
	
	@JsonProperty("odpt:railDirection")
	private String railDirection;
	
	@JsonProperty("odpt:transferInformation")
	private List<TransferInformation> transferInformations; 
	
	@JsonProperty("odpt:barrierfreeFacility")
	private List<String> barrierfreeFacilities;
	
	@JsonProperty("odpt:surroundingArea")
	private List<String> surroundingArea;
	
	public Integer getCarComposition() {
		return carComposition;
	}
	public void setCarComposition(Integer carComposition) {
		this.carComposition = carComposition;
	}
	public Integer getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(Integer carNumber) {
		this.carNumber = carNumber;
	}
	public String getRailDirection() {
		return railDirection;
	}
	public void setRailDirection(String railDirection) {
		this.railDirection = railDirection;
	}
	public List<TransferInformation> getTransferInformations() {
		return transferInformations;
	}
	public void setTransferInformations(
			List<TransferInformation> transferInformations) {
		this.transferInformations = transferInformations;
	}
	public List<String> getBarrierfreeFacilities() {
		return barrierfreeFacilities;
	}
	public void setBarrierfreeFacilities(List<String> barrierfreeFacilities) {
		this.barrierfreeFacilities = barrierfreeFacilities;
	}
	public List<String> getSurroundingArea() {
		return surroundingArea;
	}
	public void setSurroundingArea(List<String> surroundingArea) {
		this.surroundingArea = surroundingArea;
	}
}
