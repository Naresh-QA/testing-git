package Session_46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.gson.annotations.Until;

public class listners {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeClass 
void open_application() {
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("http://stg-fms.goldbox.gold/signin");
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
void login() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='email']"))).sendKeys("soumya@gmail.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='password']"))).sendKeys("Backend@2024");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
	}
	@Test(priority = 2)
void image() {
		String logoString=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='assets/img/logo.png]"))).getText();
		System.out.println(logoString);

	}
	@Test(priority = 3,dependsOnMethods = {"image"})
void users() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/dashboard']//i[@class='feather icon-grid']"))).click();
	
	}
}

