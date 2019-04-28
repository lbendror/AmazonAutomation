package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import il.co.topq.difido.ReportDispatcher;
import il.co.topq.difido.ReportManager;
import infra.config.MainConfig;
import infra.pages.AmazonLandingPage;
import infra.pages.SitePreferencesOnAmazonPage;
import infra.pages.loginToAmazonPage;

public class SitePreferencesOnAmazon extends AbstractTest{

	protected ReportDispatcher report = ReportManager.getInstance();

	@Test
	public void _011_SitePreferencesOnAmazon() throws Exception {

		// Step 1 - Browse to amazon.com landing page.
		report.startLevel("Step 1 - Browse to amazon.com landing page");
		browseToUrl(MainConfig.baseUrl);
		AmazonLandingPage amazonLandingPage = new AmazonLandingPage(driver);
		report.endLevel();

		// Step 2 - Verify you have a valid Username And Password, and you logged-in to amazon site.	
		// Appear Hello <name> Account & Lists.
		report.startLevel("Step 2 - Verify you have a valid Username And Password, and you logged-in to amazon site.");
		AmazonLandingPage amazonHelloSignInLink = new AmazonLandingPage(driver);
		amazonHelloSignInLink.amazonHelloSignIn();
		loginToAmazonPage.EnterTheValidUsername();
		loginToAmazonPage.EnterTheValidPassword();
		loginToAmazonPage.SignInSubmit();
		report.endLevel();
		
		// Click on your ‚ÄúHello, Username‚Äù link.
		//Transferred to Your Account page
		report.startLevel("Click on your ‚ÄúHello, Username‚Äù link.");
		amazonHelloSignInLink.amazonHelloSignIn();
		report.endLevel();

		// Step 4 - Click on Your Orders link.
		//You have placed in your orders page.
		report.startLevel("Step 4 - Click on Your Orders link.");
		SitePreferencesOnAmazonPage.clickYourOrdersLink();
		Thread.sleep(1000);
		report.endLevel();

		// Step 5 - Click on ‚ÄòYour Account link‚Äô to Return back.	
		//You Return to your account page.
		report.startLevel("Step 5 - Click on ‚ÄòYour Account link‚Äô to Return back.");
		SitePreferencesOnAmazonPage.ReturnToYourAccountLink();
		Thread.sleep(1000);
		report.endLevel();

		// Step 6 - Click on Prime link.	
		//You have placed in your Prime page.
		report.startLevel("Step 6 - Click on Prime link.");
		SitePreferencesOnAmazonPage.ClickOnPrimeLinkLink();
		Thread.sleep(1000);
		report.endLevel();

		// Step 7 -  Click on ‚ÄòYour Account link‚Äô to Return back.	
		//You Return to your account page.
		report.startLevel("Step 7 -  Click on ‚ÄòYour Account link‚Äô to Return back.");
		SitePreferencesOnAmazonPage.ReturnFromPrimeLink();
		Thread.sleep(1000);
		report.endLevel();

		// Step 8 - Click on Your Address link.	
		//You have placed in your Address page.
		report.startLevel("Step 8 - Click on Your Address link.");
		SitePreferencesOnAmazonPage.ClickOnYourAddressLink();
		Thread.sleep(1000);
		report.endLevel();

		// Step 9 - Click on ‚Your Account link‚Äô to Return From Your Address Link.	
		//You Return to your account page.
		report.startLevel("Step 9 - Click on ‚ÄòYour Account link‚Äô to Return From Your Address Link.");
		SitePreferencesOnAmazonPage.ReturnFromYourAddressLink();
		Thread.sleep(1000);
		report.endLevel();

		// Step 10 - Click on Payment options link.	
		//You have placed in your Payment options page.
		report.startLevel("Step 10 - Click on Payment options link.");
		SitePreferencesOnAmazonPage.ClickOnPaymentOptionsLink();
		Thread.sleep(1000);
		report.endLevel();

		// Step 11 -  Click on ‚Your Account link‚Äô to Return From Payment options Link.	
		//You Return to your account page.
		report.startLevel("Step 11 -  Click on ‚ÄòYour Account link‚Äô to Return back.");
		SitePreferencesOnAmazonPage.ReturnFromPaymentOptionsLink();
		Thread.sleep(1000);
		report.endLevel();

		// Step 12 - Click on Gift cards link.	
		//You have placed in your Gift cards page.
		report.startLevel("Step 12 - Click on Gift cards link.");
		SitePreferencesOnAmazonPage.ClickOnGiftCardsLink();
		Thread.sleep(1000);
		report.endLevel();

		// Step 13 - Click on ‚ÄòYour Account link‚Äô to Return From Gift cards link.	
		//You Return to your account page.
		report.startLevel("Step 13 - Click on ‚ÄòYour Account link‚Äô to Return From Gift cards link.");
		SitePreferencesOnAmazonPage.ReturnFromGiftCardsLink();
		Thread.sleep(1000);
		report.endLevel();
		
		// Step 14 - Verify You Successfully finished to Test On Site Preferences, You are in 'Your Account', Page.
		WebElement warningMessageTitle = driver.findElement(By.xpath("//div[@class='a-row a-spacing-base']/h1[contains(text(),'Your Account')]"));
		report.startLevel("Step 14 - You Successfully finished to Test On Site Preferences, You are in 'Your Account', Page.");
		String warningMessageTitleText = warningMessageTitle.getText();
		Assert.assertEquals(warningMessageTitleText, "Your Account", "Step 14 - You Successfully finished to Test On Site Preferences, You are in 'Your Account', Page.");
		report.startLevel("Step 14.1 - Verified, You Successfully finished to Test On Site Preferences, You are in '"+warningMessageTitleText+"', Page.");
		report.endLevel();
	} 
}
