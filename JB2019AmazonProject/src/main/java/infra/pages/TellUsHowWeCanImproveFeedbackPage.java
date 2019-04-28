package infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import infra.web.By2;

public class TellUsHowWeCanImproveFeedbackPage extends AbstractPage{

	public final static By2 textareaSubmitButton = new By2("textarea Submit Button", By.cssSelector("div[class='a-section'] input[type='submit']"));

	public TellUsHowWeCanImproveFeedbackPage(WebDriver driver) throws Exception{
		super(driver, textareaSubmitButton);
	}

	// Step 2 - Write a 'Tell us how we can improve' in textarea.
	public static void textarea() {
		WebElement textarea = driver.findElement(By.cssSelector("div[class='a-input-text-wrapper a-spacing-base s-feedback-response-textarea'] textarea"));
		textarea.sendKeys("Your voice is important. Help us make it easier to find what you want...");
	}

	// Step 3 - click the submit button under textarea.
	public static void textareaSubmitButton() {
		bot.click(textareaSubmitButton);
	}
}