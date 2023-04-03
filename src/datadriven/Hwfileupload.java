package datadriven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hwfileupload {

	WebDriver driver;
	
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test() throws IOException, Exception
	{
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		
		fileupload("C:\\\\Users\\\\HP\\\\Documents\\\\Test Scenarios for Whatsapp.docx");
	}

	private void fileupload(String s) throws AWTException , IOException {
		
	StringSelection strSelection=new StringSelection(s);
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
	
	Robot robot=new Robot();
	
	robot.delay(3000);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.delay(2000);
	robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
}
