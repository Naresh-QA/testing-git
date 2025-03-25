package Session_29;

import java.util.List;

import javax.management.relation.InvalidRoleInfoException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
/*1.select specific check box
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		Thread.sleep(5000);
		driver.close();*/
//2.Selection of multiple check boxes
List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//		for(int boxes=0;boxes<=checkboxes.size();boxes++) {
//			checkboxes.get(boxes).click();}
//3.Select only few check boxes and unselect them onceagain.
		for (int boxes=3;boxes<checkboxes.size();boxes++) {
			checkboxes.get(boxes).click();
		if(checkboxes.get(boxes).isSelected()) {
			checkboxes.get(boxes).click();
			
		}
		}Thread.sleep(5000);driver.quit();
		
	}

}
