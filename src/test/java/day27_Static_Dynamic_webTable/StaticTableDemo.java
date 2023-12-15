package day27_Static_Dynamic_webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableDemo {

	public static void main(String[] args) {


		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//Today our operation we have take it out
	     
		
		// 1) Find the total number of rows
		
		//List<WebElement>rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));   
		//rows.size();
		
		//Approach 1
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();   //7  preferred
		//Approach 2
		//int rows=driver.findElements(By.tagName("tr")).size();    //8 prefered only if you have one single table
		System.out.println("Number of rows: "+rows);
		
		
		
	    // 2) Find the total number of columns
		
		int column=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();		
		//int cols=driver.findElements(By.tagName("th")).size();   dont prefer if you have multiple tables
		System.out.println("Number of column: "+column); //4
		
		
		// 3) Read specific row & column data
		//String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
		//System.out.println(value);
		
		
	   // 4) Read data from all the rows & columns
		
		/*System.out.println("Book Name"+"        "+"Author"+"    "+"Subject"+"        "+"Price");
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=column;c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
				
			}
			System.out.println();
		}*/
		
		
		// 5) Print book names whose author is Amit
		
		/*for(int r=2;r<=rows;r++)
		{
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			
			if(author.equals("Mukesh"))
			{
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(author+"     "+bookname);
			}
		}*/
		
		// 6) Find sum of prices for all the books
		 
		int sum=0;
		
		for(int r=2;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
			sum=sum+Integer.parseInt(price);
		}
		
		System.out.println("Totla Price all the books: "+sum);
		
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
