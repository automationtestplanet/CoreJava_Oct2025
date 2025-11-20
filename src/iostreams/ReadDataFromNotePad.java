package iostreams;

import java.io.File;
import java.io.FileInputStream;

public class ReadDataFromNotePad {

	public static void main(String[] args) throws Exception {
//		File inputFile = new File("D:\\Trainings\\Selenium-Java-RestAssured\\Oct2025\\eclipse\\CoreJava_Oct2025\\Files\\InputData.txt");
		File inputFile = new File(System.getProperty("user.dir")+"\\Files\\InputData.txt");
		
		FileInputStream fis = new FileInputStream(inputFile);
		
		System.out.println(fis.available());		
		byte[] dataArr = new byte[fis.available()];		
		fis.read(dataArr);		
		String inputData = new String(dataArr);		
		System.out.println(inputData);
		fis.close();
		
		System.out.println(System.getProperty("user.dir"));

	}

}
