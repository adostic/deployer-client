package org.infobip.deployer.client.data;

import java.io.Serializable;

/**
 *
 * @author adostic
 * @since 23.04.2014 23:07
 */
public enum DeployMode implements Serializable {
	STOP, DEPLOY_RELEASES, DEPLOY_SNAPSHOTS, REDEPLOY, UNINSTALL
}