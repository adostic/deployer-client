package org.infobip.deployer.client.data;

import java.util.Objects;

/**
 *
 * @author adostic
 * @since 12.05.2014 22:01
 */
public class DeployedInstance {

	private Integer id;
	private Integer applicationInstanceId;
	private Boolean isDeployed;

	public DeployedInstance() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getApplicationInstanceId() {
		return applicationInstanceId;
	}

	public void setApplicationInstanceId(Integer applicationInstanceId) {
		this.applicationInstanceId = applicationInstanceId;
	}

	public Boolean isIsDeployed() {
		return isDeployed;
	}

	public void setIsDeployed(Boolean isDeployed) {
		this.isDeployed = isDeployed;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 53 * hash + Objects.hashCode(this.id);
		hash = 53 * hash + Objects.hashCode(this.applicationInstanceId);
		hash = 53 * hash + Objects.hashCode(this.isDeployed);
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
		if (!Objects.equals(this.applicationInstanceId, other.applicationInstanceId)) {
			return false;
		}
		if (!Objects.equals(this.isDeployed, other.isDeployed)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "DeployedInstance{" + "id=" + id + ", applicationInstanceId=" + applicationInstanceId + ", isDeployed=" + isDeployed + '}';
	}

}