package Test_Ng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
@Test
public void TC1() {
	Reporter.log("Hi... How r u?",true);
}
@Test
public void TC2() {
	Reporter.log("Good",true);
	Assert.fail();
	
}
@Test
public void TC3() {
	Reporter.log("TC3 is passsed",true);
	
}
@Test
public void TC4() {
	Reporter.log("TC4 is Failed",true);
	Assert.fail();
}
}