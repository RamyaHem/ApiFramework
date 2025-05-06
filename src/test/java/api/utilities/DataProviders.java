package api.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name= "AgeData")
	public String [][] getAllDataAge() throws IOException
	{
		String path= System.getProperty("user.dir")+"//ExcelData//dataSheet.xls";
		excelUtilities xl= new excelUtilities(path);
		int rownum=xl.getRowCount("AgeAPI");
		int colcount=xl.getCellCount("AgeAPI", rownum);
		String apidata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++)
		{
			for (int j=0;j<colcount;j++)
			{
				apidata[i-1][j]=xl.getCellData("AgeAPI", rownum, j);
			}
			
		}
		return apidata;
		
	}
	@DataProvider(name= "ProfileData")
	public String [][] getAllDataProfile() throws IOException
	{
		String path= System.getProperty("user.dir")+"//ExcelData//dataSheet.xls";
		excelUtilities xl= new excelUtilities(path);
		int rownum=xl.getRowCount("ProfileAPI");
		int colcount=xl.getCellCount("ProfileAPI", rownum);
		String apidata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++)
		{
			for (int j=0;j<colcount;j++)
			{
				apidata[i-1][j]=xl.getCellData("AgeAPI", rownum, j);
			}
			
		}
		return apidata;
		
	}
	
	

}
