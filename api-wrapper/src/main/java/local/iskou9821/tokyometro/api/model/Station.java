package local.iskou9821.tokyometro.api.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName("odpt:Station")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Station extends AbsMainModel {
	@JsonProperty("owl:sameAs")
	private String sameAs;
	
	@JsonProperty("dc:title")
	private String title;
	
	@JsonProperty("odpt:railway")
	private String railway;
	
	public String getSameAs() {
		return sameAs;
	}
	public void setSameAs(String sameAs) {
		this.sameAs = sameAs;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRailway() {
		return railway;
	}
	public void setRailway(String railway) {
		this.railway = railway;
	}
	
	
}
