package pom_files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	//constructor
	 public Homepage (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//locators
	@FindBy(xpath="//button[normalize-space()='Register']")
	WebElement Click_register;
	
	//action methods
	public void register() {
		Click_register.click();
	}

}
