package com.tcs.fileReader;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.stereotype.Component;

@Component("propReader")
public class PropertiesReader {
	public static String getDatabaseType(){
		Properties prop = new Properties();
		InputStream inStream = null;
		
		inStream = new FileInputStream("database.properties");
		prop.load(inStream);
		return prop.getProperty("databaseLocation");
	}
}
