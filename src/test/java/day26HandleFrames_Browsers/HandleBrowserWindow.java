package day26HandleFrames_Browsers;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		
		
		
		
		
		//capture id's for browser windows
		Set<String> windowids=driver.getWindowHandles();   //store 2 window id's
		
		
		//Approach 1 -Using list collection
		/*
		List<String> windowidsList=new ArrayList(windowids);  //converted set ----> List
		
		String parentwindoID=windowidsList.get(0);     
		String childwindowID=windowidsList.get(1);
		
		//Switch To child window	
		driver.switchTo().window(childwindowID);
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		
		//Switch back to Parent window
		driver.switchTo().window(parentwindoID);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		*/
		
		
		//Approach2
		
		/*for(String winid:windowids)
		{
			String title=driver.switchTo().window(winid).getTitle();
			
			if(title.equals("OrangeHRM HR Software | OrangeHRM"))
			{
				driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
				
			}
		}*/
		
		//closing specific browse windows based on choice
		
		/*for(String winid:windowids)
		{
			String title=driver.switchTo().window(winid).getTitle();
			
			if(title.equals("OrangeHRM HR Software | OrangeHRM")||title.equals("x")||title.equals("y"))
			{
				driver.close();
				
			}
		}*/
		
		for(String winid:windowids)
		{
			String title=driver.switchTo().window(winid).getTitle();
			
			if(title.equals("OrangeHRM HR Software | OrangeHRM"))
			{
				driver.close();
				
			}
		}
		
		
	}

}
