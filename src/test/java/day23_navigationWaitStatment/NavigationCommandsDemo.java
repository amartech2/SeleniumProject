package day23_navigationWaitStatment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandsDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());  //amazon
		
		driver.navigate().to("https://www.flipkart.com");  
		System.out.println(driver.getCurrentUrl());		////flipkart
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());    //amazon
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());   //Flipkart
		
		
		driver.navigate().refresh();   //refresh the page	
	
	}

}
