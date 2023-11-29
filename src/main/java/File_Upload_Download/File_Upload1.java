package File_Upload_Download;

import java.awt.datatransfer.StringSelection;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class File_Upload1 
{
	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--allow-remote-origine=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To click selcet pdf file button
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		
		//StringSelection s1=new String
		
	}

}
