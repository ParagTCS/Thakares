package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_Popup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\\\chrome driver\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//Click on popup x
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
}
}
