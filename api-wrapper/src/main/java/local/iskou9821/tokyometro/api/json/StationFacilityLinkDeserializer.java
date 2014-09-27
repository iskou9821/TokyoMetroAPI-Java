package local.iskou9821.tokyometro.api.json;

import java.io.IOException;

import local.iskou9821.tokyometro.api.model.property.StationFacilityLink;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class StationFacilityLinkDeserializer extends JsonDeserializer<StationFacilityLink> {

	@Override
	public StationFacilityLink deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		return new StationFacilityLink(jp.getText());
	}

}
