package com.sherwin.yaml;

import java.io.File;
import java.io.InputStream;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;


public class ReadYAML {

	
	public <T> T readYAMLFileAsPlainObject(String filePath){
	    T obj = null;
/*	    try {
	    	File yamlFile = loadYAMLFile(filePath);
	        YamlReader reader = new YamlReader(new FileReader(yamlFile));
	        obj = (T) reader.read();
	 
	    } catch (Exception ex) {
	    }*/
	    return  obj;
	}
	

	
	
	public <T> T parseYAMLFiletoClass(String filePath, Class mappingClass){
        Object object = null;
        
        Yaml yaml = new Yaml(new Constructor(mappingClass));
        
        try(InputStream in = ClassLoader.getSystemResourceAsStream(filePath)) {
            object = yaml.load(in);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
        return (T) object;        
   
	}
	
	public File loadYAMLFile(String filePath){
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(filePath).getFile());
		
		return file;		
	}

}
