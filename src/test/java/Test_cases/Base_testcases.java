package Test_cases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_testcases {
	public WebDriver driver;
@BeforeClass
public void setup() throws InterruptedException {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.goldbharat.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	
}
@AfterClass
public void tearup() {
	driver.quit();
}
public String randomString() {
	String generatedString=RandomStringUtils.randomAlphabetic(8);
	return generatedString;
}
public String rendomnumber() {
	String generatednumber=RandomStringUtils.randomNumeric(10);
	return generatednumber;
}
public String randomalphanumeric() {
	String generatedString=RandomStringUtils.randomAlphabetic(2);
	String generatednumber=RandomStringUtils.randomNumeric(5);
	return (generatedString+generatednumber);

}

}
