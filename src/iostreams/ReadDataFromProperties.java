package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromProperties {

	public static void main(String[] args) throws Exception {
		FileInputStream propertiesStream = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\Files\\data.properties"));

		Properties dataProperties = new Properties();
		dataProperties.load(propertiesStream);
		
		System.out.println(dataProperties.getProperty("name"));
		System.out.println(dataProperties.getProperty("qualification"));
		System.out.println(dataProperties.getProperty("location"));
		
		System.out.println(dataProperties.getProperty("roll.no"));
		
		

	}

}
