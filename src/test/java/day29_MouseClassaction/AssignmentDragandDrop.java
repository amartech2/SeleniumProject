package day29_MouseClassaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentDragandDrop {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		//Debit Account Bank
		
		WebElement bank=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dbacc=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		//Credit account sales
		WebElement sales=driver.findElement(By.partialLinkText("SALES"));
		WebElement crdacc=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(bank, dbacc).perform();
		act.dragAndDrop(sales, crdacc).perform();
		
		
		
		//Debit side 5000
		WebElement amt5000=driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		WebElement amtdb=driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		act.dragAndDrop(amt5000, amtdb).perform();
		
		//Credit side 5000
		WebElement amt50002=driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		WebElement amtcr=driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		act.dragAndDrop(amt50002, amtcr).perform();
	}

}
