package pkg;

import org.openqa.selenium.edge.EdgeDriver;

public class Firstpgmhomework {

	public static void main(String[] args) {
	
	  String exp="Edge";
	  EdgeDriver driver=new EdgeDriver();
	  driver.get("https://www.edge.com");
	  
	  String title=driver.getTitle();
	  System.out.println("title="+title);
      
	  if(title.equals(exp))
	  {
		System.out.println("pass");  
	  }
	  else
	  {
		System.out.println("fail");  
	  }
	  
	}
	

}
