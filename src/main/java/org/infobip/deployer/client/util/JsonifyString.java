package org.infobip.deployer.client.util;

import java.io.IOException;
import java.util.ArrayList;
import jregex.Matcher;
import jregex.Pattern;
import org.apache.commons.collections.map.MultiValueMap;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author adostic
 * @since 24.04.2014 08:57
 */
public class JsonifyString {

	private JsonifyString() {
	}

	public static String toJson(String data) {
		if (isValidJson(data)) {
			return data;
		}
		return jsonify(data);
	}

	private static boolean isValidJson(String json) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.readValue(StringEscapeUtils.unescapeHtml(json), MultiValueMap.class);
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	private static String jsonify(String notJson) {
		ArrayList<String> jsonTuples = new ArrayList<String>();

		String[] tuples = notJson.split(",");
		for (String tuple : tuples) {
			jsonTuples.add(quote(tuple));
		}
		return StringUtils.join(jsonTuples, ",");
	}

	private static String quote(String tuple) {
		Pattern quotedPattern = new Pattern("^({left_curly}\\{?)\"?({key}.*?)\"?:\"?({value}.*?)\"?({right_curly}\\}?)$");
		Matcher matcher = quotedPattern.matcher(tuple);
		if (matcher.matches()) {
			return matcher.group("left_curly") + "\"" + matcher.group("key") + "\":\"" + matcher.group("value") + "\"" + matcher.group("right_curly");
		}
		return tuple;
	}
}
