package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigningPO {
	WebDriver driver;

	public SigningPO(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(id = "email_create")
	WebElement signupemail;

	@FindBy(id = "SubmitCreate")
	WebElement signupbtn;

	@FindBy(id = "email")
	WebElement signinemail;

	@FindBy(id = "passwd")
	WebElement signinPass;

	@FindBy(id = "SubmitLogin")
	WebElement signinbtn;

	public void signup(String mail) {
		signupemail.clear();
		signupemail.sendKeys(mail);
		signupbtn.click();

	}

	public void signIn(String email, String pass) {
		signinemail.clear();
		signinemail.sendKeys(email);
		signinPass.clear();
		signinPass.sendKeys(pass);
		signinbtn.click();
	}
}
