//package Session_45;
//
//import static org.testng.Assert.assertEquals;
//
//import java.time.Duration;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.bidi.module.Browser;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import org.testng.annotations.Parameters;
//
//
//import com.beust.jcommander.Parameter;
//
//public class Dataproviders {
//	WebDriver driver;
//	WebDriverWait wait;
//	@BeforeClass
//	@Parameters("browser")
//	void open_application(String br) {
//		switch (br.toLowerCase()) {
//		case"chrome":driver=new ChromeDriver();break;
//		case"firefox":driver=new FirefoxDriver();break;
//		case"edge":driver=new EdgeDriver();break;
//		default: System.out.println("no browser found");
//
//		}
//		//driver=new ChromeDriver();
//		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		driver.get("http://stg-fms.goldbox.gold/");
//		driver.manage().window().maximize();
//		
//	}
//	@ Test(dataProvider = "ld")
//	void login(String email,String password) {
//		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='email']"))).sendKeys(email);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter your password']"))).sendKeys(password);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.xpath("//input[@formcontrolname='email']")).clear();
//		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).clear();
//
//		boolean image=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='header'] //img[@src='assets/img/logo.png']"))).isDisplayed();
//		if(image==true) {
//			assertEquals(image, true);
//					
//			
//		}
//		else {
//			assertEquals(image, false);
//		}
//		
//	}
//	@AfterClass
//	void logout() throws InterruptedException {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[@class=\"user-name\"]")).click();
//		driver.findElement(By.xpath("//img[@src=\"assets/img/icons/log-out.svg\"]")).click();
//		driver.findElement(By.xpath("//button[@style=\"display: inline-block; background-color: rgb(99, 9, 20);\"]")).click();
//		//driver.switchTo().alert().accept();
//		driver.close();
//	}
//@ DataProvider(name="ld",indices = {0})//indices is used to use how arrays we need to use
//Object[][] data() {
//	Object list[][]= {
//			{"soumya","test"},
//			{"soumya@gamil","testing"},
//			{"soumya@gmail.com","Backend@2024"}
//	};
//	return list;
//}
//}


package Session_45;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dataproviders {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    @Parameters("browser")  // ✅ Correct TestNG annotation (no curly braces)
    void open_application(String br) {
        switch (br.toLowerCase()) {  // Case-insensitive check
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("No browser found, defaulting to Chrome");
                driver = new ChromeDriver();  // Fallback to Chrome
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://stg-fms.goldbox.gold/");
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "ld")
    void login(String email, String password) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='email']"))).sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter your password']"))).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Clear fields after submission (optional)
        driver.findElement(By.xpath("//input[@formcontrolname='email']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).clear();

        // Check if login was successful
        boolean logoDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[@class='header']//img[@src='assets/img/logo.png']")
        )).isDisplayed();
        assertEquals(logoDisplayed, true, "Logo should be visible after login");
    }

    @AfterClass
    void logout() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='user-name']")).click();
        driver.findElement(By.xpath("//img[@src='assets/img/icons/log-out.svg']")).click();
        driver.findElement(By.xpath("//button[contains(@style,'background-color')]")).click();
        driver.quit();  // Properly close the browser
    }

    @DataProvider(name = "ld")
    Object[][] data() {
        return new Object[][] {
            {"soumya", "test"},
            {"soumya@gmail.com", "testing"},
            {"soumya@gmail.com", "Backend@2024"}
        };
    }
}


