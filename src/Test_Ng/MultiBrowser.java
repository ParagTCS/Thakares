package Test_Ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
	@Parameters("browsername")
@Test
public void TC1(String browsername) {
	WebDriver driver=null;
	if(browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\chrome driver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	else if(browsername.equals("Firefox")){
		System.setProperty("webdriver.gecko.driver", "F:\\gecko driver\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
	driver.get("https://www.flipkart.com/");
}

}
