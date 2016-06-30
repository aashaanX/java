package testscript;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExecuteLeadTest {
	public static void main(String[] args) throws Exception{
		ArrayList data = new ArrayList();
		FileInputStream file = new FileInputStream("/home/edathadan/LeadSuit.xlsx");
		XSSFWorkbook b = new XSSFWorkbook(file);
		Sheet s = b.getSheet("Sheet1");
		
		Iterator itr = s.iterator();
			while(itr.hasNext()){
				Row rowitr =(Row) itr.next();
				Iterator cellitr = rowitr.cellIterator();
				while(cellitr.hasNext()){
					Cell celldata = (Cell) cellitr.next();
					switch(celldata.getCellType()){
					case Cell.CELL_TYPE_STRING:
						data.add(celldata.getStringCellValue());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						data.add(celldata.getNumericCellValue());
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						data.add(celldata.getBooleanCellValue());
						break;
					}
				}
			}
			for (int i = 0;i<data.size();i++){
				if(data.get(i).equals("openBrowser")){
					String keyword = (String) data.get(i);
					String dat = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					String runMode = (String) data.get(i+3);
					if(runMode.equals("yes")){
						Keywords.openBrowser();
					}	
				}
				if(data.get(i).equals("navigate")){
					String keyword = (String) data.get(i);
					String dat = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					String runMode = (String) data.get(i+3);
					if(runMode.equals("yes")){
						Keywords.navigate(dat);
					}	
				}
			}
	}


}

