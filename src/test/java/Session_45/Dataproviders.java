package Session_45;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviders {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeClass
	void open_application() {
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://stg-fms.goldbox.gold/");
		driver.manage().window().maximize();
		
	}
	@ Test(dataProvider = "ld")
	void login(String email,String password) {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='email']"))).sendKeys(email);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter your password']"))).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).clear();

		boolean image=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='header'] //img[@src='assets/img/logo.png']"))).isDisplayed();
		if(image==true) {
			assertEquals(image, true);
					
			
		}
		else {
			assertEquals(image, false);
		}
		
	}
	@AfterClass
	void logout() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class=\"user-name\"]")).click();
		driver.findElement(By.xpath("//img[@src=\"assets/img/icons/log-out.svg\"]")).click();
		driver.findElement(By.xpath("//button[@style=\"display: inline-block; background-color: rgb(99, 9, 20);\"]")).click();
		//driver.switchTo().alert().accept();
		driver.close();
	}
@ DataProvider(name="ld",indices = {0})
Object[][] data() {
	Object list[][]= {
			{"soumya","test"},
			{"soumya@gamil","testing"},
			{"soumya@gmail.com","Backend@2024"}
	};
	return list;
}
}