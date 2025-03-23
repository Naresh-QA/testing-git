package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test_work {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.google.com/");
WebElement searchbox=driver.findElement(By.xpath("//textarea[@id='APjFqb']")); 
searchbox.sendKeys("football");
searchbox.sendKeys(Keys.SPACE);

List<WebElement> search=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
	    By.xpath("//ul[@role='listbox']//li//div[@role='option']")));

Thread.sleep(5000);
System.out.println(search.size());
for(WebElement required:search) {
	String returns=required.getText();
	System.out.println(returns);
	if(returns.equals("football coaching near me")) {
		required.click();
		break;
	}
	
}Thread.sleep(5000);
//for(int i=0;i<search.size();i++) {
//	System.out.println(search.get(i).getText());
//	if(search.get(i).getTagName().equals("football matches today")) {
//		search.get(i).click();
//	}
//}
driver.close();

	
	

}
}

