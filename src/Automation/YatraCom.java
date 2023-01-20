package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YatraCom {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "F:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yatra.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement price= driver.findElement(By.xpath("//span[@class='ytfi-angle-down v-aligm-m']"));
		
		
	}

}
