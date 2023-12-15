package day29_MouseClassaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocOfElement {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		System.out.println("Before maximizing the loc of logo: "+logo.getLocation()); //(276,75)
		driver.manage().window().maximize();
		System.out.println("After maximizing the loc of logo: "+logo.getLocation()); //(476,58)
		
		driver.manage().window().minimize();
		System.out.println("After manimizing the loc of logo: "+logo.getLocation()); //(276,41)
		
		driver.manage().window().fullscreen();
		System.out.println("After Fullscreen the loc of logo: "+logo.getLocation()); //(476,121)
		
		Point p=new Point(50,50);
		driver.manage().window().setPosition(p);
		System.out.println("After Setting window position 50*50 the loc of logo: "+logo.getLocation()); //(274,40)
		
	}

}
