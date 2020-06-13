package Base;
	
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fp;

	@BeforeSuite
	public void openBrowser() throws IOException {

		prop = new Properties();
		fp = new FileInputStream(new File("D:\\Class\\PageObjectDemo\\src\\test\\java\\resource\\config.properties"));
		prop.load(fp);
		if (prop.get("Browser").equals("Chrome")) {
			System.out.println("inside loop");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (prop.get("Browser").equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Browser not found");
		}

		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	/*@Test(priority =0)
	public void validatetitle() {

		String expectedtitle = "My Store";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
	}

	@Test()
	public void validateUrl() {
		String expectedUrl = "http://automationpractice.com/index.php";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
*/	
//	@AfterSuite
//	public void closeBroser() {
//		if (!(driver == null)) {
//			driver.close();
//		}
//	}
}
