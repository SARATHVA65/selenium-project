package datadriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Instadatadriven {

	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test() throws Exception
	{
		FileInputStream s=new FileInputStream("E:\\fbdatadriven.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(s);
		XSSFSheet sh=wb.getSheet("sheet1");
		int rowcount=sh.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username="+username);
			System.out.println("password="+password);
			driver.get("https://www.instagram.com");
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[4]")).click();
			
		}
	}
}
