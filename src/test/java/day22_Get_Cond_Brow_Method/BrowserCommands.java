package day22_Get_Cond_Brow_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver=new ChromeDriver();
		
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			driver.findElement(By.linkText("OrangeHRM, Inc")).click();
			
			Thread.sleep(5000);
			
			//driver.close();  //single browser window
			
			driver.quit();    //close all the browser window

	}

}
