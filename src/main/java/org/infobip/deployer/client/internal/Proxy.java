package org.infobip.deployer.client.internal;

import java.io.IOException;
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
import org.infobip.deployer.client.util.JsonUtil;

/**
 *
 * @author adostic
 * @since 23.04.2014 23:23
 */
public class Proxy {

	private String deployerUrl;

	public Proxy(String deployerUrl) throws Exception {
		if (StringUtils.isEmpty(deployerUrl)) {
			throw new Exception("DeployerUrl is missing");
		}

		this.deployerUrl = deployerUrl;
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> get(String action) throws Exception {
		return execute(new HttpGet(deployerUrl + "/" + action), Map.class);
	}

	public <T> T get(String action, Class<T> clazz) throws Exception {
		return execute(new HttpGet(deployerUrl + "/" + action), clazz);
	}

	public Map<String, Object> post(String action, List<NameValuePair> data) throws Exception {
		HttpPost request = new HttpPost(deployerUrl + "/" + action);
		if (data != null) {
			request.setEntity(new UrlEncodedFormEntity(data, HTTP.UTF_8));
		}
		return execute(request);
	}

	@SuppressWarnings("unchecked")
	private Map<String, Object> execute(HttpUriRequest request) throws Exception {
		return execute(request, Map.class);
	}

	private <T> T execute(HttpUriRequest request, Class<T> clazz) throws Exception {
		return JsonUtil.getObject(executeMethod(request), clazz);
	}

	private String executeMethod(HttpUriRequest request) throws IOException {
		DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		return defaultHttpClient.execute(request, responseHandler);
	}



}
