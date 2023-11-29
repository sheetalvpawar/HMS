package File_Upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUp1 
{
	public static void main(String[] args) throws AWTException 	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*","ignore-certificate-error");
		WebDriver driver=new ChromeDriver();

       driver.get("https://www.ilovepdf.com/pdf_to_word");
       
       driver.manage().window().maximize();
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       
       //click "Select PDF file"
       driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
       
       //Step:I-Copy PDF file(ctrl+c)/copy to clipboard
       
       StringSelection s1=new StringSelection("D:\\InsuranceProject\\Insurance Domain Knowledge.pdf");
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
    
       //Step-II: Press "Control" Key + Press "V" key
        Robot R1=new Robot();
        R1.delay(2000);

      // Press "Ctrl" Key + Press "V" key
       R1.keyPress(KeyEvent.VK_CONTROL);
       R1.keyPress(KeyEvent.VK_V);
   
     //Release "Control" Key and "V" key
       R1.keyRelease(KeyEvent.VK_CONTROL);
       R1.keyRelease(KeyEvent.VK_V);
    
     //Step-III: Press "ENTER" key
       R1.keyPress(KeyEvent.VK_ENTER);
       R1.keyRelease(KeyEvent.VK_ENTER);
     
     
}

       

		
	}


