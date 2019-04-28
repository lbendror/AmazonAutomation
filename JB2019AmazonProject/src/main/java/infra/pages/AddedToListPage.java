package infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import infra.config.MainConfig;
import infra.web.By2;

public class AddedToListPage extends AbstractPage{

	private final static By2 ClickAddToListItemButton = new By2("Click Add To List Item Button", By.xpath("//div[@id='wishlistButtonStack']/div[@id='add-to-wishlist-button-group']/span[@id='wishListMainButton']/span[@class='a-button-inner']/input[@id='add-to-wishlist-button-submit']"));
	private final static By2 ClickOnViewYourListButton = new By2("'Click On View Your List Button'", By.xpath("//div[@id='WLHUC_info']//a[@id='WLHUC_viewlist']"));
	private final static By2 ClickOnTheDeleteItemLink = new By2("'Click On The Delete Item Link'", By.xpath("//div[@class='a-column a-span12 g-move-delete-buttons']/span[@class='a-declarative']/a[@href='/gp/registry/wishlist/2N274G1W45SH/ref=cm_wl_it_del_hz']"));
	private final static By2 ClickOnTheAmazonLogo = new By2("'Click On The Amazon Logo'", By.xpath("//div[@id='nav-logo']/a[@href='/ref=nav_logo']/span[@class='nav-sprite nav-logo-base']"));

	public AddedToListPage(WebDriver driver) throws Exception {
		super(driver, ClickAddToListItemButton, ClickOnViewYourListButton, ClickOnTheDeleteItemLink, ClickOnTheAmazonLogo);
	}

	public static void ClickAddToListItemButton() {
		bot.click(ClickAddToListItemButton);
	}
	public static void ClickOnViewYourListButton() {
		bot.click(ClickOnViewYourListButton);
	}
	public static void ClickOnTheDeleteItemLink() {
		bot.click(ClickOnTheDeleteItemLink);
	}
	public static void ClickOnTheAmazonLogo() {
		bot.click(ClickOnTheAmazonLogo);
	}
	public static void ClickAddToListButtonTransferedToSignInPage(){
		WebElement ClickAddToListButtonEmail = driver.findElement(By.id("ap_email"));
		ClickAddToListButtonEmail.sendKeys(MainConfig.AmazonUsername);
		
		WebElement ClickAddToListButtonPassword = driver.findElement(By.id("ap_password"));
		ClickAddToListButtonPassword.sendKeys(MainConfig.AmazonPassword);
	}
}