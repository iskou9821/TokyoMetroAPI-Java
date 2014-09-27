package local.iskou9821.tokyometro.api.util.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import local.iskou9821.tokyometro.api.util.ConsumerKeyProvider;

public class PropertyFileConsumerKeyProviderImpl implements ConsumerKeyProvider {
	private String fileName;
	
	public PropertyFileConsumerKeyProviderImpl(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public String get() {
		try (InputStream input = new FileInputStream(fileName)) {
			Properties ps =new Properties();
			ps.load(input);
			return ps.getProperty("auth.consumer_key");
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}
}
