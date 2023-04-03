package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class Extendedreports {

	WebDriver driver;
	String baseurl="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void beforetest()
	{
		reporter=new ExtentHtmlReporter("./Reports/myreport1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("functional test");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "Windows 10 Pro");
		extent.setSystemInfo("testername", "sarath");
		extent.setSystemInfo("Browser name", "edge");
		driver=new EdgeDriver();
		
		
	}
	
	@BeforeMethod
	public void setup()
	{
		driver.get(baseurl);
	}
	
	@Test
	public void fbtitleverification()
	{
		test=extent.createTest("fbtitleverification");
		String exp="facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(exp, actual);
	}
	
	@Test
	public void fbbuttontest()
	{
		test=extent.createTest("fbbuttontest");
		String buttontest=driver.findElement(By.xpath("//*[@id=\"u_0_5_1S\"]")).getText();
		Assert.assertEquals(buttontest, "register");
		
	}
	
	@Test
	public void fblogotest()
	{
		test=extent.createTest("fblogotest");
		boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
		Assert.assertTrue(b);
	}
	
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
	
	@AfterMethod
	public void browserclose(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed is"+result.getName());
			test.log(Status.FAIL, "test case failed is"+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case passed is"+result.getName());
		}
	}
	
}
