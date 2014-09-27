package local.iskou9821.tokyometro.api.json;

import java.io.IOException;
import java.text.DateFormat;

import local.iskou9821.tokyometro.api.model.Time;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class TimeDeserializer extends JsonDeserializer<Time> {
	private static ThreadLocal<DateFormat> Formats = new ThreadLocal<DateFormat>();
	
	@Override
	public Time deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		return new Time(jp.getText());
	}

}
