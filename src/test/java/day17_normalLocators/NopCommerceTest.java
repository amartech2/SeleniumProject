package day17_normalLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerceTest {

	public static void main(String[] args) {


		//1) Open Browser window
		WebDriver driver=new ChromeDriver();
		
		//2) Opne url given
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		//3) Provide username in username field 
		WebElement user=driver.findElement(By.id("Email"));
		user.clear();
		user.sendKeys("admin@yourstore.com");
		
		//4) Provide password in password field
		WebElement pass=driver.findElement(By.name("Password"));
		pass.clear();
		pass.sendKeys("admin");
		
		//5) Submit button
		driver.findElement(By.className("button-1")).click();
		
		//6) Verity the title of the page
		String act_tit=driver.getTitle();
		String exp_tit="Dashboard / nopCommerce administration";
		
		if(act_tit.equals(exp_tit))
		{
			System.out.println("Test is passed");
		}else
		{
			System.out.println("Test is failed");
		}
		
		//7) Verify the Dashboard Test
		String act_text=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		String exp_ext="Dashboard";
		if(act_text.equals(exp_ext))
		{
			System.out.println("Test is passed");
		}else
		{
			System.out.println("Test is failed");
		}
		
		//6) Close the browser
		driver.quit();
		
		
;	}

}
