package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Redifftradiobuttoncopypaste {

	ChromeDriver driver;
	
  @BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
	;
	}
  
  @BeforeMethod
  public void urlloading()
  {
	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
  }
  
  @Test//locate radio button
  public void radio()
  {
	 WebElement radiobutton= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
	Boolean b= radiobutton.isSelected();
	if(b)
	{
		System.out.println("radio button is selected");
	}
	else
	{
		System.out.println("not selected");
	}
	
  }
  
  @Test//locate logo
  public void logo()
  {
	 WebElement logo= driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
	Boolean s= logo.isDisplayed();
	if(s)
	{
		System.out.println("logo is displayed");
	}
	else
	{
		System.out.println("not displayed");
	}
	
  }
  
  @Test//enable button
  public void enabled()
  {
	  WebElement enabled=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
	 Boolean a= enabled.isEnabled();
	 if(a)
	 {
		 System.out.println("button is enabled");
	 }
	 else
	 {
		 System.out.println("not enabled");
	 }
  }
  
  @Test//copy paste
  public void copypaste()
  {
	  WebElement firstname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	  WebElement rediffid=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
	  firstname.sendKeys("sarath");
	  Actions act=new Actions(driver);
	  act.keyDown(firstname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	  act.keyDown(firstname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	  act.keyDown(rediffid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	  act.perform();
	  
  }
}
