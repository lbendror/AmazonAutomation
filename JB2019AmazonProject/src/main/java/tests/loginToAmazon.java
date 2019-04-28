package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import il.co.topq.difido.ReportDispatcher;
import il.co.topq.difido.ReportManager;
import infra.config.MainConfig;
import infra.pages.AmazonLandingPage;
import infra.pages.loginToAmazonPage;

public class loginToAmazon extends AbstractTest{

	protected ReportDispatcher report = ReportManager.getInstance();

	@Test
	public void _05_loginToAmazon() throws Exception{

		// Step 1 - Browse to amazon.com landing page
		report.startLevel("Step 1 - Browse to amazon.com landing page");
		browseToUrl(MainConfig.baseUrl);
		AmazonLandingPage amazonLandingPage = new AmazonLandingPage(driver);
		report.endLevel();

		report.startLevel("Step 1.1 - Click on Hello Sign In Link.");
		AmazonLandingPage amazonHelloSignInLink = new AmazonLandingPage(driver);
		amazonHelloSignInLink.amazonHelloSignIn();
		report.endLevel();

		// Step 2 - Enter a VALID USERNAME and Leave PASSWORD BLANK in the password field.
		// Proper error must be displayed and prompt to enter login again.
		report.startLevel("Step 2 - Enter a VALID USERNAME and Leave PASSWORD BLANK in the password field.");
		loginToAmazonPage.EnterTheValidUsername();
		loginToAmazonPage.ClearPassword();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		loginToAmazonPage.SignInSubmit();
		report.endLevel();

		// Step 3 - Leave the USERNAME BLANK and Enter a VALID PASSWORD in the password field.
		// Proper error must be displayed and prompt to enter login again.
		report.startLevel("Step 3 - Leave the username EMPTY in the user id and Enter a valid userג€™s password in the password field.");
		loginToAmazonPage.ClearUsername();
		loginToAmazonPage.ClearPassword();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		loginToAmazonPage.EnterTheValidPassword();
		loginToAmazonPage.SignInSubmit();
		report.endLevel();

		// Step 4 - Enter a VALID USERNAME and (INCORRECT) PASSWORD in the password field.
		// Proper error appear: There was a problem /n Your password is incorrect.
		report.startLevel("Step 4 - Enter a VALID USERNAME and (INCORRECT) PASSWORD in the password field.");
		loginToAmazonPage.ClearUsername();
		loginToAmazonPage.ClearPassword();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		loginToAmazonPage.EnterTheValidUsername();
		driver.findElement(By.id("ap_password")).sendKeys("1");
		loginToAmazonPage.SignInSubmit();
		report.startLevel("Step 4.1 - Proper error appear: There was a problem /n Your password is incorrect.");
		report.endLevel();

		// Step 5 - Enter Correct Username and password on the respective fields.
		// 2) Click submit/login.
		// User must successfully login to the web page.
		report.startLevel("Step 5 - Enter Correct Username and password on the respective fields.");
		loginToAmazonPage.ClearUsername();
		loginToAmazonPage.ClearPassword();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);		
		loginToAmazonPage.EnterTheValidUsername();
		loginToAmazonPage.EnterTheValidPassword();
		loginToAmazonPage.SignInSubmit();
		report.endLevel();

		// Step 6 - Verify you logged in. After login shown: 'Hello, Student2'.
		report.startLevel("Step 6 - You logged In. After login, You should See: 'Hello, Student2\\n\" + \"Account & Lists'");
		WebElement warningMessageTitle = driver.findElement(By.cssSelector("a[id='nav-link-accountList'],span[class='nav-line-1'][innertext='Hello Student2']"));
		String warningMessageTitleText = warningMessageTitle.getText();
		report.startLevel("Step 6.1 - Verify you logged in. After login You See: '"+ warningMessageTitleText +"'.");
		Assert.assertEquals(warningMessageTitleText, "Hello, Student2\n" + "Account & Lists", "Step 6.2 - Verify you logged in. After login You See: 'Hello, Student2\n" + "Account & Lists'");
		report.endLevel();
	}

}