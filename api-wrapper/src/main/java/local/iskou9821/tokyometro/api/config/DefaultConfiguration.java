package local.iskou9821.tokyometro.api.config;

import local.iskou9821.tokyometro.api.util.ConsumerKeyProvider;

public class DefaultConfiguration implements Configuration {
	private String baseUrl = "https://api.tokyometroapp.jp/api/v2/";
	private String apiPath = "datapoints";
	private ConsumerKeyProvider consumerKeyProvider;
	
	public DefaultConfiguration() {
		super();
	}
	public DefaultConfiguration(ConsumerKeyProvider consumerKeyProvider) {
		super();
		this.consumerKeyProvider = consumerKeyProvider;
	}
	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	public String getApiPath() {
		return apiPath;
	}
	public void setApiPath(String apiPath) {
		this.apiPath = apiPath;
	}
	public ConsumerKeyProvider getConsumerKeyProvider() {
		return consumerKeyProvider;
	}
	public void setConsumerKeyProvider(ConsumerKeyProvider consumerKeyProvider) {
		this.consumerKeyProvider = consumerKeyProvider;
	}
}
