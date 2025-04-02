package pom_files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class base_pomclass {
	WebDriver driver;
	public base_pomclass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
