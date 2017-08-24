package com.sherwin.yaml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import com.sherwin.yaml.ReadYAML;

public class ReadYAMLTest {
	
	
	private ReadYAML readYAML;


	public ReadYAMLTest() {
		readYAML = new ReadYAML();
	}
	
	
	@Test
    public void givenYAMLFileThenReadTheContent() {
		//Get file from resources folder
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource("commands/otd/configuration.yml").getFile());
		
			Object objectFromFile  = readYAML.readYAMLFile(file);

			Object objectFromFilepath = readYAML.readYAMLFile("commands/otd/configuration.yml");

			System.out.println(objectFromFile);
			System.out.println(objectFromFilepath);
        
    }

	@Ignore
	public void read(){
		
		  YamlReader reader = null;
		try {
			reader = new YamlReader(new FileReader("C:\\Users\\bxy236\\Desktop\\gitRepos\\OTDConfigAdapter\\src\\main\\resources\\commands\\otd\\configuration.yml"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    Object object = null;
			try {
				object = reader.read();
			} catch (YamlException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println(object);
		    Map map = (Map)object;
		   // System.out.println(map.get("create"));
	} 
	
	@Ignore
	public void testParser(){
		//Get file from resources folder
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("commands/otd/configuration.yml").getFile());
	      
		  YamlReader reader = null;
			try {
				reader = new YamlReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    Object object = null;
				try {
					object = reader.read();
				} catch (YamlException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	    }
	
}
