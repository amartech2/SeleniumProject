package day29_MouseClassaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsActions {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
	
		Actions act=new Actions(driver);
		
		//right click
		Action myaction=act.contextClick(button).build();  //creating action to store variable to perform that action after sometime or whenever it required to it
						//to store action we have to save it in action type varibale
		myaction.perform();  //completing action
		
		act.contextClick(button).perform(); // directly performing action by performe method/fun
		
		
	}

}
