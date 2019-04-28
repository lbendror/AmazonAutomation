package infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import infra.web.By2;

public class SitePreferencesOnAmazonPage extends AbstractPage{
	
	public final static By2 clickYourOrders = new By2("Your Orders Link", By.xpath("//div[@id='a-page']/div[@class='a-container']//a[@href='https://www.amazon.com/gp/your-account/order-history?ref_=ya_d_c_yo']/div[@class='a-box ya-card--rich']//h2[1]"));
	public final static By2 ClickOnPrimeLink = new By2("Click On Prime Link", By.xpath("//div[@id='a-page']/div[@class='a-container']//a[@href='https://www.amazon.com/gp/primecentral?ref_=ya_d_c_prime']/div[@class='a-box ya-card--rich']//h2[1]"));
    public final static By2 ReturnFromPrimeLink = new By2("Return From prime Link", By.xpath("//div[@id='primeCentralHomepageBreadcrumbContent']//span[@class='previousBreadCrumbLink']"));
	public final static By2 ClickReturnToYourAccount = new By2("Return to Your Account", By.xpath("//div[@id='yourOrdersContent']/div[1]/ul//a[@title='Return to Your Account']/span"));
	public final static By2 ClickOnYourAddressLink = new By2("Click On Your Address Link", By.xpath("//div[@id='a-page']/div[@class='a-container']/div/div[4]/div[1]/div[@class='a-box ya-card']//ul//a[@href='https://www.amazon.com/a/addresses?ref_=ya_d_l_addr']"));
	public final static By2 ReturnFromYourAddressLink = new By2("Return From Your Address Link", By.xpath("//div[@id='a-page']/div[@class='a-section']//div[@class='a-section a-spacing-medium']/div/ul//a[@href='/gp/css/homepage.html?ref=ya_address_book_address_book_to_your_account_breadcrumb']/span[.=' Your Account ']"));
	public final static By2 ClickOnPaymentOptionsLink = new By2("Click On Payment Options Link", By.xpath("//div[@id='a-page']/div[@class='a-container']/div/div[4]/div[1]/div[@class='a-box ya-card']//ul//a[@href='https://www.amazon.com/cpe/managepaymentmethods?ref_=ya_d_l_pmt_mpo']"));
	public final static By2 ReturnFromPaymentOptionsLink = new By2("Return From Payment Options Link", By.xpath("//div[@id='headerCol']//a[@href='/gp/css/homepage.html/ref=wallet_ya_link']"));
	public final static By2 ClickOnGiftCardsLink = new By2("Click On Gift Cards Link", By.xpath("//div[@id='a-page']/div[@class='a-container']//a[@href='https://www.amazon.com/gp/css/gc/balance?ref_=ya_d_c_gc']/div[@class='a-box ya-card--rich']//h2[1]"));
	public final static By2 ReturnFromGiftCardsLink = new By2("Click On Gift Cards Link", By.xpath("//a[@id='gc-breadcrumb-link-1']"));
	
	
	public SitePreferencesOnAmazonPage(WebDriver driver) throws Exception{
		super(driver, clickYourOrders, ClickOnPrimeLink, ClickReturnToYourAccount, ClickOnYourAddressLink, ReturnFromYourAddressLink, ClickOnPaymentOptionsLink, ClickOnGiftCardsLink, ReturnFromGiftCardsLink);
	}
	public static void clickYourOrdersLink() {
		bot.click(clickYourOrders);
	}
	public static void ReturnToYourAccountLink() {
		bot.click(ClickReturnToYourAccount);
	}
	public static void ClickOnPrimeLinkLink() {
		bot.click(ClickOnPrimeLink);
	}
	public static void ReturnFromPrimeLink() {
		bot.click(ReturnFromPrimeLink);
	}
	public static void ClickOnYourAddressLink() {
		bot.click(ClickOnYourAddressLink);
	}
	public static void ReturnFromYourAddressLink() {
		bot.click(ReturnFromYourAddressLink);
	}
	public static void ClickOnPaymentOptionsLink() {
		bot.click(ClickOnPaymentOptionsLink);
	}
	public static void ReturnFromPaymentOptionsLink() {
		bot.click(ReturnFromPaymentOptionsLink);
	}
	public static void ClickOnGiftCardsLink() {
		bot.click(ClickOnGiftCardsLink);
	}
	public static void ReturnFromGiftCardsLink() {
		bot.click(ReturnFromGiftCardsLink);
	}
}