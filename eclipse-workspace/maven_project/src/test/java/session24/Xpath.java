package session24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://matrika.gold/");
		driver.manage().window().maximize();
		boolean x=driver.findElement(By.xpath("//p[text()='Live Rates']")).isDisplayed();// isdispalyed means weather it is displayed or not
		System.out.println(x);
		String xy=driver.findElement(By.xpath("//p[text()='Live Rates']")).getText();// getText means it will get the text from the element
		if (xy== ("live rates"))
			{
				System.out.println("it is matching with the expecting result");
			}
		else
		{
			System.out.println("not matching with the expected results");
		}
		driver.close();

	}

	
}
