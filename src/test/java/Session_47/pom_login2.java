package Session_47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_login2 {
	WebDriver driver;
	//constructor
	pom_login2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//locators
	@FindBy(xpath="//input[@id='email']") 
	WebElement Txt_username;
	@FindBy(xpath="//input[@id='password']")
	WebElement Txt_password;
	@FindBy(xpath="//button[normalize-space()='Sign In']")
	WebElement login_btn;
	public void setusername(String name) {
		Txt_username.sendKeys(name);
		
	}
	public void setpassword(String pwd) {
		Txt_password.sendKeys(pwd);
		
	}
	public void login() {
		login_btn.click();
	}
	

}
