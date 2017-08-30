package com.sherwin.app;

import com.sherwin.app.bean.Application;
import com.sherwin.profile.bean.Profile;
import com.sherwin.webserver.bean.WebServer;
import com.sherwin.yaml.ReadYAML;

public class ApplicationConfiguration {
	
	
	ReadYAML readYAML;
	Application applicationConfiguration;
	


	public ApplicationConfiguration(){
		readYAML = new ReadYAML();
	}
	
	public ApplicationConfiguration(String fileName){
		readYAML = new ReadYAML();
		LoadApplicationConfigurationFromYAMLFile(fileName);
	}
	
	public Application getApplicationConfiguration() {
		return applicationConfiguration;
	}

	public void setApplicationConfiguration(Application applicationConfiguration) {
		this.applicationConfiguration = applicationConfiguration;
	}

	public void LoadApplicationConfigurationFromYAMLFile(String fileName){
		setApplicationConfiguration( readYAML.parseYAMLFiletoClass(fileName, Application.class));		
	} 
	
	
	public WebServer getWebServerConfiguration(){		
		return applicationConfiguration.getWebserver();
	}
	
		

}
