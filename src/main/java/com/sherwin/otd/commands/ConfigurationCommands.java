package com.sherwin.otd.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sherwin.otd.commands.bean.Commands;
import com.sherwin.yaml.ReadYAML;

public class ConfigurationCommands {
	
	ReadYAML readYAML;
	Commands allConfigCommands;
	
	public ConfigurationCommands(){
		
		readYAML = new ReadYAML();
		LoadConfigCommandsFromYAMLFile();
		
	}
	
	public void LoadConfigCommandsFromYAMLFile(){
		
		allConfigCommands = readYAML.parseYAMLFiletoClass("commands/otd/configuration.yml", Commands.class);
	} 
	
	
	public List getCreateConfigCommands(){
				
		List<String> createCommands = (ArrayList<String>) allConfigCommands.getCreate();

		return createCommands;		
	}

	
	public List getDeleteConfigCommands(){
		
		List<String> deleteCommands = (ArrayList<String>) allConfigCommands.getDelete();

		return deleteCommands;		
	}
	
	public List getValidateConfigCommands(){
		
		List<String> validateCommands = (ArrayList<String>) allConfigCommands.getValidate();

		return validateCommands;		
	}

}
