package local.iskou9821.tokyometro.api.model;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName("odpt:TrainInformation")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainInformation extends AbsSubModel  {
	@JsonProperty("odpt:operatorr")
	private String operator;
	
	@JsonProperty("dc:date")
	private Date date;
	
	@JsonProperty("dct:valid")
	private Date valid;
	
	@JsonProperty("odpt:timeOfOrigin")
	private Date timeOfOrigin;
	
	@JsonProperty("odpt:railway")
	private String railway;
	
	@JsonProperty("odpt:trainInformationStatus")
	private String trainInformationStatus;
	
	@JsonProperty("odpt:trainInformationText")
	private String trainInformationText;
	
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getValid() {
		return valid;
	}
	public void setValid(Date valid) {
		this.valid = valid;
	}
	public Date getTimeOfOrigin() {
		return timeOfOrigin;
	}
	public void setTimeOfOrigin(Date timeOfOrigin) {
		this.timeOfOrigin = timeOfOrigin;
	}
	public String getTrainInformationText() {
		return trainInformationText;
	}
	public void setTrainInformationText(String trainInformationText) {
		this.trainInformationText = trainInformationText;
	}
}
