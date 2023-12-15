package day28_Date_Picker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		
//		Approach 1
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/15/2024");  //mm/dd/yyyy
		
		//Approach 2
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String date="04";
		String month="May";
		String year="1999";
		
		
		//Select month and Year
		while(true)
		{
			String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && yr.equals(year))
			{
				break;
			}
			
			//driver.findElement(By.xpath("//span[text()='Next']")).click();   //Next button //Future Date
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();     //Past Date
			
		}
		
		//select date
		
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
		/*Enhance For loop
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}*/
		
//		Normal for loop
		
		for(int i=0; i<alldates.size();i++)
		{
			if(alldates.get(i).equals(date))
			{
				alldates.get(i).click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		//driver.close();		
		
		
	}

}
