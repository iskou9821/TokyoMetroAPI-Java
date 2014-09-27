package local.iskou9821.tokyometro.api.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName("odpt:PassengerSurvey")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PassengerSurvey extends AbsMainModel {
	@JsonProperty("owl:sameAs")
	private String sameAs;
	
	@JsonProperty("odpt:operator")
	private String operator;
	
	@JsonProperty("odpt:surveyYear")
	private Integer surveyYear;

	@JsonProperty("odpt:passengerJourneys")
	private Integer passengerJourneys;
	
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

	public Integer getSurveyYear() {
		return surveyYear;
	}

	public void setSurveyYear(Integer surveyYear) {
		this.surveyYear = surveyYear;
	}
}
