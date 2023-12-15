package day25_handlingAlertsppops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopup {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//syntax to resolve this type of popup without any element
		
		//http://the-internet.herokuapp.com/basic_auth
		//http://admin:admin@the-internet.herokuapp.com/basic_auth
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations! ')]")).getText();
		
		//validation
		if(text.contains("Congratulation"))
		{
			System.out.println("Succesfully Login");
		}else
		{
			System.out.println("Login failed");
		}
		

	}

}
