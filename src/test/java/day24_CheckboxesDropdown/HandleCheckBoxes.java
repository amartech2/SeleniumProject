package day24_CheckboxesDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//select specific one checkbox
		//driver.findElement(By.id("monday")).click();
		
		//total number of checkboxes
		List<WebElement>cb=driver.findElements(By.xpath("//input[@class='form-check-input' and@type='checkbox']"));
		System.out.println("Total number of checkboxes: "+cb.size());
		
		//Select all the checkboxes
		/*for(int i=0;i<cb.size();i++)
		{
			cb.get(i).click();
		}*/
		
		/*for(WebElement chkbox:cb)
		{
			chkbox.click();
		}*/
		
		//Select last two check boxes
		//total number of cboxes - how many check boxes to be selected =starting index
		//7-2=5
		
		/*for(int i=5; i<cb.size();i++)
		{
			cb.get(i).click();
		}*/
		
		//select first two check boxes
		
		/*for(int i=0; i<3;i++)
		{
			cb.get(i).click();
		}*/
		
		/*for(int i=0;i<cb.size();i++)
		{
			if(i<2)
			{
			cb.get(i).click();
			}
		}*/
		
		//unselect/unchecked
		//Using normal for loop
		for(int i=0;i<3;i++)
		{
			cb.get(i).click();
		}
		
		Thread.sleep(4000);
		
		/*for(int i=0;i<cb.size();i++)
		{
			if(cb.get(i).isSelected()) 
			{
			cb.get(i).click();
			}
		}*/
		
		for(WebElement chkbox:cb)
		{
			if(chkbox.isSelected())
			{
				chkbox.click();
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
