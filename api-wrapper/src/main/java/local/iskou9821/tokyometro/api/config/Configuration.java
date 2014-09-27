package local.iskou9821.tokyometro.api.config;

import local.iskou9821.tokyometro.api.util.ConsumerKeyProvider;

public interface Configuration {
	public String getBaseUrl();
	public String getApiPath();
	public ConsumerKeyProvider getConsumerKeyProvider();
}
