package com.sherwin.deploy.bean;

import java.util.List;

public class Deploy {
	
	private List environments;
	private List server_names;
	private List server_urls;
	private List tags;
		
	public List getEnvironments() {
		return environments;
	}
	public void setEnvironments(List environment) {
		this.environments = environment;
	}
	public List getServer_names() {
		return server_names;
	}
	public void setServer_names(List server_names) {
		this.server_names = server_names;
	}
	public List getServer_urls() {
		return server_urls;
	}
	public void setServer_urls(List server_urls) {
		this.server_urls = server_urls;
	}
	public List getTags() {
		return tags;
	}
	public void setTags(List tags) {
		this.tags = tags;
	}
	
}
