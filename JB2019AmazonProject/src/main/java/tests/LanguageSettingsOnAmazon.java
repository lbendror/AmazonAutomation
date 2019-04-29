package tests;

import org.testng.annotations.Test;

import il.co.topq.difido.ReportDispatcher;
import il.co.topq.difido.ReportManager;
import infra.pages.AmazonLandingPage;
import infra.pages.LanguageSettingsPage;

public class LanguageSettingsOnAmazon extends AbstractTest{

	protected ReportDispatcher report = ReportManager.getInstance();

	@Test
	public void _04_LanguageSettingsPage() throws Exception {

		//Step 1 - Browse to amazon.com landing page
		report.startLevel("Step 1 - Browse to amazon.com landing page");
		browseToUrl("https://www.amazon.com/");
		AmazonLandingPage amazonLandingPage = new AmazonLandingPage(driver);
		report.endLevel();

		// Step 2 - Mouse over on the Language button, and Click on the Language button.
		//Transferred to the “Change Language Settings” page
		report.startLevel("Step 2 - Mouse over on the Language button, and Click on the Language button.");
		report.startLevel("Step 2.1 - Transferred to the “Change Language Settings” page.");
		AmazonLandingPage ChangeLanguageSettingsLink = new AmazonLandingPage(driver);
		ChangeLanguageSettingsLink.LanguageSettingsPage();
		report.endLevel();

		// Step 3 - Change the radio button From English – EN To ES.
		report.startLevel("Step 3 - Change the radio button From English – EN To ES.");
		LanguageSettingsPage ChangeTheRadioButton = new LanguageSettingsPage(driver);
		LanguageSettingsPage.ChangeTheRadioButton_ENToES();
		LanguageSettingsPage.SaveChangesButton();
		report.endLevel();

		// Step 4 - Change the radio button From English – ES To ZH.
		report.startLevel("Step 4 - Change the radio button From English – ES To ZH.");
		AmazonLandingPage ChangeLanguageSettingsLink4 = new AmazonLandingPage(driver);
		ChangeLanguageSettingsLink4.LanguageSettingsPage();
		LanguageSettingsPage.ChangeTheRadioButton_ESToZH();
		LanguageSettingsPage.SaveChangesButton();
		report.endLevel();

		// Step 5 - Change the radio button From English – ZH To DE.
		report.startLevel("Step 5 - Change the radio button From English – ZH To DE.");
		AmazonLandingPage ChangeLanguageSettingsLink5 = new AmazonLandingPage(driver);
		ChangeLanguageSettingsLink5.LanguageSettingsPage();
		LanguageSettingsPage.ChangeTheRadioButton_ZHToDE();
		LanguageSettingsPage.SaveChangesButton();
		report.endLevel();

		// Step 6 - Change the radio button From English – DE To PT.
		report.startLevel("Step 6 - Change the radio button From English – DE To PT.");
		AmazonLandingPage ChangeLanguageSettingsLink6 = new AmazonLandingPage(driver);
		ChangeLanguageSettingsLink6.LanguageSettingsPage();
		LanguageSettingsPage.ChangeTheRadioButton_DEToPT();
		LanguageSettingsPage.SaveChangesButton();
		report.endLevel();

		// Step 7 - Change the radio button From English – PT To ZH.
		report.startLevel("Step 7 - Change the radio button From English – PT To ZH.");
		AmazonLandingPage ChangeLanguageSettingsLink7 = new AmazonLandingPage(driver);
		ChangeLanguageSettingsLink7.LanguageSettingsPage();
		LanguageSettingsPage.ChangeTheRadioButton_PTToZH();
		LanguageSettingsPage.SaveChangesButton();
		report.endLevel();

		// Step 8 - Change the radio button From English – ZH To KO.
		report.startLevel("Step 8 - Change the radio button From English – ZH To KO.");
		AmazonLandingPage ChangeLanguageSettingsLink8 = new AmazonLandingPage(driver);
		ChangeLanguageSettingsLink8.LanguageSettingsPage();
		LanguageSettingsPage.ChangeTheRadioButton_ZHToKO();
		LanguageSettingsPage.SaveChangesButton();
		report.endLevel();

	}
}
