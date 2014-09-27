package local.iskou9821.tokyometro.api.model;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName("odpt:StationFacility")
public class StationFacility extends AbsMainModel {
	@JsonProperty("owl:sameAs")
	private String sameAs;
	
	@JsonProperty("dc:date")
	private Date date;
	
	@JsonProperty("odpt:barrierfreeFacility")
	private List<BarrierfreeFacility> barrierfreeFacilities;

	@JsonProperty("odpt:platformInformation")
	private List<PlatformInformation> platformInformations;
	
	public String getSameAs() {
		return sameAs;
	}

	public void setSameAs(String sameAs) {
		this.sameAs = sameAs;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<BarrierfreeFacility> getBarrierfreeFacilities() {
		return barrierfreeFacilities;
	}

	public void setBarrierfreeFacilities(
			List<BarrierfreeFacility> barrierfreeFacilities) {
		this.barrierfreeFacilities = barrierfreeFacilities;
	}

	public List<PlatformInformation> getPlatformInformations() {
		return platformInformations;
	}

	public void setPlatformInformations(
			List<PlatformInformation> platformInformations) {
		this.platformInformations = platformInformations;
	}
}
