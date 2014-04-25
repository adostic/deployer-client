package org.infobip.deployer.client.data;

import java.io.IOException;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author adostic
 * @since 25.04.2014 13:22
 */
public class DeployContextBuilder {

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	private String uninstallApplicationInstances;
	private String installApplicationInstances;

	public DeployContextBuilder() {
	}

	public DeployContextBuilder uninstallApplicationInstanceMap(Map<String, String> uninstallApplicationInstanceMap) throws IOException {
		this.uninstallApplicationInstances = OBJECT_MAPPER.writeValueAsString(uninstallApplicationInstanceMap);
		return this;
	}

	public DeployContextBuilder installApplicationInstanceMap(Map<String, String> installApplicationInstanceMap) throws IOException {
		this.installApplicationInstances = OBJECT_MAPPER.writeValueAsString(installApplicationInstanceMap);
		return this;
	}

	public DeployContext build() {
		DeployContext deployContext = new DeployContext();
		deployContext.setUninstallApplicationInstances(uninstallApplicationInstances);
		deployContext.setInstallApplicationInstances(installApplicationInstances);
		return deployContext;
	}
}
