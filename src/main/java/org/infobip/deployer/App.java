package org.infobip.deployer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.infobip.deployer.client.DeployerClient;
import org.infobip.deployer.client.data.Application;
import org.infobip.deployer.client.data.DeployContext;
import org.infobip.deployer.client.data.DeployContextBuilder;
import org.infobip.deployer.client.data.Environment;
import org.infobip.deployer.client.data.Instance;

/**
 *
 * @author adostic
 * @since 24.04.2014 09:29
 */
public class App {
 
	public static void main(String[] args) throws Exception {

		DeployerClient deployerClient = new DeployerClient("http://192.168.3.90:80");

		Map<String, String> installMap = new HashMap<>(4);

		installMap.put("CentOS.10.43", "Task Scheduler");

		Map<String, String> uninstallMap = new HashMap<>(4);

		DeployContext deployContext = (new DeployContextBuilder())
				.installApplicationInstanceMap(installMap)
				.uninstallApplicationInstanceMap(uninstallMap).build();

		final Map<String, Object> result = deployerClient.deploy(deployContext);

		Environment environment = deployerClient.getCurrentState();
		System.out.println(environment);
		List<Application> applications = deployerClient.getApplications();
		System.out.println(applications);

		ArrayList<Instance> status = deployerClient.status();
		System.out.println(status);
	}

}
