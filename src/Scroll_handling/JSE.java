package Scroll_handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "F:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//Open the application
	driver.get("https://www.amazon.com/");
	//mazimize the browser
	driver.manage().window().maximize();
	//use javacsipt executor nterface
	JavascriptExecutor jse= (JavascriptExecutor)driver;
	//Sroll doewn
	
	jse.executeScript("Window.scrollBy(0,4000);");

}
}
