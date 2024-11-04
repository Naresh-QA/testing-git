package Css_locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tag_id {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//To import the webdeiver or crome drivers click on ctrl+shift+O
		driver.get("https://matrika.gold/");//to open desired website in the crome
		driver.manage().window().maximize();//this is used to maximize the windows
	    //driver.findElement(By.cssSelector("div#dropdownMenuButton1")).click();//it should open account using tag#id
	    /*List<WebElement> a=driver.findElements(By.cssSelector("div"));//it will open search bar using tag.classname
	    System.out.println("no of elements "+a.size());
		*/
		//driver.findElement(By.cssSelector("div[data-bs-toggle=\"dropdown\"]")).click();//we should be able to click on account using tagand attribute
		//driver.close();
		//driver.findElement(By.cssSelector("div.text-center[data-bs-toggle='dropdown']")).click();//we can clikc on using tag class and atribute
		
		driver.findElement(By.cssSelector("div.text-center[data-bs-toggle='dropdown']")).click();
	}

}
