package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Switch_windows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goldbharat.com/");
		driver.manage().window().maximize();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='../../assets/goldbahratgoogleplay.png']")));

	}

}
