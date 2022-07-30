package DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleExcelData 
{
	public static void main(String[] args) throws Throwable, IOException 
	{
		for(int i=0; i<=9; i++)
		{
			//Open The File In Read Mode
			FileInputStream FIS = new FileInputStream("C:\\Users\\Saikr\\OneDrive\\Desktop\\Advanced Sel Frameworks\\FreedomFighters.xlsx");
			
			//Get The Control of The File
			Workbook WB = WorkbookFactory.create(FIS);
			
			//Go To The Particular Sheet
			Sheet SH = WB.getSheet("Sheet1");
			
			//Go To The Particular Row
		 	Row R = SH.getRow(i);
		 	
		 	//Go to the Particular Cell
		 	Cell CE = R.getCell(0);
		 	
		 	//Get The String Cell Value
		 	String VAL = CE.getStringCellValue();
		 	
		 	//Print it
		 	System.out.println(VAL);
		}
	}
}
