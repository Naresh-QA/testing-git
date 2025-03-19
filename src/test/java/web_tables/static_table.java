package web_tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.For_loop;
import io.opentelemetry.sdk.metrics.internal.view.SumAggregation;

public class static_table {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//to find the no of rows in the table
		int row=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("no of rows :"+ row);
		//to find the no of columns in the table
				int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
				System.out.println("no of columns :"+ columns);
		// to find the Element in specific rows and columns in the table
				String element= driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[4]")).getText();
				System.out.println(element);
				//driver.close();
		//Read all the data from rows and columns
				for(int rowvalue=3;rowvalue<= row;rowvalue++) {
					for(int columnvalue=1;columnvalue<=columns;columnvalue++) {
						String xString=wait.until(ExpectedConditions.visibilityOfElementLocated (By.xpath("//table[@name='BookTable']//tr["+rowvalue+"]//td["+columnvalue+"]"))).getText();
						if (xString.equals("Javascript")) {
							String textString=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+rowvalue+"]//td["+2+"]")).getText();
							System.out.println(textString +" "+xString );

						}
						//System.out.print(xString+ " | ");
					//System.out.println("javascript "+textString );
				}
					}
				
		//add data 
				for(int r=3;r<=row;r++) {
					//for(int c=1;c<=columns;c++)
					{
						String valueString=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
						
						System.out.print(valueString);
	
					}
					System.out.println();
				}
				
				
				driver.close();
	}

}
