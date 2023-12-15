package day29_MouseClassaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActionDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement field1=driver.findElement(By.id("field1"));
		field1.clear();
		field1.sendKeys("Welcome to Automation");
		
		WebElement button=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();
		
		//validation
		WebElement field2=driver.findElement(By.id("field2"));
		
		//String copiedText=field2.getText();
		String copiedText=field2.getAttribute("value");
		//System.out.println("Copied text is: "+copiedText);
		
		if(copiedText.equals("Welcome to Automation"))
		{
			System.out.println("Double actions performed correctly");
		}else
		{
			System.out.println("Error in double action");
	}
	
	}

}
