package org.infobip.deployer.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jackson.map.ObjectMapper;
import org.infobip.deployer.client.data.Application;
import org.infobip.deployer.client.data.DeployContext;
import org.infobip.deployer.client.data.Environment;
import org.infobip.deployer.client.internal.Proxy;

/**
 *
 * @author adostic
 * @since 23.04.2014 23:20
 */
public class DeployerClient {

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	private static final String DEPLOY_ACTION = "deploy";
	private static final String STATUS_ACTION = "status";
	private static final String CURRENT_STATE_ACTION = "getCurrentState";
	private Proxy proxy;


	public DeployerClient(String uri) throws Exception {
		this.proxy = new Proxy(uri);
	}

	public Map<String, Object> deploy(DeployContext deployContext) throws Exception {
		final List<NameValuePair> basicNameValuePairs = new ArrayList<NameValuePair>(1);

		final BasicNameValuePair deployContextPair = new BasicNameValuePair("deployContext", OBJECT_MAPPER.writeValueAsString(deployContext));
		basicNameValuePairs.add(deployContextPair);
		return proxy.post(DEPLOY_ACTION, basicNameValuePairs);
	}

	public Map<String, Object> status() throws Exception {
		return proxy.get(STATUS_ACTION);
	}

	public Environment getCurrentState() throws Exception {
		return proxy.get(CURRENT_STATE_ACTION, Environment.class);
	}

	@SuppressWarnings("unchecked")
	public List<Application> getApplications() throws Exception {
		return proxy.get(DEPLOY_ACTION, List.class);
	}
}