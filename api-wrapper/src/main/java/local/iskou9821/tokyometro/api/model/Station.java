package local.iskou9821.tokyometro.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName("odpt:Station")
@XmlRootElement(name="odpt:Station")
@XmlAccessorType(XmlAccessType.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Station {
	@XmlAttribute(name="owl:sameAs")
	@JsonProperty("owl:sameAs")
	private String id;
	
	@XmlAttribute(name="dc:title")
	@JsonProperty("dc:title")
	private String title;
	
	@XmlAttribute(name="odpt:railway")
	@JsonProperty("odpt:railway")
	private String railway;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
