package local.iskou9821.tokyometro.api;

import junit.framework.TestCase;
import local.iskou9821.tokyometro.api.util.ConsumerKeyProvider;
import local.iskou9821.tokyometro.api.util.impl.PropertyFileConsumerKeyProviderImpl;

public class AbsApiTest extends TestCase {
	public String getKey() {
		return getConsumerKeyProvider().get();
	}
	
	public ConsumerKeyProvider getConsumerKeyProvider() {
		return new PropertyFileConsumerKeyProviderImpl("src/test/resources/tokyo-metro.properties");
	}
}
