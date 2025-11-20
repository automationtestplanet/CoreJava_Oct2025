package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws Exception {
		File excelFile = new File(System.getProperty("user.dir") + "\\Files\\Test.xlsx");
		FileInputStream testXlsxFile = new FileInputStream(excelFile);

		XSSFWorkbook workbook = new XSSFWorkbook(testXlsxFile);
		XSSFSheet newSheet = workbook.createSheet("Nov2025");
		Row firstRow = newSheet.createRow(0);
		Cell firstCell = firstRow.createCell(0);
		firstCell.setCellValue("This is New Cell Value");
		
		FileOutputStream excelFileOutputStream = new FileOutputStream(excelFile);
		workbook.write(excelFileOutputStream);
		excelFileOutputStream.close();
		testXlsxFile.close();
		

	}

}
