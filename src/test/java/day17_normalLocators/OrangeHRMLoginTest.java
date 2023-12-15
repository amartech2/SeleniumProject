package day17_normalLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {
	
		//System.setProperty("webdriver.chrome.driver","path to driver file");
		//WebDriverManager.chromedriver().setup();
		
		//1) Launch browser
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		//2) open url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//3) Provide username in the input box - Admin
		//WebElement txtUsername=driver.findElement(By.id("name"));
		//txtUsername.sendKeys("Admin");
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//4) Provide Password - admin1123
		driver.findElement(By.name("password")).sendKeys("admin");
		
		//5) Click on Login button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		Thread.sleep(5000);
		
		//6) Verify the title of dashboard page
		//Title Validation
		/*String act_title=driver.getTitle();
		String ext_title="OrangeHRM";
		
		if(act_title.equals(ext_title))
		{
			System.out.println("Test Passed");
		}else
		{
			System.out.println("failed");
		}*/
		
		//Lable validation after successful login
		
		String act_label="";
		try
		{
			act_label=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		}
		catch(NoSuchElementException e) {
			//act_label="";
		}
		
		String exp_label="Dashboard";
		
		if(act_label.equals(exp_label))
		{
			System.out.println("Test Passed");
		}else
		{
			System.out.println("Test Failed");
		}
		 
		
		//7) close browser
		//driver.close();
		//driver.quit();
		
		
	}

}
