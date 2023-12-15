package day22_Get_Cond_Brow_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		//logo status  -- isDiaplyed() is Enabled
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("Display status of logo: "+logo.isDisplayed());
		
		//boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println(status);
		
		//WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		//System.out.println("Display status:"+searchbox.isDisplayed());
		//System.out.println("Enable status:"+searchbox.isEnabled());
		
		
		//isSelected
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//Before Selection
		System.out.println("Before selection.......");
		System.out.println(male_rd.isSelected());  //false
		System.out.println(female_rd.isSelected()); //false
		
		
		//After Selection of male radio button
		System.out.println("After selection of male radio button.....");
		male_rd.click();
		System.out.println(male_rd.isSelected());  //true
		System.out.println(female_rd.isSelected()); //false\
		
		//After Selection of fe-male radio button
		System.out.println("After selection of fe-male radio button.....");
		female_rd.click();
		System.out.println(male_rd.isSelected());  //false
		System.out.println(female_rd.isSelected()); //true

	}

}
