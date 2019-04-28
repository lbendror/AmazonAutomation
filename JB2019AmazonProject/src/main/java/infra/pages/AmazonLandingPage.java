package infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import infra.web.By2;

public class AmazonLandingPage extends AbstractPage {

	public AmazonLandingPage(WebDriver driver) throws Exception {
		super(driver, searchBox, goButton, amazonHelloSignInLink, ChangeLanguageSettingsLink,
				ChangeLanguageSettingsLink4, ChangeLanguageSettingsLink5, ChangeLanguageSettingsLink6,
				ChangeLanguageSettingsLink7, ChangeLanguageSettingsLink8);
	}

	private static final By2 searchBox = new By2("Main search box", By.id("twotabsearchtextbox"));
	private static final By2 goButton = new By2("'Go' button",
			By.xpath("//div[@id='nav-search']/form[@role='search']//input[@type='submit']"));
	private static final By2 signInSecurlyButtonBy = new By2("'Sign-in securly' button", By.id("a-autoid-0-announce"));
	private static final By2 amazonMusicLink = new By2("'Amazon Music' link", By.xpath("//a[text()='Amazon Music']"));
	private static final By2 amazonAmazonBusinessLink = new By2("'Amazon Business' link",
			By.xpath("//a[text()='Amazon Business']"));
	private static final By2 amazonBookDepositoryLink = new By2("'Book Depository' link",
			By.xpath("//a[text()='Book Depository']"));
	private static final By2 amazonGoodreadsLink = new By2("'Amazon Goodreads' link",
			By.xpath("//a[text()='Goodreads']"));
	private static final By2 amazonWootLink = new By2("'Amazon Woot!' link", By.xpath("//a[text()='Woot!']"));
	private static final By2 amazonAmazonAdvertisingLink = new By2("'Amazon Advertising' link",
			By.xpath("//a[text()='Amazon Advertising']"));
	private static final By2 amazonAmazonGlobalLink = new By2("'Amazon Global' link",
			By.xpath("//a[text()='AmazonGlobal']"));
	private static final By2 amazonHelloSignInLink = new By2("'Amazon Hello, Sign in' link",
			By.id("nav-link-accountList"));

	private static final By2 ChangeLanguageSettingsLink = new By2("'Change Language Settings' Page",
			By.id("icp-nav-flyout"));
	private static final By2 ChangeLanguageSettingsLink4 = new By2("'Change Language Settings' Page",
			By.id("icp-nav-flyout"));
	private static final By2 ChangeLanguageSettingsLink5 = new By2("'Change Language Settings' Page",
			By.id("icp-nav-flyout"));
	private static final By2 ChangeLanguageSettingsLink6 = new By2("'Change Language Settings' Page",
			By.id("icp-nav-flyout"));
	private static final By2 ChangeLanguageSettingsLink7 = new By2("'Change Language Settings' Page",
			By.id("icp-nav-flyout"));
	private static final By2 ChangeLanguageSettingsLink8 = new By2("'Change Language Settings' Page",
			By.id("icp-nav-flyout"));

	public static void clickAmazonMusicLink() {
		bot.click(amazonMusicLink);
	}

	public static void clickAmazonBusinessLink() {
		bot.click(amazonAmazonBusinessLink);
	}

	public static void amazonBookDepositoryLink() {
		bot.click(amazonBookDepositoryLink);
	}

	public static void amazonGoodreadsLink() {
		bot.click(amazonGoodreadsLink);
	}

	public static void amazonWootLink() {
		bot.click(amazonWootLink);
	}

	public static void amazonAmazonAdvertisingLink() {
		bot.click(amazonAmazonAdvertisingLink);
	}

	public static void amazonAmazonGlobalLink() {
		bot.click(amazonAmazonGlobalLink);
	}

	public void writeToSearchbox(String searchTerm) {

		bot.writeToElement(searchBox, searchTerm);

		/*
		 * ConsoleReporter.report("Write '" + searchTerm + "' into search box (" +
		 * searchBox + ")"); driver.findElement(searchBox).sendKeys(searchTerm);
		 */
	}

	public AmazonSearchResultsPage clickOnGoButton() throws Exception {

		bot.click(goButton);
		// driver.findElement(goButton).click();
		return new AmazonSearchResultsPage(driver);
	}

	public void WaitForSignInSecurlyButtonEnabled() {

		bot.waitForElementToBeClickable(signInSecurlyButtonBy);

		/*
		 * WebElement signInSecurlyButton = driver.findElement(signInSecurlyButtonBy);
		 * WebDriverWait webdriverWait = new WebDriverWait(driver, 5);
		 * webdriverWait.until(ExpectedConditions.elementToBeClickable(
		 * signInSecurlyButton));
		 */
	}

	public void amazonHelloSignIn() {
		bot.click(amazonHelloSignInLink);
	}

	public void LanguageSettingsPage() {
		bot.click(ChangeLanguageSettingsLink);
	}

	public void LanguageSettingsPage4() {
		bot.click(ChangeLanguageSettingsLink4);
	}

	public void LanguageSettingsPage5() {
		bot.click(ChangeLanguageSettingsLink5);
	}

	public void LanguageSettingsPage6() {
		bot.click(ChangeLanguageSettingsLink6);
	}

	public void LanguageSettingsPage7() {
		bot.click(ChangeLanguageSettingsLink7);
	}

	public void LanguageSettingsPage8() {
		bot.click(ChangeLanguageSettingsLink8);
	}
}