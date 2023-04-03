package homework;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Edgedriverscreenshot {

	EdgeDriver driver;
	
	@Before
	public void begining()
	{
		driver=new EdgeDriver();
		driver.get("https://www.bing.com/");
	}
	
	@Test
	public void test1() throws IOException
	{
		//full screenshot
		
		File src=    ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("E://error1.png"));
		
		//webelement screenshot
		
		WebElement search=driver.findElement(By.name("q"));
		File src1=search.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./ScreenShot//shot.png"));
	}
}
