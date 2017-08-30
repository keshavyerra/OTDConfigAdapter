package com.sherwin.profile;

import org.junit.Ignore;
import org.junit.Test;

import com.sherwin.build.bean.Build;
import com.sherwin.deploy.bean.Deploy;
import com.sherwin.profile.ProfileBuilder;


public class ProfileBuilderTest {

	
	
	private ProfileBuilder profileBuilder;


	public ProfileBuilderTest() {
		profileBuilder = new ProfileBuilder();
	}
	
	
	@Ignore
    public void givenYAMLFileThenGetBuildProperties() {
		System.out.println("**************Build******************");

		Build buildProps = profileBuilder.getBuildProperties();
		
	      System.out.println(buildProps.getApplications().toString());
	      System.out.println(buildProps.getActions().toString());
	      System.out.println(buildProps.getTags().toString());		
    }
	
	@Ignore
    public void givenYAMLFileThenGetDeploysProperties() {
		System.out.println("**************Deploy******************");

		Deploy deployProps = profileBuilder.getDeployProperties();
		
	      System.out.println(deployProps.getEnvironments().toString());
	      System.out.println(deployProps.getServer_names().toString());
	      System.out.println(deployProps.getServer_urls().toString());
	      System.out.println(deployProps.getTags().toString());		
    }
	
	@Test
    public void givenBuildAndDeployPropertiesThenGetProfileCommands() {
		System.out.println("**************Deploy******************");

		 profileBuilder.getProfileCommands();
		 
	}

}
