package org.infobip.deployer.client.data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author adostic
 */
public class Environment implements Serializable {
    private List<Server> serverList;
    private List<DeployedInstance> listOfDeployedApplications;

    public Environment(List<Server> serverList, List<DeployedInstance> listOfDeployedApplications) {
        this.serverList = serverList;
        this.listOfDeployedApplications = listOfDeployedApplications;
    }

    public List<Server> getServerList() {
        return Collections.unmodifiableList(serverList);
    }

    public void setServerList(List<Server> serverList) {
        this.serverList = Collections.unmodifiableList(serverList);
    }

    public List<DeployedInstance> getListOfDeployedApplications() {
        return Collections.unmodifiableList(listOfDeployedApplications);
    }

    public void setListOfDeployedApplications(List<DeployedInstance> listOfDeployedApplications) {
        this.listOfDeployedApplications = Collections.unmodifiableList(listOfDeployedApplications);
    }
}
