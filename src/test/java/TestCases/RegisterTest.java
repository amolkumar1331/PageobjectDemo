package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObject.RegisterPO;

public class RegisterTest extends BaseClass {

	@Test
	public void register() throws InterruptedException {
		RegisterPO rp = PageFactory.initElements(driver, RegisterPO.class);
		rp.regi("amol", "kumar", "Amol123", "13  ", "December ", "1991  ");
	}
}
