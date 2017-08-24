package com.sherwin.yaml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

public class ReadYAML {

	public <T> T readYAMLFile(File yamlFile){
	    T obj = null;
	    try {
	        YamlReader reader = new YamlReader(new FileReader(yamlFile));
	        obj = (T) reader.read();
	 
	    } catch (Exception ex) {
	    }
	    return  obj;
	}
	
	public <T> T readYAMLFile(String filePath){
	    T obj = null;
	    try {
	    	File yamlFile = loadYAMLFile(filePath);
	        YamlReader reader = new YamlReader(new FileReader(yamlFile));
	        obj = (T) reader.read();
	 
	    } catch (Exception ex) {
	    }
	    return  obj;
	}
	
	
	public File loadYAMLFile(String filePath){
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(filePath).getFile());
		
		return file;		
	}

}
