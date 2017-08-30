package com.sherwin.app.bean;

import java.util.List;
import java.util.Map;

import com.sherwin.webserver.bean.WebServer;

public class Application {
	
	private String name;
	private String description;
	private Map<String, String> urls;
	private List<String> app_server_url;
	private Map<String, String> dependencies;
	private WebServer webserver;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Map<String, String> getUrls() {
		return urls;
	}
	public void setUrls(Map<String, String> urls) {
		this.urls = urls;
	}
	public List<String> getApp_server_url() {
		return app_server_url;
	}
	public void setApp_server_url(List<String> app_server_url) {
		this.app_server_url = app_server_url;
	}
	public Map<String, String> getDependencies() {
		return dependencies;
	}
	public void setDependencies(Map<String, String> dependencies) {
		this.dependencies = dependencies;
	}
	public WebServer getWebserver() {
		return webserver;
	}
	public void setWebserver(WebServer webserver) {
		this.webserver = webserver;
	}
		
	
}
