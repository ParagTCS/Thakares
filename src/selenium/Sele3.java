package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele3  {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","F:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.foundit.in/seeker/dashboard");
		String P= driver.getTitle();
		System.out.println(P);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		
	}

}
