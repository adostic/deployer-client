package org.infobip.deployer.client.data;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author adostic
 * @since 29.10.2014 7:29:14 PM
 */
public class ApplicationList {
	private ArrayList<Application> applicationList;

	public ArrayList<Application> getApplicationList() {
		return applicationList;
	}

	public void setApplicationList(ArrayList<Application> applicationList) {
		this.applicationList = applicationList;
	}

	@Override
	public String toString() {
		return "ApplicationList{" + "applicationList=" + applicationList + '}';
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 97 * hash + Objects.hashCode(this.applicationList);
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
		final ApplicationList other = (ApplicationList) obj;
		if (!Objects.equals(this.applicationList, other.applicationList)) {
			return false;
		}
		return true;
	}
	
}
