package Session_44;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class grouping {
	WebDriver driver;
	@ Test(priority = 1, groups = "test")
	void signin() {
		driver=new ChromeDriver();
		driver.get("sfvsdvsv");
		System.out.println("try to sign in");
	}
@Test(priority = 2, groups="testing",dependsOnMethods = {"signin"})
void name() {
	System.out.println("try to enter a name");
}
@ Test(priority=3,groups="testing")
void login() {
	System.out.println("trying to login");
}
@ Test(priority = 4,groups = "test")
void logout() {
	System.out.println("trying to logout");
}
}

