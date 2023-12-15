package day24_CheckboxesDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithSelecttag {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpcountruele=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpCountry=new Select(drpcountruele);
		
		System.out.println(drpCountry.isMultiple());  //to check the dropdown is multiple driver or not
		
		//1) Selecting options from the drop down
		//drpCountry.selectByVisibleText("China");
		//drpCountry.selectByValue("india");  //use this only value attribute present fro option tag
		//drpCountry.selectByIndex(3); //Germany   //index start from zero 
		
		//2) Find total option in dropdown
		List<WebElement>options=drpCountry.getOptions();
		System.out.println("Total number of options: "+options.size());
		
		//3) print options in console window
		/*for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}*/
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
	}

}
