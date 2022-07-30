package FrameWorkAdvancedSel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertyData 
{
	public static void main(String[] args) throws Throwable 
	{
		//Open The File in Read Mode
		FileInputStream FIS = new FileInputStream("./Data/config.properties");
		
		//Create an Object of Properties Class
		Properties Prop = new Properties();
		
		//Take Control Of File
		Prop.load(FIS);
		
		//Give The Key to get its Value
		 String PropValue = Prop.getProperty("Trainer_Name");
		
		//Print it
		System.out.println(PropValue);
		
	}
}
