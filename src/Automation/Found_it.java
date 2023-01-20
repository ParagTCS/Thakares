package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Found_it {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver","F:\\chrome driver\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver =new ChromeDriver();
	//get method
	driver.get("https://www.foundit.in/rio/login");
	//enter username
	driver.findElement(By.id("signInName")).sendKeys("thakareparag2@gmail.com");
	//enter password
	driver.findElement(By.id("password")).sendKeys("Parag@123");
	//click on login button
	driver.findElement(By.id("signInbtn")).click();
	//Remove pop up
	driver.findElement(By.className("btn close-button")).click();
}	
}
