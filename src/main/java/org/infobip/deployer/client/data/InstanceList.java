package org.infobip.deployer.client.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author adostic
 * @since 29.10.2014 7:47:47 PM
 */
public class InstanceList implements Serializable {
	private ArrayList<Instance> allInstances;

	public ArrayList<Instance> getAllInstances() {
		return allInstances;
	}

	public void setAllInstances(ArrayList<Instance> allInstances) {
		this.allInstances = allInstances;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 73 * hash + Objects.hashCode(this.allInstances);
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
		final InstanceList other = (InstanceList) obj;
		if (!Objects.equals(this.allInstances, other.allInstances)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "InstanceList{" + "allInstances=" + allInstances + '}';
	}

}
