package day20_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
	
		//1) Launch Browser
		WebDriver driver=new ChromeDriver();
		
		
		//2) Open the url
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		String prd_name=driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText();
		//String prd_name=driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/h4[1]/a[1]")).getText();
		System.out.println(prd_name);

	}

}
