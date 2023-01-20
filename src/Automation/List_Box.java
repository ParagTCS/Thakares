package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Box {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver","F:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//get method
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
	//click on create new acc btn
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(4000);
	//select day list_box
	WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
	//create object of Select class 
	Select p =new Select(day);
	Thread.sleep(4000);
	//Use select_class method
	p.selectByVisibleText("15");
	Thread.sleep(4000);
	//select month list_box
	WebElement month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
	//create object of Select class
	Select s=new Select(month);
	Thread.sleep(4000);
	//Use select_class method
	s.selectByVisibleText("Mar");
	Thread.sleep(4000);
	//select year list_box
	WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
	//create object of Select class
	Select t =new Select(year);
	Thread.sleep(4000);
	//Use select_class method
	t.selectByVisibleText("1994");
	Thread.sleep(4000);
}
}
