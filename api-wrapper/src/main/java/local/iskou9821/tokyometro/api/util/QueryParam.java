package local.iskou9821.tokyometro.api.util;

public class QueryParam {
	private String key;
	private String value;
	public QueryParam() {
		super();
	}
	public QueryParam(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
