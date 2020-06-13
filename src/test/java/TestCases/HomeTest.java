package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObject.HomePO;

public class HomeTest extends BaseClass {

	@Test()
	public void signup() {
		HomePO hp = PageFactory.initElements(driver, HomePO.class);
		hp.signup();
	}

}
