package day18_linkText;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



//import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//open the url on the browser
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();  //maximize browser window
		
		//find Total number of sliders on home page
		List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
		System.out.println("Number of sliders: "+sliders.size());		
		
		//Find the total number of image on home page
		List <WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total number of images: "+images.size());
		
		//Find the total number of link
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+links.size());
		
		
		driver.quit();
		
	}

}
