package Sprint_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.goldbharat.com/");
	driver.manage().window().maximize();
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']"))).click();
	driver.get(null);

	driver.close();	
	}

}
