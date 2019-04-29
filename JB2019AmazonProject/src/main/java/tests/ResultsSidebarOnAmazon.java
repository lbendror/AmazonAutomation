package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import il.co.topq.difido.ReportDispatcher;
import il.co.topq.difido.ReportManager;
import infra.pages.AmazonLandingPage;
import infra.pages.AmazonSearchResultsPage;
import infra.pages.ResultsSidebarOnAmazonPage;

public class ResultsSidebarOnAmazon extends AbstractTest{

	protected ReportDispatcher report = ReportManager.getInstance();

	@Test
	public void _07_ResultsSidebarOnAmazon() throws Exception {

		//Step 1 - Browse to amazon.com landing page.
		report.startLevel("Step 1 - Browse to amazon.com landing page");
		browseToUrl("http://amazon.com");
		AmazonLandingPage amazonLandingPage = new AmazonLandingPage(driver);
		report.endLevel();

		//Step 2 - Write a random search in the top search bar and click the search button.
		//Show results for the searching written.
		report.startLevel("Step 2 - Write a random search in the top search bar and click the search button.");
		String randomSearchTerm = generateRandomSearchTerm();
		amazonLandingPage.writeToSearchbox(randomSearchTerm);
		AmazonSearchResultsPage amazonSearchResultsPage = amazonLandingPage.clickOnGoButton();
		report.endLevel();

		//Step 3 - On the LEFT results, Refine by Condition New.	
		//The show results, result by Condition.
		report.startLevel("Step 3 - On the LEFT results, Refine by Condition New.");
		ResultsSidebarOnAmazonPage.RefineByCondition();
		report.endLevel();

		//Step 4 - On the results by Condition Click on ‘Cell Phones’ Department.	
		//Return to results for the searching chosen.
		report.startLevel("Step 4 - On the results by Condition Click on ‘Cell Phones’ Department.");
		ResultsSidebarOnAmazonPage.RefineByDepartment();
		report.endLevel();

		//Step 5 - On the results by Condition Click on Refine by Avg. Customer Review. 
		//The show results, result by Avg. Customer Review
		report.startLevel("Step 5 - On the results by Condition Click on Refine by Avg. Customer Review.");
		ResultsSidebarOnAmazonPage.AvgCustomerReview();
		report.endLevel();

		//Step 6 - On the results by Condition Click on Refine by Brand.
		//The show results, by Brand
		report.startLevel("Step 6 - On the results by Condition Click on Refine by Brand.");
		ResultsSidebarOnAmazonPage.Brand();
		report.endLevel();

		//Step 7 - Open the button name Sort by, and choose to Sort by: “Newest Arrivals”.
		//The Departments chosen is now Sort by: “Newest Arrivals”.
		report.startLevel("Step 7 - Open the button name Sort by, and choose to Sort by: “Newest Arrivals”");
		driver.findElements(By.cssSelector("span.a-button-inner")).get(0).click();
		List<WebElement> SortByButtonNewestArrivals = driver.findElements(By.cssSelector("div.a-popover-inner ul li"));
		SortByButtonNewestArrivals.get(4).click();
		report.endLevel();

		//Step 8 - Open the button name Sort by, and choose to Sort by: “Avg. Customer Review”.	
		//The Departments chosen is now Sort by: “Avg. Customer Review”.
		report.startLevel("Step 8 - Open the button name Sort by, and choose to Sort by: “Avg. Customer Review”");
		driver.findElements(By.cssSelector("span.a-button-inner")).get(0).click();
		List<WebElement> SortByButtonAvgCustomerReviewButton = driver.findElements(By.cssSelector("div.a-popover-inner ul li"));
		SortByButtonAvgCustomerReviewButton.get(3).click();
		report.endLevel();

		//Step 9 - Open the button name Sort by, and choose to Sort by: "Price: High to Low".	
		//The Departments chosen is now Sort by: “High to Low”.
		report.startLevel("Step 9 - Open the button name Sort by, and choose to Sort by: Price: High to Low");
		driver.findElements(By.cssSelector("span.a-button-inner")).get(0).click();
		List<WebElement> SortByButtonPriceHighToLow = driver.findElements(By.cssSelector("div.a-popover-inner ul li"));
		SortByButtonPriceHighToLow.get(2).click();
		report.endLevel();

		//Step 10 - Open the button name Sort by, and choose to Sort by: “Price: Low to High”.	
		//The Departments chosen is now Sort by: “Low to High”.
		report.startLevel("Step 10 - Open the button name Sort by, and choose to Sort by: Price: Low to High");
		driver.findElements(By.cssSelector("span.a-button-inner")).get(0).click();
		List<WebElement> SortByButtonPriceLowToHigh = driver.findElements(By.cssSelector("div.a-popover-inner ul li"));
		SortByButtonPriceLowToHigh.get(1).click();
		report.endLevel();

		//Step 11 - Open the button name Sort by, and choose to Sort by: “Featured”.	
		//The Departments chosen is now Sort by: “Featured”.
		report.startLevel("Step 11 - Open the button name Sort by, and choose to Sort by: “Featured”.");
		driver.findElements(By.cssSelector("span.a-button-inner")).get(0).click();
		List<WebElement> SortByButtonFeatured = driver.findElements(By.cssSelector("div.a-popover-inner ul li"));
		SortByButtonFeatured.get(0).click();
		report.endLevel();

		// Step 12 - After finished to generate Random Search Term, 'No results for iPhone', in Results Sidebar On Amazon.
		report.startLevel("Step 12 - After finished to generate Random Search Term, 'No results for iPhone.', in Results Sidebar On Amazon.");
		WebElement warningMessageTitle2 = driver.findElement(By.cssSelector("div[class='a-row']"));
		String warningMessageTitleText2 = warningMessageTitle2.getText();
		report.startLevel("Step 12.1 - Verify Finished to generate Random Search Term, '" + warningMessageTitleText2 + "', in Results Sidebar On Amazon.");
		Assert.assertEquals(warningMessageTitleText2, "No results for iPhone.", "Step 12.2 - After finished to generate Random Search Term, 'No results for iPhone.', in Results Sidebar On Amazon."); 
		report.endLevel();

	}
	private String generateRandomSearchTerm() {
		return "iPhone";
	}
}
