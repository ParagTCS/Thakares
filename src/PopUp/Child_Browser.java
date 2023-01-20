package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Automation.Keys_Class;

public class Child_Browser {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "F:\\\\chrome driver\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//Click on popup x
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//search any mobile
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobile under 30000",Keys.ENTER);
		//Click on 1st phone
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		//Switch the contol 
		Set<String> allwindows = driver.getWindowHandles();
		//Create object of arraylist
		ArrayList<String> al = new ArrayList<String>(allwindows);
		//Print main window id
		String mainid = al.get(0);
		System.out.println(mainid);
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		//Switch to child browser
		driver.switchTo().window(al.get(1));
		//Print session id
		String cldwindow = al.get(1);
		System.out.println(cldwindow);
		String Title = driver.getTitle();
		System.out.println(Title);
}
}
