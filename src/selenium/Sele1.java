package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.speedtest.net/");
	String q="Speedtest by Ookla - The Global Broadband Speed Test";
	String p =driver.getTitle();
	if(q.equals(p)) {
		System.out.println("Tc is pass");
	}
	else {
		System.out.println("Tc is fail");
	}
}
}