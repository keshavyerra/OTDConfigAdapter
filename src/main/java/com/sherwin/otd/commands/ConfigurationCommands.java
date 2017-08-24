package com.sherwin.otd.commands;

import com.sherwin.yaml.ReadYAML;

public class ConfigurationCommands {
	
	ReadYAML readYAML;
	Object allConfigCommands;
	
	public ConfigurationCommands(){
		
		readYAML = new ReadYAML();
		
	}
	
	public void LoadConfigCommandsFromYAMLFile(){
		
		allConfigCommands = readYAML.readYAMLFile("commands/otd/configuration.yml");
		
	} 
	
	
	public List getCreateConfigCommands(){
		
		allConfigCommands
		
	}

}
