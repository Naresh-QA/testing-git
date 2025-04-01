package Session_47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom_login {
	WebDriver driver;
	//Constructor
	pom_login(WebDriver driver){
		this.driver=driver;
	}
	//locators
	By Txt_username=By.xpath("//input[@id='email']");
	By txt_password=By.xpath("//input[@id='password']");
	By login_btn=By.xpath("//button[normalize-space()='Sign In']");
	//action method
	public void setusername(String name) {
		driver.findElement(Txt_username).sendKeys(name);
	}
	public void setpassword(String pwd) {
		driver.findElement(txt_password).sendKeys(pwd);
	}
	public void login() {
		driver.findElement(login_btn).click();
	}

}
