package local.iskou9821.tokyometro.api.model.property;

public class StationFacilityLink {
	private String value;

	public StationFacilityLink(String value) {
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
