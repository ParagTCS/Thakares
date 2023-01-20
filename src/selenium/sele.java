package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sele {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/watch?v=O0LHk-slM40");
	
}
}
