package PracticeFrameWorkAdvSel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelInputData 
{
	public static void main(String[] args) throws Throwable 
	{
		FileInputStream File = new FileInputStream("C:\\Users\\Saikr\\OneDrive\\Desktop\\FreedomFighters.xlsx");
		
		Workbook Work = WorkbookFactory.create(File);
		
		Sheet S = Work.getSheet("Sheet2");
		
		Row R = S.getRow(1);
		
		Cell C = R.getCell(0);
		
		String Value = C.getStringCellValue();
		
		System.out.println(Value);
	}
}
