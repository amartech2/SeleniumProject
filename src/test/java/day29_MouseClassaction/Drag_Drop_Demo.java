package day29_MouseClassaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Demo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		//Italy-Rome
		WebElement rome=driver.findElement(By.xpath("(//div[@id='box6'])[1]"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		act.dragAndDrop(rome, italy).perform();
		
		//Washington -USA
		WebElement washington=driver.findElement(By.xpath("//div[@id='dropContent']//div[@id='box3']"));
		WebElement USA=driver.findElement(By.xpath("//div[@id='box103']"));
		act.dragAndDrop(washington, USA).perform();
		
		
		//Seoul -Norway
		WebElement Seoul=driver.findElement(By.xpath("(//div[@id='box5'])[1]"));
		WebElement Norway=driver.findElement(By.xpath("//div[@id='box101']"));
		act.dragAndDrop(Seoul, Norway).perform();
		
		
		

	}

}
