package org.infobip.deployer.client.data;

/**
 *
 * @author adostic
 */
public class Application {
    
    private Integer id;
    private Integer applicationId;
    private String applicationName;
    private String ram;
    private String diskSpace;
    private String cpu;

    public Application() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(String diskSpace) {
        this.diskSpace = diskSpace;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Application{" + "id=" + id + ", applicationId=" + applicationId + ", applicationName=" + applicationName + ", ram=" + ram + ", diskSpace=" + diskSpace + ", cpu=" + cpu + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 71 * hash + (this.applicationId != null ? this.applicationId.hashCode() : 0);
        hash = 71 * hash + (this.applicationName != null ? this.applicationName.hashCode() : 0);
        hash = 71 * hash + (this.ram != null ? this.ram.hashCode() : 0);
        hash = 71 * hash + (this.diskSpace != null ? this.diskSpace.hashCode() : 0);
        hash = 71 * hash + (this.cpu != null ? this.cpu.hashCode() : 0);
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
        final Application other = (Application) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.applicationId != other.applicationId && (this.applicationId == null || !this.applicationId.equals(other.applicationId))) {
            return false;
        }
        if ((this.applicationName == null) ? (other.applicationName != null) : !this.applicationName.equals(other.applicationName)) {
            return false;
        }
        if ((this.ram == null) ? (other.ram != null) : !this.ram.equals(other.ram)) {
            return false;
        }
        if ((this.diskSpace == null) ? (other.diskSpace != null) : !this.diskSpace.equals(other.diskSpace)) {
            return false;
        }
        if ((this.cpu == null) ? (other.cpu != null) : !this.cpu.equals(other.cpu)) {
            return false;
        }
        return true;
    }
    
    
}
