package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifiocation {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver", "F:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--disable-notifications");
	c.addArguments("start-maximized");
	WebDriver driver =new ChromeDriver();
	Thread.sleep(3000);
	driver.get("https://www.hdfcbank.com/");
}
}
