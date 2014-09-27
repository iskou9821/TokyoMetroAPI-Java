package local.iskou9821.tokyometro.api.model.property;

public class GeoJson {
	private String url;

	public GeoJson() {
		super();
	}

	public GeoJson(String url) {
		super();
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return url;
	}
	
}
