package local.iskou9821.tokyometro.api.model.property;

public class GeoDocumentLink {
	public static final int TYPE_URL = 1;
	public static final int TYPE_URN = 2;
	
	private String value;
	private int type = TYPE_URL;
	
	public GeoDocumentLink(String value, int type) {
		super();
		this.value = value;
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "type=" +type + " / value=" + value;
	}
	
}
