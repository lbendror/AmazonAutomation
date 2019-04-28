package infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import infra.web.By2;

public class LanguageSettingsPage extends AbstractPage{

	public final static By2 ChangeLanguageSettings = new By2("'Change Language Settings' Page", By.id("icp-btn-save-announce"));
	public final static By2 SaveChangesButton = new By2("'Save Changes Button'", By.xpath("//span[@id='icp-btn-save']//input[@class='a-button-input']"));
	public final static By2 ChangeTheRadioButton_ENToES = new By2("Change the radio button From English ג€“ EN To ES", By.xpath("//div[2]/div[@class='a-radio a-radio-fancy']//i[@class='a-icon a-icon-radio']"));
	public final static By2 ChangeTheRadioButton_ESToZH = new By2("Change the radio button From English ג€“ ES To ZH", By.xpath("//div[3]/div[@class='a-radio a-radio-fancy']//i[@class='a-icon a-icon-radio']"));
	public final static By2 ChangeTheRadioButton_ZHToDE = new By2("Change the radio button From English ג€“ ZH To DE", By.xpath("//div[4]/div[@class='a-radio a-radio-fancy']//i[@class='a-icon a-icon-radio']"));
	public final static By2 ChangeTheRadioButton_DEToPT = new By2("Change the radio button From English ג€“ DE To PT", By.xpath("//div[5]/div[@class='a-radio a-radio-fancy']//i[@class='a-icon a-icon-radio']"));
	public final static By2 ChangeTheRadioButton_PTToZH = new By2("Change the radio button From English ג€“ PT To ZH", By.xpath("//div[6]/div[@class='a-radio a-radio-fancy']//i[@class='a-icon a-icon-radio']"));
	public final static By2 ChangeTheRadioButton_ZHToKO = new By2("Change the radio button From English ג€“ ZH To KO", By.xpath("//div[7]/div[@class='a-radio a-radio-fancy']//i[@class='a-icon a-icon-radio']"));

	public LanguageSettingsPage(WebDriver driver) throws Exception {
		super(driver, ChangeLanguageSettings, SaveChangesButton, ChangeTheRadioButton_ENToES, ChangeTheRadioButton_ESToZH,
				ChangeTheRadioButton_ZHToDE, ChangeTheRadioButton_DEToPT, ChangeTheRadioButton_PTToZH, ChangeTheRadioButton_ZHToKO);
	}

	public void ChangeLanguageSettings() throws Exception {
		bot.click(ChangeLanguageSettings);
		Thread.sleep(1000);
	}
	public static void SaveChangesButton() throws Exception {
		bot.click(SaveChangesButton);
		Thread.sleep(1000);
	}
	public static void ChangeTheRadioButton_ENToES() throws Exception {
		bot.click(ChangeTheRadioButton_ENToES);
		Thread.sleep(1000);
	}
	public static void ChangeTheRadioButton_ESToZH() throws Exception {
		bot.click(ChangeTheRadioButton_ESToZH);
		Thread.sleep(1000);
	}
	public static void ChangeTheRadioButton_ZHToDE() throws Exception {
		bot.click(ChangeTheRadioButton_ZHToDE);
		Thread.sleep(1000);
	}
	public static void ChangeTheRadioButton_DEToPT() throws Exception {
		bot.click(ChangeTheRadioButton_DEToPT);
		Thread.sleep(1000);
	}
	public static void ChangeTheRadioButton_PTToZH() throws Exception {
		bot.click(ChangeTheRadioButton_PTToZH);
		Thread.sleep(1000);
	}
	public static void ChangeTheRadioButton_ZHToKO() throws Exception {
		bot.click(ChangeTheRadioButton_ZHToKO);
		Thread.sleep(1000);
	}
}