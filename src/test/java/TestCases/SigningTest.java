package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObject.SigningPO;

public class SigningTest extends BaseClass {

	public static SigningPO sp;

	@Test
	public void signUp() {

		sp = PageFactory.initElements(driver, SigningPO.class);
		sp.signup("amolkumar1331@gmail.com");
	}

	//@Test(enabled = false)
	public void signIn() {

	}

}
