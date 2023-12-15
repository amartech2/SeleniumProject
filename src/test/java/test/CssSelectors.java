package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");

	}

}
