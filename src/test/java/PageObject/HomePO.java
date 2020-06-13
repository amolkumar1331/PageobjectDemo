package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePO {

	WebDriver driver;

	public HomePO(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;

	@FindBy(xpath = "//*[@id='contact-link']/a")
	WebElement Contactus;

	public void signup() {
		signIn.click();
	}

	public void contact() {
		Contactus.click();
	}

}
