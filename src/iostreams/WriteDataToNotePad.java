package iostreams;

import java.io.File;
import java.io.FileOutputStream;

public class WriteDataToNotePad {

	public static void main(String[] args) throws Exception {
		File ouputFile = new File(System.getProperty("user.dir")+"\\Files\\OutputData.txt");
		String str = "Hello This is Java Output file";
		
		FileOutputStream fos = new FileOutputStream(ouputFile);
		fos.write(str.getBytes());
		fos.close();

	}

}
