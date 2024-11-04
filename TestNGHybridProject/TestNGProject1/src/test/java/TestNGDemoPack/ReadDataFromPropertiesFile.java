package TestNGDemoPack;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadDataFromPropertiesFile {
	
	public static void main (String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		//Object name;
		FileInputStream fis = new FileInputStream ("./Files//DataFile.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("Name"));
		
	}

}
