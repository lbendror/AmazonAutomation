package infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import infra.web.By2;

public class SearchAnItemAndAddQuantityPage extends AbstractPage{
	
	public final static By2 ClickOnCartButton = new By2("Click On Cart Button", By.xpath("//a[@id='hlb-view-cart-announce'][contains(text(),'Cart')]"));
	public final static By2 ChooseQty10Dropdown = new By2("Choose Qty '10' Dropdown, And The Qty Field update to ג€˜10ג€™.", By.xpath("//select[@name='quantity'][@id='quantity'][option[@value='10']]"));
	
	public SearchAnItemAndAddQuantityPage(WebDriver driver) throws Exception{
		super(driver, ClickOnCartButton, ChooseQty10Dropdown);
	}
	
	public static void ClickOnCartButton() {
		bot.click(ClickOnCartButton);
	}
	public static void ChooseQty10Dropdown() {
		bot.click(ChooseQty10Dropdown);
	}
	// Step 4.2 - Selecting value from Quantity Dropdown.
	public static WebElement SelectingValueFromQuantityDropdown(){
		WebElement SelectingValueFromQuantityDropdown = driver.findElement(By.xpath("//div[@class='a-column a-span12 a-text-left']//select[@name='quantity'][@id='quantity'][@class='a-native-dropdown']"));
		SelectingValueFromQuantityDropdown.isSelected();
		return SelectingValueFromQuantityDropdown;
	}
	
	/* // Replace SelectingValueFromQuantityDropdown() Method
	 public void clickOnLastOnList() {
		By optionsSelector = By.cssSelector("div.a-column.a-span12.a-text-left select option");
		List<WebElement> options = driver.findElements(optionsSelector);
		options.get(options.size()-1).click();;
	
	}
	*/
	
	// Step 6 - Verify The name of the Button is: ג€˜Proceed to checkout (10 items)
	public static WebElement VerifyTheNameOfTheButton_ProceedToCheckout(){
		WebElement VerifyTheNameOfTheButton_ProceedToCheckout = driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native'][contains(text(),'Proceed to checkout (10 items)')]"));
		VerifyTheNameOfTheButton_ProceedToCheckout.isSelected();
		return VerifyTheNameOfTheButton_ProceedToCheckout;
	}
}