package Library_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UtilityClass 
{
	//Name: Sheetal
	//Date: 13/9/2023
	//Day: Wed
	//To fetch data from PF
	
	@Test                      //UserName   Password
	public static String getDataFromPF(String key) throws IOException 
	{
		
		//To reach upto Property File
	FileInputStream file=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\PropertyFile.Properties");
		
	//Create Object of Properties Class
	Properties Prop=new Properties();
	
	//To Open property File
	  Prop.load(file);
	
	//To fetch data/value from Property File
	String  Value1=Prop.getProperty(key);   //UserName---->Velocity    
	                                       //Password---->C4472J
	  return Value1;  //Velocity   //U1YP1G 
	
	}
	






	    //Name: Sheetal
		//Date: 14/9/2023
		//Day: Thursday
		//To fetch data from Excelsheet

	
	@Test                                             //7         //1
	public static String getDatafromExcelsheet(int  RowIndex, int CellIndex) throws EncryptedDocumentException, IOException 
	{	
		//To reach upto Excelsheet
	FileInputStream file=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\TestData\\param1.xlsx");
		                                                                  //7              //1
    String Value2=WorkbookFactory.create(file).getSheet("Sheet12").getRow(RowIndex).getCell(CellIndex).getStringCellValue(); //Velocity!
		                                                                                                  //1987
		return Value2;     //1987

	}
	
	 //Name: Sheetal
	//Date: 15/9/2023
	//Day: Friday
	//To Capture Screenshot of Failed Test Cases
	
	@Test                                                           //TC101
	public static void CaptureScreenshot(WebDriver driver, String TestCaseID) throws IOException
	{
        File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		                                                       //TC101
		File Destination=new File("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\Screenshot\\"+TestCaseID+".jpg");
		FileHandler.copy(Source,Destination);
	}	
}