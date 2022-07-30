package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws Throwable {
		
		//Open the file in read mode
		FileInputStream fis = new FileInputStream("./data/config.properties");
		//Create an Object of Properties Class
		Properties prop = new Properties();
		//Take control of File
		prop.load(fis);
		//Give the key to get its value
		//String propValue = prop.getProperty("browser");
		String propValue = prop.getProperty("username", "Incorrect Key");
		//Print it
		System.out.println(propValue);
		
		
	}

}
