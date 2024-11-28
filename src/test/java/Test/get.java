package Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class get {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goldbharat.com/");
		driver.manage().window().maximize();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='loginbotn']")).click();
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname=\"phone\"]"))).sendKeys("703275329");
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit' or fdprocessedid='0w6ab8']"))).click();
		String x=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.validationError"))).getText();
		if (x=="Please enter a valid mobile number.")	
			System.out.println("true");
		else
			System.out.println("it is not matching with the desired element");
		driver.navigate().back();
		driver.navigate().forward();		
	}
}
