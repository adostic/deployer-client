package org.infobip.deployer;

import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.infobip.deployer.client.DeployerClient;
import org.infobip.deployer.client.data.DeployContext;
import org.infobip.deployer.client.data.DeployContextBuilder;
import org.infobip.deployer.client.internal.Proxy;

/**
 *
 * @author adostic
 * @since 24.04.2014 09:29
 */
public class App {

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
 
	public static void main(String[] args) throws Exception {
		final Proxy proxy = new Proxy("http://localhost:8080");
		DeployerClient deployerClient = new DeployerClient(proxy);

		Map<String, String> installMap = new HashMap<>(4);
		installMap.put("CentOS.10.43", "Task Scheduler");

		Map<String, String> uninstallMap = new HashMap<>(4);

		DeployContext deployContext = (new DeployContextBuilder())
				.installApplicationInstanceMap(installMap)
				.uninstallApplicationInstanceMap(uninstallMap).build();

		deployerClient.deploy(deployContext);
		

	}

}
