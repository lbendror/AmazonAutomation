package infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import infra.web.By2;

public class ForgotPasswordPage extends AbstractPage{

	private static final By2 ForgotPasswordLink = new By2("Sign-In page Click on Forgot Password Link", By.id("auth-fpp-link-bottom"));
	private static final By2 clickSetANewPasswordInput = new By2("Click Set A New Password Input", By.xpath("//div[@class='a-row a-spacing-top-base']/div[@class='a-radio a-spacing-top-base']//input[@name='fppOptions']"));
	private static final By2 ClickOnContinueButton = new By2("Click On Continue Button", By.id("continue"));
	private static final By2 GmailAccount_EnterEmail_ClickNext = new By2("Gmail Account > Enter Email > Click Next.", By.xpath("//div[@id='identifierNext']//span[@class='RveJvd snByac']"));
	private static final By2 GmailAccount_EnterPassword_AndClickNext = new By2("Gmail Account > Enter Password > Click Next.", By.xpath("//div[@id='passwordNext']//span[@class='RveJvd snByac']"));
	private static final By2 ContinueButtonAssociatedWithYourAmazonAccount = new By2("Enter the email address or mobile phone number associated with your Amazon account.", By.id("continue"));

	public ForgotPasswordPage(WebDriver driver) throws Exception {
		super(driver, ForgotPasswordLink, clickSetANewPasswordInput, ClickOnContinueButton, GmailAccount_EnterEmail_ClickNext,
		GmailAccount_EnterPassword_AndClickNext, ContinueButtonAssociatedWithYourAmazonAccount);
	}

	public static void clickForgotPasswordLink() {
		bot.click(ForgotPasswordLink);
	}
	public static void clickSetANewPasswordInput() {
		bot.click(clickSetANewPasswordInput);
	}
	public static void ClickOnContinueButton() {
		bot.click(ClickOnContinueButton);
	}
	public static void GmailAccount_EnterEmailOrPhoneField(){
		WebElement GmailAccount_EnterEmailOrPhoneField = driver.findElement(By.id("identifierId"));
		GmailAccount_EnterEmailOrPhoneField.sendKeys("ebay4580@gmail.com");
	}
	public static void GmailAccount_EnterEmail_ClickNext(){
		bot.click(GmailAccount_EnterEmail_ClickNext);
	}
	public static void GmailAccount_EnterPassword(){
		WebElement GmailAccount_EnterPassword = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		GmailAccount_EnterPassword.sendKeys("Pas$word123");
	}
	public static void GmailAccount_EnterPassword_AndClickNext(){
		bot.click(GmailAccount_EnterPassword_AndClickNext);
	}
	public static void ContinueButtonAssociatedWithYourAmazonAccount(){
		bot.click(ContinueButtonAssociatedWithYourAmazonAccount);
	}
}