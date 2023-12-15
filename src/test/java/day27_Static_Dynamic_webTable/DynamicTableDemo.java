package day27_Static_Dynamic_webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTableDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		
		//Login to the application page
		WebElement user=driver.findElement(By.name("username"));
		user.clear();
		user.sendKeys("demo");    //demo
		
		WebElement pass=driver.findElement(By.name("password"));
		pass.clear();
		pass.sendKeys("demo");   //demo
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		WebElement closebtn=driver.findElement(By.xpath("//button[@class='btn-close']"));
		
		if(closebtn.isDisplayed())
		{
			closebtn.click();
		}
		
		//Customers ----> customers
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText(); //Showing 1 to 10 of 16676 (1668 Pages)
		
		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		System.out.println("Total number of pages: "+total_pages);
		
		
		
		for(int p=1;p<=5;p++)
		{
			if(total_pages>1)
			{
				WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));
				System.out.println("Active Page: "+active_page.getText());
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]")));
				
				active_page.click();
				
				Thread.sleep(2000);
			}
			
			int noofrows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println("Total no of rows in active range :"+noofrows);
			
			for(int r=1;r<=noofrows;r++)
			{
				String customerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String customerEmail=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
				
				System.out.println(customerName+"          "+customerEmail+"           "+status);
			}
			
			
			driver.quit();
			

			
			
		}
		
		

	}

}
