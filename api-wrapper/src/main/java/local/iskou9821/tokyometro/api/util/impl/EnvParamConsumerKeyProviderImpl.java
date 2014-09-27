package local.iskou9821.tokyometro.api.util.impl;

import local.iskou9821.tokyometro.api.util.ConsumerKeyProvider;

public class EnvParamConsumerKeyProviderImpl implements ConsumerKeyProvider {
	private String name = "TOKYOMETRO_CONSUMER_KEY";
	
	public EnvParamConsumerKeyProviderImpl(String name) {
		super();
		this.name = name;
	}

	@Override
	public String get() {
		return System.getenv(name);
	}

}
