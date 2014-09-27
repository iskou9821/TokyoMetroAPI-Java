package local.iskou9821.tokyometro.api.model.property;

public class PassengerSurveyLink {
	private String value;

	public PassengerSurveyLink(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
