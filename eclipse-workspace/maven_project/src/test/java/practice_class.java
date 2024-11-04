import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_class {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://matrika.gold/");
		driver.findElement(By.xpath("select.search-input[formcontrolname='selectedCategory'][fdprocessedid='37udh']")).click();
}
}
