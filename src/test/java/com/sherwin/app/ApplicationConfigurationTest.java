package com.sherwin.app;

import org.junit.Ignore;
import org.junit.Test;

import com.sherwin.build.bean.Build;
import com.sherwin.profile.ProfileBuilder;

public class ApplicationConfigurationTest {
	

	
	private ApplicationConfiguration applicationConfiguration;


	public ApplicationConfigurationTest() {
		applicationConfiguration = new ApplicationConfiguration("applications/otddockertest-app.yml");
	}
	
	
	@Test
    public void givenYAMLFileThenGetApplicationConfiguration() {
		
		System.out.println("**************givenYAMLFileThenGetBuildProperties******************");


		System.out.println("Name: " + applicationConfiguration.getApplicationConfiguration().getName());
		System.out.println("Description: " +applicationConfiguration.getApplicationConfiguration().getDescription());

		System.out.println("URLs: " + applicationConfiguration.getApplicationConfiguration().getUrls().toString());
		System.out.println("Dependencies: " + applicationConfiguration.getApplicationConfiguration().getDependencies().toString());

		
		System.out.println("Webserver Type: " + applicationConfiguration.getWebServerConfiguration().getType());
		System.out.println("Webserver Name: " + applicationConfiguration.getWebServerConfiguration().getServer_name());
		System.out.println("Webserver Tier: " + applicationConfiguration.getWebServerConfiguration().getTier());
		
    }
	

}
