package Extend_Reporter;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Report1
{
	 ExtentReports extent = new ExtentReports();
	 ExtentSparkReporter spark = new ExtentSparkReporter("ExtendReport.html");
	
  @Test
  public void f1() 
  {
	 ExtentTest test=extent.createTest("Open Browser").assignAuthor("Sheetal")
			 .assignCategory("Regression Test").assignDevice("Chrome");
	 test.log(Status.PASS, "Browser is opened");
	 test.pass("Browser is opened");
  }

  @Test
  public void f2() 
  {
	  ExtentTest test=extent.createTest("Login to App").assignAuthor("Vishal")
				 .assignCategory("Functional Test").assignDevice("FF");

	  test.info("Alerts displaying");
	  test.pass("User Logged Sucessfully");
	  test.warning("Reset Password alerts");	  
  }

  @Test
  public void f3()
  {
	  ExtentTest test=extent.createTest("Verify UserID").assignAuthor("Sheetal")
				 .assignCategory("Non-Functional Test").assignDevice("Opera");
	  test.skip("Verify UserID Skipped");
  }

  @Test
  public void f4() 
  {
	  ExtentTest test=extent.createTest("Logout from App").assignAuthor("Meera")
				 .assignCategory("Smoke Test").assignDevice("Chrome");
	  test.fail("Unable to generate report due to server down");
  }

  @Test
  public void f5() 
  {
	  ExtentTest test=extent.createTest("Close Browser").assignAuthor("Yash")
				 .assignCategory("Sanity Test").assignDevice("Opera");
	  test.pass("Sucessfully browser is closed");
	  test.info("User has closed browser");
  }
  
  @BeforeTest
  public void beforeTest() 
  { 
	 
	  extent.attachReporter(spark);

  }

  @AfterTest
  public void afterTest() 
  {
	  extent.flush();
  }

}
