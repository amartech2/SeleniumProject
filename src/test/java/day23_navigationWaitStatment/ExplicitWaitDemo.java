package day23_navigationWaitStatment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//declaring explicit wait
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
			
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		username.sendKeys("Admin");
		
		//driver.findElement(By.name("username")).sendKeys("admin");
		
		WebElement pass=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		pass.sendKeys("admin123");
		
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	}

}
