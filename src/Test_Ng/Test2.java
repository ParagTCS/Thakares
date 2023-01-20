package Test_Ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void TC1() {
		System.setProperty("webdriver.chrome.driver","F:\\chrome driver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.foundit.in/rio/login");
		driver.findElement(By.id("signInName")).sendKeys("thakareparag2@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Parag@123");
		driver.findElement(By.id("signInbtn")).click();
		
	}
@Test
public void TC_2() {
	Reporter.log("Hellow TC_2",true);
}
@Test
public void TC3() {
	Reporter.log("Hello TC3",true);
}
@Test
public void TC4() {
	Reporter.log("Hello TC4 is failed",true);
	Assert.fail();
}
}
