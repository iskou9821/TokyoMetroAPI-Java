package local.iskou9821.tokyometro.api.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.codehaus.jackson.annotate.JsonProperty;

public class AbsMainModel {
	@JsonProperty("@context")
	private String context;
	
	@JsonProperty("@id")
	private String id;
	
	@JsonProperty("@type")
	private String type;
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
}
