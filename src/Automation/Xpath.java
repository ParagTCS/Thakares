package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//get method
	driver.get("https://www.foundit.in/rio/login");
	//enter username
	driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("thakareparag2@gmail.com");
	//enter password
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Parag@123");
	//Click on login btn
	driver.findElement(By.xpath("//input[@alt='foundit Sign In']")).click();
	String expT= "Jobseeker's Sign in - Search & Apply to Latest Jobs Online | foundit India";
	String actT =driver.getTitle();
	System.out.println(actT);
	if(expT.equals(actT)) {
		System.out.println("TC is pass");
	}
	else {
		System.out.println("TC is fail");
	}
}
}
