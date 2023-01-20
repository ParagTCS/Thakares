package Test_Ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
@Test
public void TC1() {
	System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\chrome driver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/watch?v=8AMlbvIt9As&t=1517s");
}
}
