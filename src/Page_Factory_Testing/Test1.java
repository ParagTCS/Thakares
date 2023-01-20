package Page_Factory_Testing;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	Sheet sh;
	WebDriver driver;
	LoginPage l;
	HomePage h;
@BeforeClass
public void openBrowser() throws Throwable {
	FileInputStream fs=new FileInputStream("C:\\Users\\M\\Desktop\\Actitime.xlsx");
	sh = WorkbookFactory.create(fs).getSheet("Sheet1");
	System.setProperty("webdriver.chrome.driver", "F:\\\\chrome driver\\\\chromedriver_win32\\\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	// All object we need to create
	l=new LoginPage(driver);
	h =new HomePage(driver);
}
@BeforeMethod
public void openApp() {
	String username = sh.getRow(0).getCell(0).getStringCellValue();
	l.enterUN(username);
	String password = sh.getRow(0).getCell(1).getStringCellValue();
	l.enterPWD(password);
	l.clickLoginBTN();
	
}
@Test
public void verifyTest() {
	Reporter.log("Running verify test",true);
	String expText = sh.getRow(0).getCell(2).getStringCellValue();
	String actText = h.verifyText();
	Assert.assertEquals(expText, actText);
}
@AfterMethod
public void logout() {
	Reporter.log("Logout from app",true);
}
@AfterClass
public void closeBrowser() {
	Reporter.log("Closing the browser",true);
}
}
