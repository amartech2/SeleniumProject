package day22_Get_Cond_Brow_Method;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Get_Methods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		//Get the title of web Page = getTitle()
		String pageTitle=driver.getTitle();
		System.out.println("Title of the page: "+pageTitle);
		
		//Get the current URl
		System.out.println("Current URL: "+driver.getCurrentUrl());
		
		/*Get current page source
		String source=driver.getPageSource();
		System.out.println("Page source :"+source);
		System.out.println(source.contains("html"));*/
		
		//Get window Handle
		//System.out.println(driver.getWindowHandle()); //C602424C72628D3F4B583FAD784D87C2
		
		//Get windowHandles
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String>whids=driver.getWindowHandles();  //7D988F964CFAC0103E4D579DEE1896CB
													//ECDCAEC4D718B8F61BE51EAE20C56E7E

		
		for(String winid:whids)
		{
			System.out.println(winid);
		}
		
		//close browser
	//	driver.quit();
	}

}
