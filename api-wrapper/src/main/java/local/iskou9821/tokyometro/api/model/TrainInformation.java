package local.iskou9821.tokyometro.api.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName("odpt:TrainInformation")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainInformation {
	@JsonProperty("odpt:operatorr")
	private String operator;
	
	@JsonProperty("odpt:railway")
	private String railway;
	
	@JsonProperty("odpt:trainInformationStatus")
	private String trainInformationStatus;
	
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getRailway() {
		return railway;
	}
	public void setRailway(String railway) {
		this.railway = railway;
	}
	public String getTrainInformationStatus() {
		return trainInformationStatus;
	}
	public void setTrainInformationStatus(String trainInformationStatus) {
		this.trainInformationStatus = trainInformationStatus;
	}
}
