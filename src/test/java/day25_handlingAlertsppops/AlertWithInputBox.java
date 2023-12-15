package day25_handlingAlertsppops;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWithInputBox {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Alert alertwindow=driver.switchTo().alert();
		
		System.out.println(alertwindow.getText());
		
		alertwindow.sendKeys("Amar");
		//alertwindow.accept();
		alertwindow.dismiss();	
		
		String act_text=driver.findElement(By.id("result")).getText();
		String exp_text="Amar";
		
		//validation
		if(act_text.equals(exp_text))
		{
			System.out.println("test passed");
		}else
		{
			System.out.println("Test failed");
		}

	}

}
