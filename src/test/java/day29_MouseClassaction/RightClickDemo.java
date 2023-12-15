package day29_MouseClassaction;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
	
		Actions act=new Actions(driver);
		
		//right click
		act.contextClick(button).perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
