package Test_Ng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing_Annotation {
@BeforeClass
public void openBrowser() {
	Reporter.log("Open Browser",true);
}
@BeforeMethod
public void ogintoApp() {
	Reporter.log("Login to app",true);
}
@Test
public void verifyText() {
	Reporter.log("Running actual test",true);
}
@AfterMethod
public void logoutApp() {
	Reporter.log("Logout from the app",true);
}
@AfterClass
public void closeBrowser() {
	Reporter.log("Close the browser",true);
}
}