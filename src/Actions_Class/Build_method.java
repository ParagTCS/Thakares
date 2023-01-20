package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Build_method {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\\\chrome driver\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/?gclid=CjwKCAiAkrWdBhBkEiwAZ9cdcFMmFcYHodFRf_vr6r3l-VyiZdrxup1esNastmf5x21YN0G2TsAAlxoCSooQAvD_BwE");
	//Choose the target element
	WebElement target = driver.findElement(By.xpath("//a[text()='Sign in']"));
	//Create object of Actions Class
	Actions act = new Actions(driver);
	
	//All method in single step by using build method and perform method
	
	act.moveToElement(target).contextClick().doubleClick().perform();
	
}
}
