package Utilitypkg;

import java.io.File;
import java.io.FileInputStream;

public class Excelutil {
	public static String getCellValue(String x1,String sheet,int r,int c)
	{
		try
		{
			File f=new File(x1);
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSWorkbook(fi);
			
			XSSFCell cell=(XSSFCell) wb.getsheet(sheet).getRow(r).getCell(c);
			
		if(cell.getCellType()==CellType.STRING)	
		{
			return cell.getStringCellValue();
		}
		else
		{
			double v=cell.getNumericCellValue();
			
		}
		}
	}

}
