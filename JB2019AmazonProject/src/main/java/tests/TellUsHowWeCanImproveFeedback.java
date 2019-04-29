package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import infra.config.MainConfig;
import infra.pages.AmazonLandingPage;
import infra.pages.AmazonSearchResultsPage;
import infra.pages.TellUsHowWeCanImproveFeedbackPage;

public class TellUsHowWeCanImproveFeedback extends AbstractTest{

	@Test
	public void _013_TellUsHowWeCanImproveFeedback() throws Exception {

		// Step 1 - Browse to amazon.com landing page
		report.startLevel("Step 1 - Browse to amazon.com landing page");
		browseToUrl(MainConfig.baseUrl);
		AmazonLandingPage amazonLandingPage = new AmazonLandingPage(driver);
		report.endLevel();

		// Step 2 - Write a random search term in the top search bar and click the search button
		report.startLevel("Step 2 - Write a random search term in the top search bar");
		String randomSearchTerm = generateRandomSearchTerm();
		amazonLandingPage.writeToSearchbox(randomSearchTerm);
		AmazonSearchResultsPage amazonSearchResultsPage = amazonLandingPage.clickOnGoButton();
		report.endLevel();

		// Step 2 - Write a 'Tell us how we can improve' in textarea.
		report.startLevel("Step 2 - Write a 'Tell us how we can improve' in textarea.");
		TellUsHowWeCanImproveFeedbackPage TellUsHowWeCanImproveFeedback = new TellUsHowWeCanImproveFeedbackPage(driver);
		TellUsHowWeCanImproveFeedbackPage.textarea();
		report.endLevel();

		// Step 3 - click the submit button under textarea.
		report.startLevel("Step 3 - click the submit button under textarea.");
		TellUsHowWeCanImproveFeedbackPage.textareaSubmitButton();
		report.endLevel();
		
		// Step 4 - Verify you get a message: 'Thank you for your feedback'.
		report.startLevel("Step 4 - Verify you get a message: 'Thank you for your feedback'.");
		WebElement warningMessageTitle = driver.findElement(By.cssSelector("div[class='a-box a-alert a-alert-success'],[div='a-alert-content'][innertext='Thank you for your feedback']"));
		String warningMessageTitleText = warningMessageTitle.getText();
		report.startLevel("Step 4.1 - Verified you get a message: '" + warningMessageTitleText + "'.");
		Assert.assertEquals(warningMessageTitleText, "Thank you for your feedback", "Step 4.2 - Verify you get a message: 'Thank you for your feedback'."); 
		report.endLevel();

	}
	private String generateRandomSearchTerm() {
		return "i1p2h3o4n5e6";
	}
}
