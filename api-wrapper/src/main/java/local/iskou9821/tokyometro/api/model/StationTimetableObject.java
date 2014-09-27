package local.iskou9821.tokyometro.api.model;

import local.iskou9821.tokyometro.api.json.TimeDeserializer;
import local.iskou9821.tokyometro.api.model.property.Time;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

public class StationTimetableObject extends AbsSubModel {
	@JsonProperty("odpt:departureTime")
	@JsonDeserialize(using=TimeDeserializer.class)
	private Time departureTime;
	
	@JsonProperty("odpt:destinationStation")
	private String destinationStation;
	
	@JsonProperty("odpt:trainType")
	private String trainType;
	
	@JsonProperty("odpt:isLast")
	private boolean last = false;
	
	@JsonProperty("odpt:isOrigin")
	private boolean origin = false;
	
	@JsonProperty("odpt:carComposition")
	private Integer carComposition;
	
	@JsonProperty("odpt:notes")
	private String notes;

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public String getTrainType() {
		return trainType;
	}

	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}

	public boolean isLast() {
		return last;
	}

	public void setLast(boolean last) {
		this.last = last;
	}

	public boolean isOrigin() {
		return origin;
	}

	public void setOrigin(boolean origin) {
		this.origin = origin;
	}

	public Integer getCarComposition() {
		return carComposition;
	}

	public void setCarComposition(Integer carComposition) {
		this.carComposition = carComposition;
	}

	public String getNotes() {
		return notes;
	}

	public void setNote(String notes) {
		this.notes = notes;
	}
}
