package local.iskou9821.tokyometro.api.model;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName("odpt:Train")
public class Train extends AbsMainModel {
	@JsonProperty("owl:sameAs")
	private String sameAs;
	
	@JsonProperty("dc:date")
	private Date date;
	
	@JsonProperty("dct:valid")
	private Date valid;
	
	@JsonProperty("odpt:trainType")
	private String trainType;
	
	@JsonProperty("odpt:frequency")
	private Integer frequency;
	
	@JsonProperty("odpt:trainNumber")
	private String trainNumber;
	
	@JsonProperty("odpt:railway")
	private String railWay;
	
	@JsonProperty("odpt:trainOwner")
	private String trainOwner;
	
	@JsonProperty("odpt:railDirection")
	private String railDirection;
	
	@JsonProperty("odpt:delay")
	private Integer delay;
	
	@JsonProperty("odpt:startingStation")
	private String startingStation;
	
	@JsonProperty("odpt:terminalStation")
	private String terminalStation;
	
	@JsonProperty("odpt:fromStation")
	private String fromStation;
	
	@JsonProperty("odpt:toStation")
	private String toStation;
	
	public String getSameAs() {
		return sameAs;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setSameAs(String sameAs) {
		this.sameAs = sameAs;
	}
	public String getTrainType() {
		return trainType;
	}
	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getRailWay() {
		return railWay;
	}
	public void setRailWay(String railWay) {
		this.railWay = railWay;
	}
	public String getTrainOwner() {
		return trainOwner;
	}
	public void setTrainOwner(String trainOwner) {
		this.trainOwner = trainOwner;
	}
	public String getRailDirection() {
		return railDirection;
	}
	public void setRailDirection(String railDirection) {
		this.railDirection = railDirection;
	}
	public Integer getDelay() {
		return delay;
	}
	public void setDelay(Integer delay) {
		this.delay = delay;
	}
	public String getStartingStation() {
		return startingStation;
	}
	public void setStartingStation(String startingStation) {
		this.startingStation = startingStation;
	}
	public String getTerminalStation() {
		return terminalStation;
	}
	public void setTerminalStation(String terminalStation) {
		this.terminalStation = terminalStation;
	}
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
	public Date getValid() {
		return valid;
	}
	public void setValid(Date valid) {
		this.valid = valid;
	}
	public Integer getFrequency() {
		return frequency;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}
}
