package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import il.co.topq.difido.ReportDispatcher;
import il.co.topq.difido.ReportManager;
import infra.pages.AmazonLandingPage;
import infra.pages.registerationPage;

public class registerationAmazon extends AbstractTest{

	protected ReportDispatcher report = ReportManager.getInstance();

	@Test
	public void _06_registerationAmazon() throws Exception {

		//Step 1 - Browse to amazon.com landing page
		report.startLevel("Step 1 - Browse to amazon.com landing page");
		browseToUrl("https://www.amazon.com/");
		AmazonLandingPage amazonLandingPage = new AmazonLandingPage(driver);
		report.endLevel();
		
		//Step 1.1 - Click on Hello Sign In Link.
		report.startLevel("Step 1.1 - Click on Hello Sign In Link.");
		AmazonLandingPage amazonHelloSignInLink = new AmazonLandingPage(driver);
		amazonHelloSignInLink.amazonHelloSignIn();
		report.endLevel();
		
		// Step 1.2 - Click on 'Create your Amazon Submit Button' In Sign-In Page.
		report.startLevel("Step 1.2 - Click on 'Create your Amazon Submit Button' In Sign-In Page.");
		//registerationPage createYourAccountSubmitButton = new registerationPage(driver);
		registerationPage.createYourAccountSubmit();
		report.endLevel();

		// Step 2 - Check the Full name text field without Prefix.
		//Success, go to Verify email address.
		report.startLevel("Step 2 - Create your Amazon Account Continue Button In Create account Page.");
		report.startLevel("Step 2.1 - Check the Full name text field without Prefix.");
		report.startLevel("Step 2.2 - SendKeys '.' ");
		registerationPage.CheckTheFullNameWithoutPrefix();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		registerationPage.ContinueButton();
		report.endLevel();

		// Step 3 - Check the full name text field by adding chars string.
		//Success, go to Verify email address.
		report.startLevel("Step 3 - Check the full name text field by adding chars string.");
		report.startLevel("Step 3.1 - SendKeys Clear");
		registerationPage.Clear_ap_customer_name();
		report.startLevel("Step 3.2 - SendKeys '!@#$%^&*'");
		registerationPage.SendKeysAPCustomerName();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		report.startLevel("Step 3.3 - SendKeys 'Click'");
		registerationPage.ContinueButton();
		report.endLevel();

		// Step 4 - Check the Full name text field with special characters in Prefix.	
		//Success, go to Verify email address.
		report.startLevel("Step 4 - Check the Full name text field with special characters in Prefix.");
		registerationPage.Clear_ap_customer_name();
		report.startLevel("Step 4.1 - SendKeys 'Liron BenDror@!'");
		registerationPage.SendKeys_ap_customer_name4();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		registerationPage.ContinueButton();
		report.endLevel();

		// Step 5 - Check the Full name text field with special characters in First name.
		//Success, go to Verify email address
		report.startLevel("Step 5 - Check the Full name text field with special characters in First name.");
		registerationPage.Clear_ap_customer_name();
		report.startLevel("Step 5.1 - SendKeys 'Liron@!'");
		registerationPage.SendKeys_ap_customer_name5();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		registerationPage.ContinueButton();
		report.endLevel();

		// Step 6 - Check the Full name text field with special characters in Last name.
		//Success, go to Verify email address
		report.startLevel("Step 6 - Check the Full name text field with special characters in Last name.");
		registerationPage.Clear_ap_customer_name();
		report.startLevel("Step 6.1 - SendKeys 'BenDror@!'");
		registerationPage.SendKeys_ap_customer_name6();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		registerationPage.ContinueButton();
		report.endLevel();

		// Step 7 - Check the Full name text field without adding First name.	
		//Success, go to Verify email address.
		report.startLevel("Step 7 - Check the Full name text field without adding First name.");
		registerationPage.Clear_ap_customer_name();
		report.startLevel("Step 7.1 - SendKeys 'BenDror'");
		registerationPage.SendKeys_ap_customer_name7();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		registerationPage.ContinueButton();
		report.endLevel();

		// Step 8 - Check the Full name text field with adding Your name.	
		//Success, go to Verify email address.
		report.startLevel("Step 8 - Check the Full name text field with adding Your name.");
		registerationPage.Clear_ap_customer_name();
		report.startLevel("Step 8.1 - SendKeys 'Liron BenDror'");
		registerationPage.SendKeys_ap_customer_name8();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		registerationPage.ContinueButton();
		report.endLevel();

		// Testing Email Field
		report.startLevel("Testing Email Field");
		report.endLevel();

		// Step 10 - Check the Email text field that has Email address without @ symbol.	
		//Get an error message: ‚ÄúEnter a valid email address‚Äù
		report.startLevel("Step 10 - Check the Email text field that has Email address without @ symbol.");
		registerationPage.Clear_ap_email();
		report.startLevel("Step 10.1 - SendKeys 'lbendror_hotmail.com'");
		registerationPage.SendKeys_ap_customer_name10();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		registerationPage.ContinueButton();
		report.endLevel();

		// Step 11 - Check the Email text field as 'name@gmail'.	
		//Get an error message: ‚ÄúEnter a valid email address‚Äù.
		report.startLevel("Step 14 - Check the Email text field as 'name@gmail'.");
		registerationPage.Clear_ap_email();
		report.startLevel("Step 14 - SendKeys 'name@gmail'");
		registerationPage.SendKeys_ap_customer_name11();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		registerationPage.ContinueButton();
		report.endLevel();

		// Step 12 - Check the Email text field that has VALID Email address. //Success, go to Verify password.
		report.startLevel("Step 12 - Check the Email text field that has VALID Email address.");
		registerationPage.Clear_ap_email();
		report.startLevel("Step 12.1 - SendKeys 'lbendror@hotmail.com'");
		registerationPage.SendKeys_ap_customer_name12();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		registerationPage.ContinueButton();
		report.endLevel();

		// Testing Password Field.
		report.startLevel("Testing Password Field.");
		report.endLevel();

		// Step 13 - Verify if you can keep Two password Fields blank and submit the form. //Get an error message: ‚ÄúEnter your password‚Äù.
		report.startLevel("Step 13 - Verify if you can keep Two password Fields blank and submit the form.");
		registerationPage.Clear_ap_password();
		registerationPage.Clear_ap_password_check();
		report.startLevel("Step 13.1 - SendKeys password and Re-enter password fields 'blank'");
		registerationPage.SendKeys_ap_customer_name13();
		registerationPage.SendKeys_ap_customer_name13_1();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		registerationPage.ContinueButton();
		report.endLevel();

		// Step 14 - Check if you can type password less than 6 characters long.	
		//Get an error message: ‚ÄúPasswords must be at least 6 characters‚Äù.
		report.startLevel("Step 18 - Check if you can type password less than 6 characters long.");
		registerationPage.Clear_ap_password();
		registerationPage.Clear_ap_password_check();
		report.startLevel("Step 18.1 - SendKeys password and Re-enter password fields 'less than 6 characters'");
		registerationPage.SendKeys_ap_customer_name14();
		registerationPage.SendKeys_ap_customer_name14_1();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		registerationPage.ContinueButton();
		report.endLevel();

		// Step 15 - Check if you can type password must be at least 6 characters. 
		report.startLevel("Step 19 - Check if you can type password must be at least 6 characters.");
		registerationPage.Clear_ap_password();
		registerationPage.Clear_ap_password_check();
		report.startLevel("Step 19.1 - SendKeys password and Re-enter password fields 'at least 6 characters.'");
		registerationPage.SendKeys_ap_customer_name15();
		registerationPage.SendKeys_ap_customer_name15_1();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		registerationPage.ContinueButton();
		report.endLevel();
		
		// Step 16 - After finished to 'Create account', Verify you have got an 'Verify email address', we've sent a code.
		report.startLevel("Step 16 - After finished to 'Create account', Verify you have got an 'Verify email address', we've sent a code.");
		WebElement warningMessageTitle2 = driver.findElement(By.cssSelector(".a-spacing-small:nth-of-type(1) .a-spacing-small"));
		String warningMessageTitleText2 = warningMessageTitle2.getText();
		report.startLevel("Step 16.1 - After finished to 'Create account', Verify you have got an, '" + warningMessageTitleText2 + "', we've sent a code to lbendror@hotmail.com.");
		Assert.assertEquals(warningMessageTitleText2, "Verify email address", "Step 16.2 - After finished to 'Create account', Verify you have got an 'Verify email address', we've sent a code."); 
		report.endLevel();
	}
}
