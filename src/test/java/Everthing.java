import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Everthing {

	public static void main(String[] args) throws IOException {
	File loc =  new File("C:\\Users\\Deepak\\eclipse-workspace\\Allentry\\xlsx\\book1.xlsx");
		FileInputStream fis = new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(fis);
		Sheet s = w.getSheet("Sheet1");
		
		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
		{
			 Row r = s.getRow(i);
			 
			 for(int j=0;j<r.getPhysicalNumberOfCells();j++)
			 {
				Cell c = r.getCell(j); 
				System.out.println(c);
			 }
		}
		
		

	}

}
