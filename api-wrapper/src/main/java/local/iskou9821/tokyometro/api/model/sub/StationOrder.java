package local.iskou9821.tokyometro.api.model.sub;

import org.codehaus.jackson.annotate.JsonProperty;

public class StationOrder extends AbsSubModel {
	@JsonProperty("odpt:station")
	private String station;
	
	@JsonProperty("odpt:index")
	private Integer index;
	
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}	
}
