package org.infobip.deployer.client.data;

/**
 * Created by: elvanja
 * Date: 1/23/13
 * Time: 1:49 PM
 */
public class Instance {
    private String id;
    private String serverId;
    private String applicationId;
    private String serviceName;

	public Instance() {
	}

    public Instance(String id, String serverId, String applicationId, String serviceName) {
        this.id = id;
        this.serverId = serverId;
        this.applicationId = applicationId;
        this.serviceName = serviceName;
    }

	public void setId(String id) {
		this.id = id;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

    public String getId() {
        return id;
    }

    public String getServerId() {
        return serverId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getServiceName() {
        return serviceName;
    }

	@Override
	public String toString() {
		return "Instance{" + "id=" + id + ", serverId=" + serverId + ", applicationId=" + applicationId + ", serviceName=" + serviceName + '}';
	}

}
