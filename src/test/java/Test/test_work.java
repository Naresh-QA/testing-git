package Test;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test_work {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	driver.get("https://testautomationpractice.blogspot.com/");
	List<WebElement> element=(List<WebElement>) wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//table//input[@type='checkbox' ]")));
	//List<WebElement> wherElements=driver.findElements(By.xpath("//table//input[@type='checkbox' ]"));
	for(int click=3;click<element.size();click++) {
		element.get(click).click();
	}
	
	
	System.out.println("success");
}
}

