package com.sherwin.otd.commands;

import java.util.List;

import org.junit.Test;

import com.sherwin.otd.commands.ConfigurationCommands;


public class ConfigurationCommandsTest {

	
	private ConfigurationCommands configurationCommands;


	public ConfigurationCommandsTest() {
		configurationCommands = new ConfigurationCommands();
	}
	
	
	@Test
    public void getCreateOTDConfigCommands() {
		System.out.println("********************************");

		List<String> list = configurationCommands.getCreateConfigCommands();
		
		for (String command : list) {
			System.out.println(command);

		}
        
    }

	
	@Test
    public void getDeleteOTDConfigCommands() {
		System.out.println("********************************");

		List<String> list = configurationCommands.getDeleteConfigCommands();
		
		for (String command : list) {
			System.out.println(command);

		}
        
    }
	
	@Test
    public void getValidateOTDConfigCommands() {
		System.out.println("********************************");

		List<String> list = configurationCommands.getValidateConfigCommands();
		
		for (String command : list) {
			System.out.println(command);
		}
        
    }
}
