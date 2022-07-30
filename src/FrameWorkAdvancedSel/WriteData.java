package FrameWorkAdvancedSel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData 
{
	public static void main(String[] args) throws Throwable 
	{
		//Open the File in Read Mode
		FileInputStream FIS = new FileInputStream("C:\\Users\\Saikr\\OneDrive\\Desktop\\FreedomFighters.xlsx");
		
		//Get The Control of the File
		Workbook WBF= WorkbookFactory.create(FIS);
		
		//Go to the Perticular Sheet
		Sheet SH = WBF.getSheet("Sheet1");
		
		//Go To The Particular Row
		Row RO = SH.getRow(5);
		
		//Prepare The Particular Cell
		Cell CE = RO.createCell(2);
		
		//Get The Cell String Value
		CE.setCellValue("SRIKANTH");
		
		//Open The File in Write Mode
		FileOutputStream FOS = new FileOutputStream("C:\\Users\\Saikr\\OneDrive\\Desktop\\FreedomFighters.xlsx");
		
		//Save The File
		WBF.write(FOS);
		
		//Print a msg for our Confirmation
		System.out.println("Done Writing");
	}
}
