package day18_linkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



//import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//open the url on the browser
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();  //maximize browser window
		
		//Search Box
		driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
		
		//Search button
		driver.findElement(By.name("submit_search")).click();
		
		// link text & Partial linkTest
		//driver.findElement(By.linkText("Printed Dress")).click();
		driver.findElement(By.partialLinkText("Printed")).click();
	}

}
