package com.sherwin.profile.bean;

import com.sherwin.build.bean.Build;
import com.sherwin.deploy.bean.Deploy;

public class Profile {
	
	private Build build;
	private Deploy deploy;
	
	public Build getBuild() {
		return build;
	}
	public void setBuild(Build build) {
		this.build = build;
	}
	public Deploy getDeploy() {
		return deploy;
	}
	public void setDeploy(Deploy deploy) {
		this.deploy = deploy;
	}
	
}
