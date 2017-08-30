package com.sherwin.profile;

import java.util.ArrayList;
import java.util.List;

import com.sherwin.build.bean.Build;
import com.sherwin.deploy.bean.Deploy;
import com.sherwin.otd.commands.ConfigurationCommands;
import com.sherwin.profile.bean.Profile;
import com.sherwin.yaml.ReadYAML;



public class ProfileBuilder {	
	
	
	ReadYAML readYAML;
	Profile profileProperties;
	
	
	
	public ProfileBuilder(){
		
		readYAML = new ReadYAML();
		LoadProfilePropsFromYAMLFile();
		
	}
	
	public void LoadProfilePropsFromYAMLFile(){
		
		profileProperties = readYAML.parseYAMLFiletoClass("profile/profile.yml", Profile.class);
	} 
	
	
	public Build getBuildProperties(){				
		Build buildProperties = null;		
		buildProperties = (Build) profileProperties.getBuild();			
		
		return buildProperties;
		}
	
	public Deploy getDeployProperties(){
		Deploy deployProperties = null;
		deployProperties = (Deploy) profileProperties.getDeploy(); 
		
		return deployProperties;
	}
	
	
	
	public List getProfileCommands(){
		
		List finalCommnads = new ArrayList<String>();
		ConfigurationCommands configurationCommands = new ConfigurationCommands();

		List applications = getBuildProperties().getApplications();
		List actions = getBuildProperties().getActions();
		List<String> targetServers = (ArrayList<String>)getDeployProperties().getServer_urls();
		
		for (String targetServer : targetServers) {
			finalCommnads.add(targetServer);			
			
			for (int i = 0; i < applications.size(); i++) {
				List currentListOfCommands = null;
				System.out.println("******"+i+"******"+applications.get(i));
				System.out.println("******"+i+"******"+actions.get(i));
				
				String action = (String) actions.get(i);
				if(action.equalsIgnoreCase("create")){	
				  currentListOfCommands = (ArrayList<String>)configurationCommands.getCreateConfigCommands();
				}
				if(action.equalsIgnoreCase("delete")){
				  currentListOfCommands = (ArrayList<String>)configurationCommands.getDeleteConfigCommands();
				}
				

				if(currentListOfCommands != null){
					finalCommnads.addAll(currentListOfCommands);
				}

			}

			
		}
		
		
		
	
		
		System.out.println(finalCommnads);

		return finalCommnads;
		
	}
	
	


}
