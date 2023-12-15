package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//Approach 1
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("15/04/2024");
		
		
		//Approach 2
		
		

		

	}

}
