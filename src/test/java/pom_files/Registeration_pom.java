package pom_files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registeration_pom extends base_pomclass{
	//Constructor
	public Registeration_pom(WebDriver driver){
		super(driver);//extended from basepom class
	}
	//locators
	@FindBy(xpath="xpath=\"//input[@placeholder=' Ex: Retail Gold']\"")
	WebElement BusinessName;
	@FindBy(xpath="//input[@placeholder=' Ex: Kumar']")
	WebElement fullname;
	@FindBy(xpath="//input[@placeholder=' Ex: *********@gmail.com']")
	WebElement mailid;
	@FindBy(xpath="//input[@placeholder=' Ex: 891******4']")
	WebElement phonenumber;
	@FindBy(xpath="//input[@placeholder=' Ex: +91**********']")
	WebElement date;
	@FindBy(xpath="//input[@placeholder=' Ex: 5*****']")
	WebElement pincode;
	@FindBy(xpath="//p[normalize-space()='Ameenabad']")
	WebElement circle;
	@FindBy(xpath="//textarea[@class='input-filed ng-untouched ng-pristine ng-invalid']")
	WebElement address;
	@FindBy(xpath="//button[normalize-space()='Register']")
	WebElement register;
	//action methods
	public void setbusinessname(String name) {
		BusinessName.sendKeys(name);
	}
	public void setfullname(String Fullname) {
		fullname.sendKeys(Fullname);
	}
	public void setmailid(String Mailid) {
		mailid.sendKeys(Mailid);
	}
	public void setphonenumber(String Phonenumber) {
		phonenumber.sendKeys(Phonenumber);
	}
	public void setdate(String Date) {
		date.sendKeys(Date);
	}
	public void setpincode(String Pincode) {
		pincode.sendKeys(Pincode);
	}
	public void setcircle(String Circle) {
		circle.sendKeys(Circle);
	}
	public void setaddress(String Address) {
		address.sendKeys(Address);
	}
	public void setregister() {
		register.click();
	}	
}



