package Session_29;

import java.sql.Driver;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class framesandiframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//frame [@src=\'frame_1.html\']")));
		driver.switchTo().frame(element);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']"))).sendKeys("enter");
		Thread.sleep(5000);
		//driver.close();
		System.out.println("completed");
		driver.switchTo().defaultContent();//it is used to switch  the driver to old page.
		WebElement frame3= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//frame[@src='frame_3.html']")));
		driver.switchTo().frame(frame3);
		System.out.println("switched  to frame 3");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']"))).sendKeys("naresh");
		WebElement frame3_1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']")));
		driver.switchTo().frame(frame3_1);
		//driver.findElement(By.xpath("//div[@class='uHMk6b fsHoPb']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uHMk6b fsHoPb']"))).click();
		Thread.sleep(5);
		//driver.close();
		driver.switchTo().defaultContent();
		WebElement frame5=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//frame[@src='frame_5.html']")));
		driver.switchTo().frame(frame5);
		String parentwindow=driver.getWindowHandle();	
		System.out.println(parentwindow +driver.getTitle());

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']"))).sendKeys("kodaru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"https://a9t9.com\"]")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> windowshandlesSet=driver.getWindowHandles();
		System.out.println("Total Windows Opened: " + windowshandlesSet.size());

		for(String windowString:windowshandlesSet) {
			driver.switchTo().window(windowString);
			System.out.println(windowString);
		}
		//System.out.println(windowshandlesSet);

		System.out.println("you will be able to see the window handles");
		
//		
//		String itString=driver.findElement(By.xpath("driver.findElement(By.xpath(\"//a[@href=\\\"https://a9t9.com\\\"]\")).click();\r\n")).getText();
//		System.out.println("testing");
//		System.out.println(itString);
//		Thread.sleep(5000);
	}

}
