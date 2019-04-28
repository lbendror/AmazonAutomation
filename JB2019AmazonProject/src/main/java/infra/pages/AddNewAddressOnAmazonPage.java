package infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import infra.config.MainConfig;
import infra.web.By2;

public class AddNewAddressOnAmazonPage extends AbstractPage{

	public final static By2 ClickOnYourAddressLinkDown = new By2("Click on Your Address Link", By.xpath("//div/div[4]/div[1]/div[@class='a-box ya-card']//ul//a[@href='https://www.amazon.com/a/addresses?ref_=ya_d_l_addr']"));
	public final static By2 ClickOnYourAddressLinkUP = new By2("Click on Your Address Link", By.xpath("//a[@href='https://www.amazon.com/a/addresses?ref_=ya_d_c_addr']/div[@class='a-box ya-card--rich']//h2[1]"));
	public final static By2 ClickOnYourAddressPlusIcon = new By2("Click on Your Address Plus icon", By.xpath("//div[@id='ya-myab-plus-address-icon']"));
	public final static By2 SKIPFORNOWINPUT = new By2("SKIP FOR NOW INPUT", By.xpath("//span[@id='skip-for-now']//i[@class='a-icon a-icon-radio']"));
	public final static By2 SKIPFORNOWContinueButton = new By2("SKIP FOR NOW Continue Button", By.xpath("//span[@id='kyc-xborder-continue-button']//input[@class='a-button-input']"));
	public final static By2 signInSubmit = new By2("Login signInSubmit", By.id("signInSubmit"));
	public final static By2 ChooseIsraelFromCountryRegionDropdown = new By2("Choose Israel From Country Region Dropdown", By.xpath("//span[text()='United States']"));
	public final static By2 ClickOnYourAccountLink = new By2("Click On Your Account Link", By.xpath("//div[@id='navFooter']//div[@class='navFooterLinkCol navAccessibility']/ul[1]/li[1]/a[@class='nav_a'][text()='Your Account']"));
	public final static By2 ClickOnAddAddressButton = new By2("Click On ג€˜Add Addressג€™ Button.", By.xpath("//input[@class='a-button-input']"));

	public AddNewAddressOnAmazonPage(WebDriver driver) throws Exception{
		super(driver, ClickOnYourAddressLinkDown, ClickOnYourAddressPlusIcon, SKIPFORNOWINPUT, 
				SKIPFORNOWContinueButton, signInSubmit, ChooseIsraelFromCountryRegionDropdown, ClickOnYourAccountLink, 
				ClickOnAddAddressButton);
	}

	public static void ClickOnYourAccountLink() {
		bot.click(ClickOnYourAccountLink);
	}
	public static boolean ClickOnYourAddressLink() throws Exception{

		if (bot.isElementDisplayed1(ClickOnYourAddressLinkDown)) {
			bot.click(ClickOnYourAddressLinkDown);
			Thread.sleep(500);
		}else {
			bot.click(ClickOnYourAddressLinkUP);
			Thread.sleep(500);
		}
		return true;
	}
	public static void ClickOnYourAddressPlusIcon() {
		bot.click(ClickOnYourAddressPlusIcon);
	}
	public static void SKIPFORNOWINPUT() {
		bot.click(SKIPFORNOWINPUT);
	}
	public static void SKIPFORNOWContinueButton() {
		bot.click(SKIPFORNOWContinueButton);
	}
	public static void EMAIL(){
		WebElement EMAIL = driver.findElement(By.id("ap_email"));
		EMAIL.sendKeys(MainConfig.AmazonUsername);
	}
	public static void PASSWORD(){
		WebElement PASSWORD = driver.findElement(By.id("ap_password"));
		PASSWORD.sendKeys(MainConfig.AmazonPassword);
	}
	public static void signInSubmit() {
		bot.click(signInSubmit);
	}
	public static void ChooseIsraelFromCountryRegionDropdown() {
		bot.click(ChooseIsraelFromCountryRegionDropdown);
	}
	public static void TypeFullName() {
		WebElement TypeFullName = driver.findElement(By.id("address-ui-widgets-enterAddressFullName"));
		TypeFullName.sendKeys("Liron BenDror");
	}
	public static void TypeApartmentSuite(){
		WebElement TypeApartmentSuite = driver.findElement(By.id("address-ui-widgets-enterAddressLine2"));
		TypeApartmentSuite.sendKeys("Floor 3");
	}
	public static void TypeStreetAddress(){
		WebElement TypeStreetAddress = driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
		TypeStreetAddress.sendKeys("Derech Menachem Begin 125");
	}
	public static void TypeCity(){
		WebElement TypeCity = driver.findElement(By.id("address-ui-widgets-enterAddressCity"));
		TypeCity.sendKeys("Tel Aviv-Yafo");
	}
	public static void TypeStateProvinceRegion(){
		WebElement TypeStateProvinceRegion = driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion"));
		TypeStateProvinceRegion.sendKeys("Israel");
	}
	public static void TypeZipCode(){
		WebElement TypeZipCode = driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode"));
		TypeZipCode.sendKeys("4580800");
	}
	public static void TypeID_Number(){
		WebElement TypeID_Number = driver.findElement(By.id("address-ui-widgets-taxId"));
		TypeID_Number.sendKeys("025751785");
	}
	public static void TypePhoneNumber(){
		WebElement TypePhoneNumber = driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber"));
		TypePhoneNumber.sendKeys("972-52-2222223");
	}
	public static void ClickOnAddAddressButton(){
		bot.click(ClickOnAddAddressButton);
	}
}