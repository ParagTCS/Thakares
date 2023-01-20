 package Test_Ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
@Test
public void TC1() {
	Reporter.log("My first programm",true);
	
}
@Test(enabled = false)
public void TC12() {
	Reporter.log("My Second programm",true);
}
}