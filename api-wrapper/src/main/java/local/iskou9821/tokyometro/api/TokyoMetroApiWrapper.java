package local.iskou9821.tokyometro.api;


import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonTypeName;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import local.iskou9821.tokyometro.api.config.Configuration;
import local.iskou9821.tokyometro.api.util.QueryParam;

public class TokyoMetroApiWrapper {
	private Logger log = LoggerFactory.getLogger(TokyoMetroApiWrapper.class);
	
	private Configuration configuration;
	private List<QueryParam> innerParams = null;
	
	private TokyoMetroApiWrapper(Configuration configuration, List<QueryParam> innerParams) {
		super();
		this.configuration = configuration;
		this.innerParams = innerParams;
	}
	
	public TokyoMetroApiWrapper(Configuration configuration) {
		super();
		this.configuration = configuration;
	}
	
	public TokyoMetroApiWrapper queryParam(String key, String value) {
		if (innerParams == null) {
			innerParams =new ArrayList<QueryParam>();
		}
		innerParams.add(new QueryParam(key, value));
		return new TokyoMetroApiWrapper(configuration, innerParams);
	}
	
	public <T> List<T> get(Class<T> clazz) {
		return this.get(clazz, innerParams);
	}
	
	public <T> List<T> get(Class<T> clazz, List<QueryParam> params)  {
		
		Client client = Client.create();
		//ClientResponse s =  
		WebResource resource = 
		client.resource(configuration.getBaseUrl())
				.path(configuration.getApiPath())
				.queryParam("rdf:type", clazz.getAnnotation(JsonTypeName.class).value());
		
		if (params != null) {
			for (QueryParam param : params) {
				resource = resource.queryParam(param.getKey(), param.getValue());
			}
		}
		log.debug("query url(*without consumer-key) -> " + resource.toString());
		
		ClientResponse s =  
				resource.queryParam("acl:consumerKey", configuration.getConsumerKeyProvider().get())
					.get(ClientResponse.class);
		
		String json = s.getEntity(String.class);
		log.debug("string received from Server -> " + json);
		
		@SuppressWarnings("unchecked")
		T[] ts = (T[])Array.newInstance(clazz, 0);
		
		ObjectMapper m = new ObjectMapper();
		
		@SuppressWarnings("unchecked")
		List<T> res;
		try {
			res = (List<T>)Lists.newArrayList((T[])m.readValue(json, ts.getClass()));
			return res;
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}		
	}
}
