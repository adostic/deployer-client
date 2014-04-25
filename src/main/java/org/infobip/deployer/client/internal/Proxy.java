package org.infobip.deployer.client.internal;

import java.util.List;
import java.util.Map;
import org.apache.commons.lang.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author adostic
 * @since 23.04.2014 23:23
 */
public class Proxy {

	private String deplpyerUrl;

	public Proxy(String deployerUrl) throws Exception {
		if (StringUtils.isEmpty(deployerUrl)) {
			throw new Exception("DeployerUrl is missing");
		}

		this.deplpyerUrl = deployerUrl;
	}

	public Map<String, Object> get(String action) throws Exception {
		return execute(new HttpGet(deplpyerUrl + "/" + action));
	}

	public Map<String, Object> post(String action, List<NameValuePair> data) throws Exception {
		HttpPost request = new HttpPost(deplpyerUrl + "/" + action);
		if (data != null) {
			request.setEntity(new UrlEncodedFormEntity(data, HTTP.UTF_8));
		}
		return execute(request);
	}

	private Map<String, Object> execute(HttpUriRequest request) throws Exception {


		DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		String result = defaultHttpClient.execute(request, responseHandler);

		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> mappedJson = mapper.readValue(result, Map.class);

		return mappedJson;
	}
}
