package day19_cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class CssSelectors {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		//1) Css with tag & id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");
		
		//2) Css with tag & class
		//driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("Macbook");
		//driver.findElement(By.cssSelector(".search-box-text ")).sendKeys("Macbook");
		
		//3) Css with tag and attribute
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector("[type='text']")).sendKeys("MacBook");
		
		//4) Css with tag and class & attribute
		driver.findElement(By.cssSelector("input.search-box-text[type='text']")).sendKeys("MacBook");
		
		
		
	}

}
