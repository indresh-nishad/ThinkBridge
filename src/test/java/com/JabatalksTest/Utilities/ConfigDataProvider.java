package com.JabatalksTest.Utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigDataProvider {
	Properties prop;
	public ConfigDataProvider() {
		File src =new File("./Config/Config.properties");
		try {
			FileInputStream fis= new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("can not read property file"+e.getMessage());
		} 
		
	}
	public String getDataFromConfig() {
		return prop.getProperty("sheetName");
		
		
	}
	public String getName() {
		return prop.getProperty("fullName");
		
		
	}
	public String getEmail() {
		return prop.getProperty("email");
		
		
	}
	public String getOrg() {
		return prop.getProperty("orgName");
		
		
	}

}
