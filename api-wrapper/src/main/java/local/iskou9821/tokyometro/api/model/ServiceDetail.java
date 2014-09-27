package local.iskou9821.tokyometro.api.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import local.iskou9821.tokyometro.api.json.TimeDeserializer;
import local.iskou9821.tokyometro.api.model.property.Time;

public class ServiceDetail {
	@JsonProperty("ugsrv:serviceStartTime")
	@JsonDeserialize(using=TimeDeserializer.class)
	private Time serviceStartTime;

	@JsonProperty("ugsrv:serviceEndTime")
	@JsonDeserialize(using=TimeDeserializer.class)
	private Time serviceEndTime;
	
	@JsonProperty("odpt:operationDay")
	private String operationDay;
	
	@JsonProperty("ug:direction")
	private String direction;

	public Time getServiceStartTime() {
		return serviceStartTime;
	}

	public void setServiceStartTime(Time serviceStartTime) {
		this.serviceStartTime = serviceStartTime;
	}

	public Time getServiceEndTime() {
		return serviceEndTime;
	}

	public void setServiceEndTime(Time serviceEndTime) {
		this.serviceEndTime = serviceEndTime;
	}

	public String getOperationDay() {
		return operationDay;
	}

	public void setOperationDay(String operationDay) {
		this.operationDay = operationDay;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}	
}
