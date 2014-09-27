package local.iskou9821.tokyometro.api.json;

import java.io.IOException;

import local.iskou9821.tokyometro.api.model.property.ConnectingRailway;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class ConnectingRailwayDeserializer extends JsonDeserializer<ConnectingRailway> {

	@Override
	public ConnectingRailway deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		return new ConnectingRailway(jp.getText());
	}

}
