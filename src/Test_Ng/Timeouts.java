package Test_Ng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts {
@Test
public void TC1() {
	Reporter.log("My first programm",true);
}
@Test(timeOut = 5000)
public void TC2() {
	Reporter.log("My second programm",true);
	Assert.fail();
}
}
