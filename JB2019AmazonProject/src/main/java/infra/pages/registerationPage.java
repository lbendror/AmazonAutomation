package infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import infra.web.By2;

public class registerationPage extends AbstractPage{

	private static final By2 createYourAccountSubmitButton = new By2("'Create your Amazon Submit Button In Sign-In' Page", By.id("createAccountSubmit"));
	private static final By2 ContinueButton = new By2("Continue Button In Sign-In' Page", By.id("continue"));

	public registerationPage(WebDriver driver) throws Exception {
		super(driver, createYourAccountSubmitButton, ContinueButton);
	}

	public static void createYourAccountSubmit() throws Exception {
		bot.click(createYourAccountSubmitButton);
	}
	// Step 2 - Check the Full name text field without Prefix.
	public static void CheckTheFullNameWithoutPrefix() {
		WebElement CheckTheFullNameWithoutPrefix = driver.findElement(By.id("ap_customer_name"));
		CheckTheFullNameWithoutPrefix.sendKeys(".");
	}
	public static void ContinueButton() throws Exception {
		bot.click(ContinueButton);
	}
	// Step 3 - Check by adding numbers instead of string in the full name text field.
	public static void Clear_ap_customer_name() {
		WebElement Clear_ap_customer_name = driver.findElement(By.id("ap_customer_name"));
		Clear_ap_customer_name.clear();
	}
	// Step 3 - Check by adding numbers instead of string in the full name text field.
	public static void SendKeysAPCustomerName() {
		WebElement ClearCustomerName = driver.findElement(By.id("ap_customer_name"));
		ClearCustomerName.sendKeys("!@#$%^&*");
	}
	// Step 4 - Check the Full name text field with special characters in Prefix.
	public static void Clear_ap_email() {
		WebElement Clear_ap_email = driver.findElement(By.id("ap_email"));
		Clear_ap_email.clear();
	}
	// Step 4 - Check the Full name text field with special characters in Prefix.
	public static void SendKeys_ap_customer_name4() {
		WebElement SendKeys_ap_customer_name4 = driver.findElement(By.id("ap_customer_name"));
		SendKeys_ap_customer_name4.sendKeys("Liron BenDror@!");
	}
	// Step 5 - Check the Full name text field with special characters in First name.
	public static void SendKeys_ap_customer_name5() {
		WebElement SendKeys_ap_customer_name5 = driver.findElement(By.id("ap_customer_name"));
		SendKeys_ap_customer_name5.sendKeys("Liron@!");
	}
	// Step 6 - Check the Full name text field with special characters in Last name.
	public static void SendKeys_ap_customer_name6() {
		WebElement SendKeys_ap_customer_name6 = driver.findElement(By.id("ap_customer_name"));
		SendKeys_ap_customer_name6.sendKeys("BenDror@!");
	}
	// Step 7 - Check the Full name text field without adding First name.
	public static void SendKeys_ap_customer_name7() {
		WebElement SendKeys_ap_customer_name7 = driver.findElement(By.id("ap_customer_name"));
		SendKeys_ap_customer_name7.sendKeys("BenDror");
	}
	// Step 8 - Check the Full name text field without adding Last name.
	public static void SendKeys_ap_customer_name8() {
		WebElement SendKeys_ap_customer_name8 = driver.findElement(By.id("ap_customer_name"));
		SendKeys_ap_customer_name8.sendKeys("Liron BenDror");
	}
	// Step 10 - Check the Email text field that has Email address without @ symbol.
	public static void SendKeys_ap_customer_name10() {
		WebElement SendKeys_ap_customer_name10 = driver.findElement(By.id("ap_email"));
		SendKeys_ap_customer_name10.sendKeys("lbendror_hotmail.com");
	}
	// Step 11 - Check the Email text field as 'name@gmail'.
	public static void SendKeys_ap_customer_name11() {
		WebElement SendKeys_ap_customer_name11 = driver.findElement(By.id("ap_email"));
		SendKeys_ap_customer_name11.sendKeys("name@gmail");
	}
	// Step 12 - Check the Email text field that has VALID Email address. //Success, go to Verify password.
	public static void SendKeys_ap_customer_name12() {
		WebElement SendKeys_ap_customer_name12 = driver.findElement(By.id("ap_email"));
		SendKeys_ap_customer_name12.sendKeys("lbendror@hotmail.com");
	}
	// Step 13 - Verify if you can keep password blank and submit the form.	//Get an error message: ‚Enter your password‚.
	public static void Clear_ap_password(){
		WebElement Clear_ap_password = driver.findElement(By.id("ap_password"));
		Clear_ap_password.clear();
	}
	public static void Clear_ap_password_check(){
		WebElement Clear_ap_password_check = driver.findElement(By.id("ap_password_check"));
		Clear_ap_password_check.clear();
	}
	// Step 13 - Verify if you can keep password blank and submit the form.	//Get an error message: ‚Enter your password‚.
	public static void SendKeys_ap_customer_name13(){
		WebElement SendKeys_ap_customer_name13 = driver.findElement(By.id("ap_password"));
		SendKeys_ap_customer_name13.sendKeys("");
	}
	public static void SendKeys_ap_customer_name13_1(){
		WebElement SendKeys_ap_customer_name13_1 = driver.findElement(By.id("ap_password_check"));
		SendKeys_ap_customer_name13_1.sendKeys("");
	}
	// Step 14 - Check if you can type password less than 6 characters long.
	public static void SendKeys_ap_customer_name14(){
		WebElement SendKeys_ap_customer_name14 = driver.findElement(By.id("ap_password"));
		SendKeys_ap_customer_name14.sendKeys("12345");
	}
	public static void SendKeys_ap_customer_name14_1(){
		WebElement SendKeys_ap_customer_name14_1 = driver.findElement(By.id("ap_password_check"));
		SendKeys_ap_customer_name14_1.sendKeys("12345");
	}
	// Step 15 - Check if you can type password must be at least 6 characters. 
	public static void SendKeys_ap_customer_name15(){
		WebElement SendKeys_ap_customer_name15 = driver.findElement(By.id("ap_password"));
		SendKeys_ap_customer_name15.sendKeys("Aa3456");
	}
	public static void SendKeys_ap_customer_name15_1(){
		WebElement SendKeys_ap_customer_name15_1 = driver.findElement(By.id("ap_password_check"));
		SendKeys_ap_customer_name15_1.sendKeys("Aa3456");
	}
}
