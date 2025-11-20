package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelUsingIterators {

	public static void main(String[] args) throws Exception {

		FileInputStream testXlsxFile = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\Files\\Test.xlsx"));

		XSSFWorkbook workbook = new XSSFWorkbook(testXlsxFile);
		XSSFSheet languagesSheet = workbook.getSheet("Languages");

		Iterator<Row> allRows = languagesSheet.rowIterator();

		while (allRows.hasNext()) {
			Row eachRow = allRows.next();
			Iterator<Cell> allCells = eachRow.cellIterator();

			while (allCells.hasNext()) {
				Cell eachCell = allCells.next();
				switch (eachCell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					String cellVal = eachCell.getStringCellValue();
					System.out.print(cellVal + "                   ");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					double cellNumber = eachCell.getNumericCellValue();
					System.out.print(cellNumber + " ");
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
