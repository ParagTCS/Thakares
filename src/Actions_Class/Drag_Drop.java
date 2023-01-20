package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\chrome driver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	
	WebElement Ele1 = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement Ele2 = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	//Create object of Actions Class
	
	Actions act = new Actions(driver);
	
	act.dragAndDrop(Ele1, Ele2).perform();
}
}
