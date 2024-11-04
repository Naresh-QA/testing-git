package session21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class launch_browser {

	public static void main(String[] args) {
        //WebDriver driver = new ChromeDriver(); // This is valid since ChromeDriver is a subclass of WebDriver
        WebDriver driver = new EdgeDriver();
        //WebDriver webDriver = new ChromeDriver(); // This is also valid since ChromeDriver implements WebDriver
        driver.get("http://stg-fms.goldbox.gold");
        String title=driver.getTitle();
        if (title.equals("Gold Box"))
        {
        	System.out.println("passed");
        }
        else {
        	System.out.println("failed");
        	driver.quit();
        }
    }
}
