package org.infobip.deployer.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jackson.map.ObjectMapper;
import org.infobip.deployer.client.data.DeployContext;
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
	private Proxy proxy;


	public DeployerClient(Proxy proxy) {
		this.proxy = proxy;
	}

	public Map<String, Object> deploy(DeployContext deployContext) throws Exception {
		final List<NameValuePair> basicNameValuePairs = new ArrayList<NameValuePair>(1);

		final BasicNameValuePair deployContextPair = new BasicNameValuePair("deployContext", OBJECT_MAPPER.writeValueAsString(deployContext));
		basicNameValuePairs.add(deployContextPair);
		System.out.println(deployContextPair);

		return proxy.post(DEPLOY_ACTION, basicNameValuePairs);
	}

	public Map<String, Object> status() throws Exception {
		return proxy.get(STATUS_ACTION);
	}

	public void test() throws Exception {
//		proxy.get(DEPLOY_ACTION + "/test");
		final List<NameValuePair> basicNameValuePairs = new ArrayList<NameValuePair>(1);

		basicNameValuePairs.add(new BasicNameValuePair("serverId", "2"));

		proxy.post(DEPLOY_ACTION + "/test", basicNameValuePairs);
	}

}
