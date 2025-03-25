package Session_30;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class select_dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();//select[@class='form-control' and @id='country']"));
		WebElement selectElement=driver.findElement(By.xpath("//select[@class='form-control' and @id='country']"));

		Select select=new Select(selectElement);
		select.selectByContainsVisibleText("France");//select by visibility text
		select.selectByIndex(2);//select by index
		select.selectByValue("australia");//select by value
		List<WebElement>dropdownElements =select.getOptions();
		System.out.println("size of the web element : "
				+ dropdownElements.size());
//		for(int i = 0;i<dropdownElements.size();i++) {
//			System.out.println(dropdownElements.get(i).getText());
//			
//		}
		for (WebElement option : dropdownElements) {
		    System.out.println(option.getText());
		}
		driver.close();
	}

}
