package tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import il.co.topq.difido.ReportDispatcher;
import il.co.topq.difido.ReportManager;
import infra.config.MainConfig;
import infra.pages.AddNewAddressOnAmazonPage;
import infra.pages.AmazonLandingPage;
import infra.pages.loginToAmazonPage;

public class AddNewAddressOnAmazon extends AbstractTest {

	protected ReportDispatcher report = ReportManager.getInstance();

	@Test
	public void _01_AddNewAddressOnAmazon() throws Exception {

		// Step 1 - Browse to amazon.com landing page.
		report.startLevel("Step 1 - Browse to amazon.com landing page");
		browseToUrl(MainConfig.baseUrl);
		AmazonLandingPage amazonLandingPage = new AmazonLandingPage(driver);
		report.endLevel();

		// Step 2 - Click on Amazon Footer Page > click on Your Account Link.
		report.startLevel("Step 2 - Click on Amazon Footer Page > click on Your Account Link.");
		AddNewAddressOnAmazonPage.ClickOnYourAccountLink();
		report.endLevel();

		// Step 3 - Click on Your addresses link Under ‘Ordering and shopping preferences’ Subject.
		//You have placed in Your Addresses page.
		report.startLevel("Step 3 - Click on Your Addresses Plus icon.");
		AddNewAddressOnAmazonPage.ClickOnYourAddressLink();
		Thread.sleep(500);
		report.endLevel();

		// Step 4 - Verify you have a valid Username and password, and you logged-in to amazon site.	
		// Appear Hello <name> Account & Lists.
		report.startLevel("Step 4 - Verify you have a valid Username and password, and you logged-in to amazon site.");
		//AddNewAddressOnAmazonPage amazonHelloSignInLink = new AddNewAddressOnAmazonPage(driver);
		//amazonHelloSignInLink.amazonHelloSignIn();
		AddNewAddressOnAmazonPage.EMAIL();
		AddNewAddressOnAmazonPage.PASSWORD();
		loginToAmazonPage.SignInSubmit();
		report.endLevel();

		/*
		 Sometimes after you login to amazon. Amazon request a Verification,
		 So Please Clear Browsing Data. Choose Advanced and checked all, then click on 'Clear data' button.
		 And Try again to run this test. 
		 */

		// Step 6 - Click on Plus Your Addresses icon.	
		//You have placed in ‘Add a new address’ page.
		report.startLevel("Step 6 - Click on + ‘Add Address’ area.");
		AddNewAddressOnAmazonPage.ClickOnYourAddressPlusIcon();
		Thread.sleep(500);
		report.endLevel();

		// Step 7 - Choose ‘Israel’ from ‘Country/Region’ Dropdown.	
		//Israel ‘Country/Region’ chosen.
		report.startLevel("Step 7 - Choose ‘Israel’ from ‘Country/Region’ Dropdown.");
		AddNewAddressOnAmazonPage.ChooseIsraelFromCountryRegionDropdown();
		//Switches control to the new window
		Set<String> eachwin = driver.getWindowHandles();
		for (String win : eachwin) {
			driver.switchTo().window(win);
		}
		//Selecting value from Country/Region Dropdown.
		report.startLevel("Step 7.1 - Selecting value from Country/Region Dropdown.");
		WebElement ele = driver.findElement(By.className("a-native-dropdown"));
		Select dropdown = new Select(ele);
		dropdown.selectByVisibleText("Israel");
		report.startLevel("Step 7.2 - Choose 'Israel' value from Country/Region Dropdown.");
		Thread.sleep(1000);
		//Switches to the new window with country selected.
		report.startLevel("Step 7.3 - Switches to the new window with country selected.");
		Set<String> eachwin2 = driver.getWindowHandles();
		for(String win2 : eachwin2)
		{ driver.switchTo().window(win2); }
		report.endLevel();

		// Step 8 - Type ‘Full name’.	
		//Written ‘Full name’ in field.
		report.startLevel("Step 8 - Type ‘Full name’.");
		AddNewAddressOnAmazonPage.TypeFullName();
		Thread.sleep(1000);
		report.endLevel();

		// Step 9 - Type ‘Street address’ in first field.	
		//Written ‘Street address’ in first field.
		report.startLevel("Step 9 - Type ‘Street address’ in first field.");
		AddNewAddressOnAmazonPage.TypeStreetAddress();
		Thread.sleep(500);
		report.endLevel();

		// Step 10 - Type ‘Apartment, suite, unit, building, floor, etc.’ in second field	
		//Written ‘Apartment, suite, unit, building, floor, etc.’ in second Street address field.
		report.startLevel("Step 10 - Type ‘Apartment, suite, unit, building, floor, etc.’ in second field");
		AddNewAddressOnAmazonPage.TypeApartmentSuite();
		Thread.sleep(500);
		report.endLevel();

		// Step 11 - Type ‘City’.
		//Written ‘City’ in City field.
		report.startLevel("Step 11 - Type ‘City’.");
		AddNewAddressOnAmazonPage.TypeCity();
		Thread.sleep(500);
		report.endLevel();

		// Step 12 - Type ‘State / Province / Region.	
		//Written ‘State / Province / Region in field.
		report.startLevel("Step 12 - Type ‘State / Province / Region.");
		AddNewAddressOnAmazonPage.TypeStateProvinceRegion();
		Thread.sleep(500);
		report.endLevel();

		// Step 13 - Type ‘Zip Code’.	
		//Written ‘Zip Code’ in field.
		report.startLevel("Step 13 - Type ‘Zip Code’.");
		AddNewAddressOnAmazonPage.TypeZipCode();
		Thread.sleep(500);
		report.endLevel();

		// Step 14 - Type ‘ID Number’.
		//Written ‘ID Number’ in field.
		report.startLevel("Step 14 - Type ‘ID Number’.");
		AddNewAddressOnAmazonPage.TypeID_Number();
		Thread.sleep(500);
		report.endLevel();

		// Step 15 - Type ‘Phone number’.
		//Written ‘Phone number’ in field.
		report.startLevel("Step 15 - Type ‘Phone number’.");
		AddNewAddressOnAmazonPage.TypePhoneNumber();
		Thread.sleep(500);
		report.endLevel();

		// Step 16 - Click On ‘Add Address’ Button.
		//New Address added.
		report.startLevel("Step 16 - Click on ‘Add address’ button.");
		AddNewAddressOnAmazonPage.ClickOnAddAddressButton();
		Thread.sleep(500);

		// Transfer to new page: 'Add ID for customs clearance'.
		// Verify you Transfer to new page: 'Add ID for customs clearance'.
		report.startLevel("Step 15.1 - Transfer to new page: 'Add ID for customs clearance'.");
		WebElement warningMessageTitle = driver.findElement(By.xpath("//h1[text()='Add ID for customs clearance']"));
		String warningMessageTitleText = warningMessageTitle.getText();
		Assert.assertEquals(warningMessageTitleText, "Add ID for customs clearance", "You just finished to filled new address and Transfer to new page: 'Add ID for customs clearance'.");
		report.startLevel("Step 15.2 - Verify you Transfer to new page: 'Add ID for customs clearance'. Transfer to new page: '" +warningMessageTitleText+ "'.");
		report.endLevel();

		// Step 17 - Choose to 'Skip for now' input.
		/* Alert will appear:
		ID required for customs clearance
		We’ll need your ID information after placing you order or it will be canceled. Delay in providing ID, may impact your delivery date. 
		You can skip this step for now, but it may impact your delivery date.*/
		report.startLevel("Step 17 - Choose to Skip for now input.");
		AddNewAddressOnAmazonPage.SKIPFORNOWINPUT();
		report.endLevel();

		// Step 18 - Click on Continue button. 	//Transferred to sign in page, enter Password field.
		report.startLevel("Step 18 - Click on Continue button. Transferred to sign in page, enter Password field.");
		AddNewAddressOnAmazonPage.SKIPFORNOWContinueButton();
		report.endLevel();

		// Step 19 - Type password field. And click sign in. //Transferred to Your Addresses page
		report.startLevel("Step 19 - Type password field. And click sign in. Transferred to Your Addresses page");
		WebElement warningMessageTitle2 = driver.findElement(By.xpath("//div[@id='yaab-alert-box']//h4[@class='a-alert-heading'][text()='Address saved']"));
		String warningMessageTitleText2 = warningMessageTitle2.getText();
		report.startLevel("Step 19.1 - You Successfully finished to add new address, '" + warningMessageTitleText2 + "', notify to you.");
		Assert.assertEquals(warningMessageTitleText2, "Address saved", "Step 19.2 - You Successfully finished to add new address, 'Address saved', notify to you."); 
		report.endLevel();
	}
}
