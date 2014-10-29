package org.infobip.deployer.client.data;

import java.util.Objects;

/**
 *
 * @author adostic
 * @since 12.05.2014 22:01
 */
public class DeployedInstance {

	private Integer id;
	private String applicationName;
	private String serverName;
	private Boolean isDeployed;

	public DeployedInstance() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean isIsDeployed() {
		return isDeployed;
	}

	public void setIsDeployed(Boolean isDeployed) {
		this.isDeployed = isDeployed;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 41 * hash + Objects.hashCode(this.id);
		hash = 41 * hash + Objects.hashCode(this.applicationName);
		hash = 41 * hash + Objects.hashCode(this.serverName);
		hash = 41 * hash + Objects.hashCode(this.isDeployed);
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
		final DeployedInstance other = (DeployedInstance) obj;
		if (!Objects.equals(this.id, other.id)) {
			return false;
		}
		if (!Objects.equals(this.applicationName, other.applicationName)) {
			return false;
		}
		if (!Objects.equals(this.serverName, other.serverName)) {
			return false;
		}
		if (!Objects.equals(this.isDeployed, other.isDeployed)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "DeployedInstance{" + "id=" + id + ", applicationName=" + applicationName + ", serverName=" + serverName + ", isDeployed=" + isDeployed + '}';
	}

	
}