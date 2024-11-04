package session21;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://matrika.gold/");
		//By.id
		//boolean email=driver.findElement(By.id("email")).isDisplayed();
		//System.out.println("true");
		//By.linktext or partial link text
		List<WebElement> a=driver.findElements(By.className("img"));
		System.out.println("no of images are " +a.size());
		//driver .findElement(By.className("dropbtn")).click();
		driver.quit();
	}

}
