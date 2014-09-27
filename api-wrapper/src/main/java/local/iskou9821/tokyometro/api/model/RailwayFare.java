package local.iskou9821.tokyometro.api.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName("odpt:RailwayFare")
@JsonIgnoreProperties(ignoreUnknown = true)
public class RailwayFare extends AbsMainModel {
	@JsonProperty("owl:sameAs")
	private String sameAs;
	
	@JsonProperty("odpt:operator")
	private String operator;
	
	@JsonProperty("odpt:fromStation")
	private String fromStation;
	
	@JsonProperty("odpt:toStation")
	private String toStation;
	
	@JsonProperty("odpt:ticketFare")
	private Integer ticketFare;

	public String getSameAs() {
		return sameAs;
	}

	public void setSameAs(String sameAs) {
		this.sameAs = sameAs;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	public Integer getTicketFare() {
		return ticketFare;
	}

	public void setTicketFare(Integer ticketFare) {
		this.ticketFare = ticketFare;
	}
	
	
}
