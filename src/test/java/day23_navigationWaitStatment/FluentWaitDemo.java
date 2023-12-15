package day23_navigationWaitStatment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//declaraion of fluent wait
		   
		   FluentWait mywait = new FluentWait(driver);
		   mywait.withTimeout(Duration.ofSeconds(30L));
	       mywait.pollingEvery(Duration.ofSeconds(5L));
	       mywait.ignoring(NoSuchElementException.class);
		   
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	       //usage
	       WebElement username=(WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	          username.sendKeys("Admin");
	}

}
