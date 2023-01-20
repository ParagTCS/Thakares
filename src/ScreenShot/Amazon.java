package ScreenShot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazon {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","F:\\chrome driver\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	TakesScreenshot ps= (TakesScreenshot)driver;
	File src = ps.getScreenshotAs(OutputType.FILE);
	File dest = new File("F:\\\\amazon.png");
	Files.copy(src, dest);
	 

}
}
