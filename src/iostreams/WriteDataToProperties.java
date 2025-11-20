package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class WriteDataToProperties {

	public static void main(String[] args) throws Exception {

		File dataPropertiesFile = new File(System.getProperty("user.dir") + "\\Files\\data.properties");

		FileInputStream propertiesStream = new FileInputStream(dataPropertiesFile);

		Properties dataProperties = new Properties();
		dataProperties.load(propertiesStream);

		System.out.println(dataProperties.getProperty("name"));
		System.out.println(dataProperties.getProperty("qualification"));
		System.out.println(dataProperties.getProperty("location"));

		System.out.println(dataProperties.getProperty("roll.no"));

		dataProperties.setProperty("roll.no", "101");

		System.out.println(dataProperties.getProperty("roll.no"));

		FileOutputStream dataFileOutpustream = new FileOutputStream(dataPropertiesFile);

		dataProperties.store(dataFileOutpustream, "Updated by Raju");

	}

}
