
package Test;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Session_30.select_dropdown;

public class test_work {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://blazedemo.com/");
	driver.manage().window().maximize();
//WebElement selectElement=
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name=\"fromPort\"]"))).click();
	//Select select=new select(selectElement);
			driver.findElement(By.xpath("//option[@value=\"Paris\"]")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[@value=\"Buenos Aires\"]"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value=\"Find Flights\"]"))).click();
}
}

