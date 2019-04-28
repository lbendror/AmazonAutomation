package infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchResultsPage extends AbstractPage {

	private static final By firstNonSponsoredResultTitle = By.xpath("//div[@data-index='2']//h2/a/span");

	public AmazonSearchResultsPage(WebDriver driver) throws Exception {
		super(driver);
	}

	public String getFirstNonSponsoredResultTitle() {
		return driver.findElement(firstNonSponsoredResultTitle).getText();
	}

	public AmazonProductPage clickOnSearchResultTitleByIndex(int resultIndex) throws Exception {

		By resultTitle = By.xpath("//div[@data-index='"+resultIndex+"']//h2/a/span");
		driver.findElement(resultTitle).click();
		return new AmazonProductPage(driver);
	}

	// Step 3 _09_SearchOnAmazon
	public static void CheckTheLengthOfTheQuery() {
		WebElement CheckTheLengthOfTheQuery = driver.findElement(By.id("twotabsearchtextbox"));
		CheckTheLengthOfTheQuery.sendKeys("1234567890 abcdefghijklmnopqrstuvwxyz");
	}

	// Step 4 _09_SearchOnAmazon
	public static void SearchFor_A_ProductTypeByChars() {
		WebElement SearchFor_A_ProductTypeByChars = driver.findElement(By.id("twotabsearchtextbox"));
		SearchFor_A_ProductTypeByChars.sendKeys("Becoming Hardcover");
	}

	// Step 5 _09_SearchOnAmazon
	public static void SearchFor_A_ProductTypeByNumbers() {
		WebElement SearchFor_A_ProductTypeByNumbers = driver.findElement(By.id("twotabsearchtextbox"));
		SearchFor_A_ProductTypeByNumbers.sendKeys("123456");
	}

	// Step 6 _09_SearchOnAmazon
	public static void SearchFor_A_ProductTypeWillNoResultsFound() {
		WebElement SearchFor_A_ProductTypeWillNoResultsFound = driver.findElement(By.id("twotabsearchtextbox"));
		SearchFor_A_ProductTypeWillNoResultsFound.sendKeys("i1p2h3o4n5e6");
	}
}