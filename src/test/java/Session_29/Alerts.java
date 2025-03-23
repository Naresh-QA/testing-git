package Session_29;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("(//button[normalize-space()='Click for JS Alert'])[1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Alert myalerts=driver.switchTo().alert();
		Thread.sleep(2000);
		//myalerts.accept();
		myalerts.dismiss();
		Thread.sleep(2000);
		WebElement x = driver.findElement(By.xpath("//p[@id=\"result\"]"));
		String textString=x.getText();
		System.out.println(textString);
		if (textString.equals("You successfully clicked an alert")) {
			System.out.println("it is found");
			
			}
		else {
			System.out.println("not found");
		}driver.quit();
		
	}

}
