package Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
//implicit wait(Global Wait)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//maximize the browser
		driver.manage().window().maximize();
//By default the selenium focus is on webpage and we need to switch it to 1st frame
		driver.switchTo().frame("packageListFrame");
//For our confirmation take any sentense an frame 1st and print it
		String t1 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi']")).getText();
		System.out.println(t1);
//Now we require to jump to the main webpage 
		//driver.switchTo().defaultContent();
//By default the selenium focus is on webpage and we need to switch it to 2nd frame
		driver.switchTo().frame("packageFrame");
//For our confirmation take any sentense an frame 2nd and print it
		String t2 = driver.findElement(By.xpath("//a[text()='AcceptedW3CCapabilityKeys']")).getText();
		System.out.println(t2);
//Now we require to jump to the main webpage
		driver.switchTo().defaultContent();
//By default the selenium focus is on webpage and we need to switch it to 3rd frame
		driver.switchTo().frame("classFrame");
//For our confirmation take any sentense an frame 3rd and print it
		String t3 = driver.findElement(By.xpath("(//div[@class='block'])[2]")).getText();
		System.out.println(t3);

	}
}
