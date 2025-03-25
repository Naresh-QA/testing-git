package Session_42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class firsttestngclass {
	WebDriver driver;
	WebDriverWait wait;
@ Test(priority=1)
	void open_application()	{
	 driver=new ChromeDriver();
	 wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	 driver.get("https://www.goldbharat.com/");
	 driver.manage().window().maximize();
}
@ Test(priority=2)
void Login() throws InterruptedException {
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@routerlink=\"/login\"]"))).click();
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='number']"))).sendKeys("7032753299");
	 Thread.sleep(5000);
	 //driver.close();
	 
}
		
}

