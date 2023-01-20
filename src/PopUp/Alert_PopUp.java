package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\\\chrome driver\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	//Enter customer id
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("72726");
	//Click on submit btn
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	//fIRST OF ALL WE NEED TO switch the control of selenium from webpage to popup 
	Alert Alt = driver.switchTo().alert();
	//Alt.accept();
	//Alt.dismiss();
	String text = Alt.getText();
System.out.println(text);
}
}