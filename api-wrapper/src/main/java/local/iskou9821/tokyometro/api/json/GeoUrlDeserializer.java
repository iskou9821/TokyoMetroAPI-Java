package local.iskou9821.tokyometro.api.json;

import java.io.IOException;

import local.iskou9821.tokyometro.api.model.property.GeoDocumentLink;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class GeoUrlDeserializer extends JsonDeserializer<GeoDocumentLink> {

	@Override
	public GeoDocumentLink deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		return new GeoDocumentLink(jp.getText(), GeoDocumentLink.TYPE_URL);
	}

}
