package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import infra.config.MainConfig;
import infra.pages.AddedToCartPage;
import infra.pages.AmazonLandingPage;
import infra.pages.AmazonProductPage;
import infra.pages.AmazonSearchResultsPage;

public class ShoppingCartCounter extends AbstractTest {

	@Test
	public void _010_ShoppingCartCounter() throws Exception {

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

		// Step 3 - Click the title of the first item in the list of search results
		report.startLevel("Step 3 - Click the title of the first item");
		AmazonProductPage amazonProductPage = amazonSearchResultsPage.clickOnSearchResultTitleByIndex(1);
		report.endLevel();

		// Step 4 - Click "Add to Cart" button
		report.startLevel("Step 4 - Click Add to Cart button");
		AddedToCartPage addedToCartPage = amazonProductPage.clickAddToCartButton();
		report.endLevel();

		// Step 5 - Verify the 'Cart' icon on the top right of the page shows the correct number of products added to the cart.
		report.startLevel("Step 5 - Verify the 'Cart' icon on the top right of the page shows the correct number of products added to the cart.");
		Assert.assertEquals(addedToCartPage.getCartCounterValue(), 1, "Step 5.1 - Verified 1 Number of item in cart");
		report.startLevel("Step 5.1 - Verified 1 item added To the Cart, '" +addedToCartPage.getCartCounterValue()+ "' item(s)");
		report.endLevel();

	}
	private String generateRandomSearchTerm() {
		return "iPhone";
	}
}
