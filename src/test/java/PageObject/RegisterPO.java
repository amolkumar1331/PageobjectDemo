package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPO {

	WebDriver driver;

	public RegisterPO(WebDriver d) {
		driver = d;
	}

	@FindBy(id = "customer_firstname")
	WebElement fname;

	@FindBy(id = "customer_lastname")
	WebElement lname;

	@FindBy(id = "passwd")
	WebElement pass;

	@FindBy(id = "days")
	WebElement day;

	@FindBy(id = "months")
	WebElement month;

	@FindBy(id = "years")
	WebElement year;

	public void regi(String frname, String lrname, String pwd, String d, String m, String y)
			throws InterruptedException {
		fname.clear();
		lname.clear();
		fname.sendKeys(frname);
		lname.sendKeys(lrname);
		pass.clear();
		pass.sendKeys(pwd);

		Select sel1 = new Select(day);
		Thread.sleep(1000);
		Select sel2 = new Select(month);
		Thread.sleep(1000);
		Select sel3 = new Select(year);

		sel1.selectByVisibleText(d);
		Thread.sleep(2000);
		sel2.selectByVisibleText(m);
		Thread.sleep(2000);
		sel3.selectByVisibleText(y);

	}

}
