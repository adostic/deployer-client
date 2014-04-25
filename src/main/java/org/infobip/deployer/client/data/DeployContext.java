package org.infobip.deployer.client.data;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author adostic
 * @since 23.04.2014 23:09
 */
public class DeployContext implements Serializable {
	private static final long serialVersionUID = 1L;

	private String uninstallApplicationInstances;
	private String installApplicationInstances;

	public DeployContext() {
	}

	public String getUninstallApplicationInstances() {
		return uninstallApplicationInstances;
	}

	public void setUninstallApplicationInstances(String uninstallApplicationInstances) {
		this.uninstallApplicationInstances = uninstallApplicationInstances;
	}

	public String getInstallApplicationInstances() {
		return installApplicationInstances;
	}

	public void setInstallApplicationInstances(String installApplicationInstances) {
		this.installApplicationInstances = installApplicationInstances;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 53 * hash + Objects.hashCode(this.uninstallApplicationInstances);
		hash = 53 * hash + Objects.hashCode(this.installApplicationInstances);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final DeployContext other = (DeployContext) obj;
		if (!Objects.equals(this.uninstallApplicationInstances, other.uninstallApplicationInstances)) {
			return false;
		}
		if (!Objects.equals(this.installApplicationInstances, other.installApplicationInstances)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "DeployContext{" + "uninstallApplicationInstances=" + uninstallApplicationInstances + ", installApplicationInstances=" + installApplicationInstances + '}';
	}
}
