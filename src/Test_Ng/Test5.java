package Test_Ng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test5 {
	@Test
	public void TC01() {
		Reporter.log("TC01 is fail",true);
		Assert.fail();
}
	@Test
	public void TC02() {
		Reporter.log("TC02 is fail",true);
		Assert.fail();
	}
	@Test
	public void TC03() {
		Reporter.log("TC03 is fail",true);
		Assert.fail();
	}
	@Test
	public void TC04() {
		Reporter.log("TC04 is fail",true);
		Assert.fail();
	}
}
