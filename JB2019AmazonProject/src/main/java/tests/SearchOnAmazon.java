package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import infra.config.MainConfig;
import infra.pages.AmazonLandingPage;
import infra.pages.AmazonSearchResultsPage;

@Test
public class SearchOnAmazon extends AbstractTest {

	String[] array = { "iPhone", "Samsung", "Nokia" };
	String wordSearch;

	public void _09_SearchOnAmazon() throws Exception {

		// Step 1 - Browse to amazon.com landing page
		report.startLevel("Step 1 - Browse to amazon.com landing page");
		browseToUrl(MainConfig.baseUrl);
		AmazonLandingPage amazonLandingPage = new AmazonLandingPage(driver);
		report.endLevel();

		// Step 2 - Does the search box present auto suggestions when the query is being
		// typed
		// The search box present auto suggestions when the query is being typed
		for (int i = 0; i < array.length; i++) {
			wordSearch = array[i];
			report.startLevel("Step 2 - Write a random search term in the top search bar");

			// String randomSearchTerm = generateRandomSearchTerm();
			String randomSearchTerm = wordSearch;
			amazonLandingPage.writeToSearchbox(randomSearchTerm);
			AmazonSearchResultsPage amazonSearchResultsPage = amazonLandingPage.clickOnGoButton();
			report.endLevel();
		}

		// Step 3 - Check the length of the query to be added into the search box. The
		// length of the query is 3968 characters long.
		report.startLevel("Step 3 - Browse to amazon.com landing page.");
		browseToUrl(MainConfig.baseUrl);
		report.endLevel();
		
		report.startLevel("Step 3.1 - Check the length of the query to be added into the search box. The length of the query is 3968 characters long.");
		AmazonSearchResultsPage.CheckTheLengthOfTheQuery();
		AmazonSearchResultsPage amazonSendKeys = amazonLandingPage.clickOnGoButton();
		report.endLevel();

		// Step 4 - Search for a product type any String to search box for by chars. The
		// page results answers by chars.
		report.startLevel("Step 4 - Browse to amazon.com landing page.");
		browseToUrl(MainConfig.baseUrl);
		report.endLevel();
		
		report.startLevel("Step 4.1 - Search for a product type any String to search box for by chars. The page results answers by chars.");
		AmazonSearchResultsPage.SearchFor_A_ProductTypeByChars();
		AmazonSearchResultsPage SearchFor_A_ProductTypeByChars = amazonLandingPage.clickOnGoButton();
		report.endLevel();

		// Step 5 - Search for a product type any String to search box for by numbers.
		// The page results answers by numbers.
		report.startLevel("Step 5 - Browse to amazon.com landing page.");
		browseToUrl(MainConfig.baseUrl);
		report.endLevel();
		
		report.startLevel("Step 5.1 - Search for a product type any String to search box for by numbers. The page results answers by numbers.");
		AmazonSearchResultsPage.SearchFor_A_ProductTypeByNumbers();
		AmazonSearchResultsPage ResultsAnswersByNumbers = amazonLandingPage.clickOnGoButton();
		report.endLevel();

		// Step 6 - Search for a product that we know Amazon will not carry System
		// should say 'No results found'.
		report.startLevel("Step 6 - Browse to amazon.com landing page.");
		browseToUrl(MainConfig.baseUrl);
		report.startLevel("Step 6.1 - Search for a product that we know Amazon will not carry System should say 'No results found'.");
		AmazonSearchResultsPage.SearchFor_A_ProductTypeWillNoResultsFound();
		AmazonSearchResultsPage NoResultsFound = amazonLandingPage.clickOnGoButton();
		report.endLevel();
		
		// Step 7 - After finished to generate Random Search Term, 'No results for i1p2h3o4n5e6.', in Search On Amazon.
		report.startLevel("Step 7 - After finished to generate Random Search Term, 'No results for i1p2h3o4n5e6.', in Search On Amazon");
		WebElement warningMessageTitle2 = driver.findElement(By.cssSelector("div[class='a-row']"));
		String warningMessageTitleText2 = warningMessageTitle2.getText();
		report.startLevel("Step 7.1 - Verified Finished to generate Random Search Term, '" + warningMessageTitleText2 + "', in Search On Amazon");
		Assert.assertEquals(warningMessageTitleText2, "No results for i1p2h3o4n5e6.", "Step 7.2 - After finished to generate Random Search Term, 'No results for i1p2h3o4n5e6.', in Search On Amazon"); 
		report.endLevel();
	}
}