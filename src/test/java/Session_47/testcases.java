package Session_47;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

public class testcases {
	WebDriver driver;
	@BeforeClass
	void setup() {
	driver=new ChromeDriver();
	driver.get("https://fms.goldbox.gold/signin");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	
	}
	@Test
	void testlogin() throws InterruptedException {
		pom_login lp=new pom_login(driver);
		lp.setusername("soumya@gmail.com");
		lp.setpassword("Backend@2024");
		lp.login();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		//Assert.assertEquals(driver.getTitle(),"Gold-box");
	}
	@AfterClass
	void teardown() {
		driver.quit();
	}
		
		
	}
	


