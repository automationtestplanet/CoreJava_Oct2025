package iostreams;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {

		FileInputStream testXlsxFile = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\Files\\Test.xlsx"));

		XSSFWorkbook workbook = new XSSFWorkbook(testXlsxFile);
		XSSFSheet languagesSheet = workbook.getSheet("Languages");
		
//		System.out.println(languagesSheet.getLastRowNum());
//
//		Row firstRow = languagesSheet.getRow(0);
//
//		System.out.println(firstRow.getLastCellNum());
//
//		Cell firstCell = firstRow.getCell(0);
//
//		switch (firstCell.getCellType()) {
//		case Cell.CELL_TYPE_STRING:
//			String cellVal = firstCell.getStringCellValue();
//			System.out.println(cellVal);
//			break;
//		case Cell.CELL_TYPE_NUMERIC:
//			double cellNumber = firstCell.getNumericCellValue();
//			System.out.println(cellNumber);
//			break;
//		default:
//			System.out.println("No match fond");
//		}
//
//		Cell secondCell = firstRow.getCell(1);
//		switch (secondCell.getCellType()) {
//		case Cell.CELL_TYPE_STRING:
//			String cellVal = secondCell.getStringCellValue();
//			System.out.println(cellVal);
//			break;
//		case Cell.CELL_TYPE_NUMERIC:
//			double cellNumber = secondCell.getNumericCellValue();
//			System.out.println(cellNumber);
//			break;
//		default:
//			System.out.println("No match fond");
//		}
		
		for(int i=0; i<=languagesSheet.getLastRowNum(); i++) {
			Row eachRow = languagesSheet.getRow(i);
			
			for(int j = 0; j<eachRow.getLastCellNum(); j++) {
				Cell eachCell = eachRow.getCell(j);
				switch (eachCell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						String cellVal = eachCell.getStringCellValue();
						System.out.print(cellVal+ "                   ");
						break;
					case Cell.CELL_TYPE_NUMERIC:
						double cellNumber = eachCell.getNumericCellValue();
						System.out.print(cellNumber+ " ");
						break;
					default:
						System.out.println("No match fond");
				}
			}
			
			System.out.println(" ");
		}

		testXlsxFile.close();

	}

}
