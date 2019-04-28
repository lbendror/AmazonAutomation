package infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import infra.config.MainConfig;
import infra.web.By2;

public class loginToAmazonPage extends AbstractPage{

	public static final By2 SignInSubmit = new By2("'Sign In' Submit", By.id("signInSubmit"));

	public loginToAmazonPage(WebDriver driver) throws Exception {
		super(driver, SignInSubmit);
	}
	// Step All
	public static void SignInSubmit() {
		bot.click(SignInSubmit);
	}
		// Step 3, 4, 5 ClearUsername and ClearPassword
		public static void ClearUsername() {
			WebElement ClearUsername = driver.findElement(By.id("ap_email"));
			ClearUsername.clear();
		}
		public static void ClearPassword() {
			WebElement ClearPassword = driver.findElement(By.id("ap_password"));
			ClearPassword.clear();
		}		
	// Step 2, 4, 5
	public static void EnterTheValidUsername() {
		WebElement EnterTheValidUsername = driver.findElement(By.id("ap_email"));
		EnterTheValidUsername.sendKeys(MainConfig.AmazonUsername);
	}
	public static void EnterTheValidPassword() {
		WebElement EnterTheValidPassword = driver.findElement(By.id("ap_password"));
		EnterTheValidPassword.sendKeys(MainConfig.AmazonPassword);
	}
}