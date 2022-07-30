package DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcelData 
{
	public static void main(String[] args) throws Throwable 
	{
			//Open The File in Read Mode
			FileInputStream FIS = new FileInputStream("C:\\Users\\Saikr\\OneDrive\\Desktop\\Advanced Sel Frameworks\\FreedomFighters.xlsx");
			
			//Get The Control Of The File
			Workbook WB = WorkbookFactory.create(FIS);
			
			//Go To The Particular Sheet
			Sheet SH = WB.getSheet("Sheet1");
			
			//Go To Particular Row
			Row R = SH.getRow(3);
			
			//Go To Particular Cell
			Cell C = R.getCell(1);
			
			//Get The String Cell Value
			String Val = C.getStringCellValue();
			
			//Print It
			System.out.println(Val);
	}
}

