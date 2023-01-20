package Automation;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class{
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "F:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//create object of robot class
		Robot r=new Robot();
		//Keypress
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		//Key realese
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		//Key realese
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		//Key realese
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		//Key realese
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		//Key realese
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		//Key realese
		r.keyRelease(KeyEvent.VK_PAGE_UP);
	}
	
}