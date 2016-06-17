import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A {
	public static void main(String[] args) throws Exception{
		FileInputStream file = new FileInputStream("/home/edathadan/Documents/task1.xlsx");
		XSSFWorkbook b = new XSSFWorkbook(file);
		Sheet s = b.getSheet("YourInfo");
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			Row rowitr = (Row) itr.next();
			Iterator cellitr = rowitr.cellIterator();
			while(cellitr.hasNext()){
				Cell celldata = (Cell) cellitr.next();
				switch(celldata.getCellType()){
				case Cell.CELL_TYPE_STRING:
					System.out.println(celldata.getStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(celldata.getNumericCellValue());
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					System.out.println(celldata.getBooleanCellValue());
					break;
				}
			}
		}
	}

}
