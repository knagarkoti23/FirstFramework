package com.appointmanage.utility;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.appointmanage.base.BaseClass;

public class ExcelSheetHandle extends BaseClass
{
	public static FileInputStream fis;
	
	public static FileInputStream getExcelFile() throws FileNotFoundException
	
	fis = new FileInputStream(projectPath+"//src//main//java//com//appointmanage//utility//ExcelSheetHandle.java");
	
	return fis;
	
}

public Sheet getSheet(String fileName, String sheetName)
{	
	Sheet sh=null;
	try
	{
		sh = WorkbookFactory.create(fileNamme).getSheet(sheetName);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	return sh;

}

public void getExcelSheetData(Sheet sh)
{
	int getRow = sh.getLastRow();
	
	for(int i =0; i<getRow; i++)
	{
		int col = sh.get
	}
}