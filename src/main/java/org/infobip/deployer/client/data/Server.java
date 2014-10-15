package org.infobip.deployer.client.data;

/**
 *
 * @author adostic
 * @since 12.05.2014 22:01
 */
public class Server {

	private int id;
	private String name;
	private String cpu;
	private Integer memory;
	private Integer hddId;
	private String cpuCores;
	private String hddSize;

	public Server() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
	}

	public void setHddId(Integer hddId) {
		this.hddId = hddId;
	}

	public String getName() {
		return this.name;
	}

	public String getCpu() {
		return this.cpu;
	}

	public Integer getMemory() {
		return this.memory;
	}

	public Integer getHddId() {
		return this.hddId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public String getCpuCores() {
		return cpuCores;
	}

	public void setCpuCores(String cpuCores) {
		this.cpuCores = cpuCores;
	}

	public String getHddSize() {
		return hddSize;
	}

	public void setHddSize(String hddSize) {
		this.hddSize = hddSize;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Server other = (Server) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Server{" + "id=" + id + ", name=" + name + ", cpu=" + cpu + ", memory=" + memory + ", hddId=" + hddId + ", cpuCores=" + cpuCores + ", hddSize=" + hddSize + '}';
	}

}
