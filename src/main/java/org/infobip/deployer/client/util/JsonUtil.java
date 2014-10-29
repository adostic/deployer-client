package org.infobip.deployer.client.util;

import java.io.IOException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.DeserializationProblemHandler;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author adostic
 * @since 25.04.2014 12:57
 */
public class JsonUtil {

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	static {
		OBJECT_MAPPER.getDeserializationConfig().addHandler(new DeserializationProblemHandler() {
			@Override
			public boolean handleUnknownProperty(DeserializationContext ctxt,
					JsonDeserializer<?> deserializer,
					Object beanOrClass,
					String propertyName) throws IOException, JsonProcessingException {
				//ignore unknown properties!!!
				return true;
			}
		});
//		OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}


	private JsonUtil() {
	}

	public static <T> T getObject(String json, Class<T> clazz) throws IOException {
		return OBJECT_MAPPER.readValue(json, clazz);
	}
}
