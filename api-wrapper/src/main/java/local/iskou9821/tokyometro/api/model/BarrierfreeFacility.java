package local.iskou9821.tokyometro.api.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class BarrierfreeFacility extends AbsMainModel {
	@JsonProperty("owl:sameAs")
	private String sameAs;
	
	@JsonProperty("ugsrv:categoryName")
	private String categoryName;
	
	@JsonProperty("odpt:placeName")
	private String placeName;
	
	@JsonProperty("odpt:locatedAreaName")
	private String locatedAreaName;
	
	@JsonProperty("ugsrv:remark")
	private String remark;
	
	@JsonProperty("spac:hasAssistant")
	private List<String> hasAssistant;
	
	@JsonProperty("spac:isAvailableTo")
	private String isAvailableTo;
	
	@JsonProperty("odpt:serviceDetail")
	private List<ServiceDetail> serviceDetails;
	
	public String getSameAs() {
		return sameAs;
	}
	public void setSameAs(String sameAs) {
		this.sameAs = sameAs;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getLocatedAreaName() {
		return locatedAreaName;
	}
	public void setLocatedAreaName(String locatedAreaName) {
		this.locatedAreaName = locatedAreaName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public List<String> getHasAssistant() {
		return hasAssistant;
	}
	public void setHasAssistant(List<String> hasAssistant) {
		this.hasAssistant = hasAssistant;
	}
	public String getIsAvailableTo() {
		return isAvailableTo;
	}
	public void setIsAvailableTo(String isAvailableTo) {
		this.isAvailableTo = isAvailableTo;
	}
	public List<ServiceDetail> getServiceDetails() {
		return serviceDetails;
	}
	public void setServiceDetails(List<ServiceDetail> serviceDetails) {
		this.serviceDetails = serviceDetails;
	}
}
