package local.iskou9821.tokyometro.api.util.impl;

import local.iskou9821.tokyometro.api.util.ConsumerKeyProvider;

public class SystemPropertyConsumerKeyProviderImpl implements ConsumerKeyProvider {
	private String propertyName = "TokyoMetro.consumerKey";

	public SystemPropertyConsumerKeyProviderImpl() {
		super();
	}

	public SystemPropertyConsumerKeyProviderImpl(String propertyName) {
		super();
		this.propertyName = propertyName;
	}
	
	@Override
	public String get() {
		return System.getProperty(propertyName);
	}

}
