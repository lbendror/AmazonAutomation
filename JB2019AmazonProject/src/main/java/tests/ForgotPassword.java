package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import il.co.topq.difido.ReportDispatcher;
import il.co.topq.difido.ReportManager;
import infra.pages.AddNewAddressOnAmazonPage;
import infra.pages.AmazonLandingPage;
import infra.pages.ForgotPasswordPage;

public class ForgotPassword extends AbstractTest{

	protected ReportDispatcher report = ReportManager.getInstance();

	@Test
	public void _03_ForgotPasswordTest() throws Exception {

		// Step 1 - Browse to amazon.com landing page
		report.startLevel("Step 1 - Browse to amazon.com landing page");
		browseToUrl("http://amazon.com");
		AmazonLandingPage amazonLandingPage = new AmazonLandingPage(driver);
		report.endLevel();

		// Step 2 - Click on Hello Sign in Link.	
		//Transferred to Sign in Page.
		report.startLevel("Step 2 - Click on Hello Sign in Link.");
		AmazonLandingPage amazonHelloSignInLink = new AmazonLandingPage(driver);
		amazonHelloSignInLink.amazonHelloSignIn();
		report.endLevel();

		// Step 3 - Click on “Forgot Password” Link and find out forgot password page.	
		//Transferred to Password assistance, Forgot Password Page.
		report.startLevel("Step 3 - Click on “Forgot Password” Link and find out forgot password page.");
		ForgotPasswordPage.clickForgotPasswordLink();
		report.endLevel();

		// Step 4 - Enter the email address or mobile phone number associated with your Amazon account. Then click on Continue.
		//Transferred to How would you like to sign in? page. You received an email address from Amazon.
		report.startLevel("Step 4 - Enter the email address associated with your Amazon account.");
		AddNewAddressOnAmazonPage.EMAIL();
		report.startLevel("Step 4.1 - Click on Continue Button.");
		ForgotPasswordPage.ContinueButtonAssociatedWithYourAmazonAccount();
		report.endLevel();

		// Step 5 - Check if you go to page: How would you like to sign in?.
		// Choose from the Options: The 1st option.
		// 1) Set a new password
		// 2) Sign in with a temporary code. Skip resetting your password.	
		// Verify you are in Page: “How would you like to sign in?".
		report.startLevel("Step 5 - Check if you go to page: How would you like to sign in?.");
		report.startLevel("Step 5 - 1. Set a new password");
		report.startLevel("Step 5 - 2. Sign in with a temprary code. Skip resetting your password.");
		report.startLevel("Step 5 - Choose from the Options: The 1st option");
		WebElement warningMessageTitle = driver.findElement(By.xpath("//form[@class='a-spacing-none']/h2[contains(text(),'How would you like to sign in?')]"));
		String warningMessageTitleText = warningMessageTitle.getText();
		report.startLevel("Step 5.1 - Verify you are in Page: '" + warningMessageTitleText + "'.");
		Assert.assertEquals(warningMessageTitleText, "How would you like to sign in?", "Verify you are in Page: 'How would you like to sign in?'.");
		report.startLevel("Step 5.2 - Click on Continue Button.");
		ForgotPasswordPage.ContinueButtonAssociatedWithYourAmazonAccount();
		report.endLevel();

		// Integration Tests.
		// Step 6 - Login to Gmail account.
		// Transferred to Gmail - Google Sign-in page.
		report.startLevel("Step 6 - Login to Gmail account");
		browseToUrl("https://mail.google.com/");
		report.startLevel("Step 6.1 - Transferred to Gmail - Google Sign-in page.");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Gmail Account. Enter Email Or Phone Field.
		report.startLevel("Step 6.2 - Gmail Account > Enter email or phone field.");
		ForgotPasswordPage.GmailAccount_EnterEmailOrPhoneField();

		report.startLevel("Step 6.2.1 - Gmail Account > Enter Email > Click Next.");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ForgotPasswordPage.GmailAccount_EnterEmail_ClickNext();

		report.startLevel("Step 6.3 - Gmail Account > Enter Password.");
		ForgotPasswordPage.GmailAccount_EnterPassword();

		report.startLevel("Step 6.3.1 - Gmail Account > Enter Password > Click Next.");
		//New email arrived. Copy The code and paste it.
		ForgotPasswordPage.GmailAccount_EnterPassword_AndClickNext();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		report.endLevel();

		// Step 7 - Verify Interfaces tests (integration), verify you received an email from amazon. New email arrived. “Amazon password assistance”.
		report.startLevel("Step 7 - Verify Interfaces tests (integration), verify you received an email from amazon.");
		WebElement warningMessageTitle1 = driver.findElement(By.cssSelector("span[email='account-update@amazon.com']"));
		String warningMessageTitleText1 = warningMessageTitle1.getText();
		report.startLevel("Step 7.1 - Verify Interfaces tests (integration), verify you received a New email from '" + warningMessageTitleText1 + "' arrived.");
		Assert.assertEquals(warningMessageTitleText1, "Amazon.com", "Step 7.2 - Verify Interfaces tests (integration), verify you received an email from Amazon.com.");
		report.endLevel();
	}
}
