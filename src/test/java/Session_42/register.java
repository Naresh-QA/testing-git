package Session_42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class register {
	WebDriver driver;
	@ Test(priority=3)
	void register(){
		driver.findElement(By.xpath("//span[@routerlink='/register']")).click();
	}

}
