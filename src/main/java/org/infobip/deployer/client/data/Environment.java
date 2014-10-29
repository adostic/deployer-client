package org.infobip.deployer.client.data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author adostic
 */
public class Environment implements Serializable {
    private ArrayList<Server> serverList;
    private ArrayList<DeployedInstance> applicationList;

	public Environment() {
	}

//    public Environment(List<Server> serverList, List<DeployedInstance> listOfDeployedApplications) {
//        this.serverList = serverList;
//        this.listOfDeployedApplications = listOfDeployedApplications;
//    }

    public ArrayList<Server> getServerList() {
        return serverList;
    }

    public void setServerList(ArrayList<Server> serverList) {
        this.serverList = serverList;
    }

    public ArrayList<DeployedInstance> getApplicationList() {
        return applicationList;
    }

    public void setApplicationList(ArrayList<DeployedInstance> applicationList) {
        this.applicationList = applicationList;
    }

	@Override
	public String toString() {
		return "Environment{" + "serverList=" + serverList + ", applicationList=" + applicationList + '}';
	}

	
}
