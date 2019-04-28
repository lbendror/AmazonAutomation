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

		// Step 3 - Click on Your addresses link Under ג€˜Ordering and shopping preferencesג€™ Subject.
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
		//You have placed in ג€˜Add a new addressג€™ page.
		report.startLevel("Step 6 - Click on + ג€˜Add Addressג€™ area.");
		AddNewAddressOnAmazonPage.ClickOnYourAddressPlusIcon();
		Thread.sleep(500);
		report.endLevel();
		
		// Step 7 - Choose ג€˜Israelג€™ from ג€˜Country/Regionג€™ Dropdown.	
		//Israel ג€˜Country/Regionג€™ chosen.
		report.startLevel("Step 7 - Choose ג€˜Israelג€™ from ג€˜Country/Regionג€™ Dropdown.");
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

		// Step 8 - Type ג€˜Full nameג€™.	
		//Written ג€˜Full nameג€™ in field.
		report.startLevel("Step 8 - Type ג€˜Full nameג€™.");
		AddNewAddressOnAmazonPage.TypeFullName();
		Thread.sleep(1000);
		report.endLevel();

		// Step 9 - Type ג€˜Street addressג€™ in first field.	
		//Written ג€˜Street addressג€™ in first field.
		report.startLevel("Step 9 - Type ג€˜Street addressג€™ in first field.");
		AddNewAddressOnAmazonPage.TypeStreetAddress();
		Thread.sleep(500);
		report.endLevel();

		// Step 10 - Type ג€˜Apartment, suite, unit, building, floor, etc.ג€™ in second field	
		//Written ג€˜Apartment, suite, unit, building, floor, etc.ג€™ in second Street address field.
		report.startLevel("Step 10 - Type ג€˜Apartment, suite, unit, building, floor, etc.ג€™ in second field");
		AddNewAddressOnAmazonPage.TypeApartmentSuite();
		Thread.sleep(500);
		report.endLevel();

		// Step 11 - Type ג€˜Cityג€™.
		//Written ג€˜Cityג€™ in City field.
		report.startLevel("Step 11 - Type ג€˜Cityג€™.");
		AddNewAddressOnAmazonPage.TypeCity();
		Thread.sleep(500);
		report.endLevel();

		// Step 12 - Type ג€˜State / Province / Region.	
		//Written ג€˜State / Province / Region in field.
		report.startLevel("Step 12 - Type ג€˜State / Province / Region.");
		AddNewAddressOnAmazonPage.TypeStateProvinceRegion();
		Thread.sleep(500);
		report.endLevel();

		// Step 13 - Type ג€˜Zip Codeג€™.	
		//Written ג€˜Zip Codeג€™ in field.
		report.startLevel("Step 13 - Type ג€˜Zip Codeג€™.");
		AddNewAddressOnAmazonPage.TypeZipCode();
		Thread.sleep(500);
		report.endLevel();

		// Step 14 - Type ג€˜ID Numberג€™.
		//Written ג€˜ID Numberג€™ in field.
		report.startLevel("Step 14 - Type ג€˜ID Numberג€™.");
		AddNewAddressOnAmazonPage.TypeID_Number();
		Thread.sleep(500);
		report.endLevel();

		// Step 15 - Type ג€˜Phone numberג€™.
		//Written ג€˜Phone numberג€™ in field.
		report.startLevel("Step 15 - Type ג€˜Phone numberג€™.");
		AddNewAddressOnAmazonPage.TypePhoneNumber();
		Thread.sleep(500);
		report.endLevel();

		// Step 16 - Click On ג€˜Add Addressג€™ Button.
		//New Address added.
		report.startLevel("Step 16 - Click on ג€˜Add addressג€™ button.");
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
		Weג€™ll need your ID information after placing you order or it will be canceled. Delay in providing ID, may impact your delivery date. 
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