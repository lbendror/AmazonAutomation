package infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import infra.web.By2;

public class ResultsSidebarOnAmazonPage extends AbstractPage{

	private static final By2 RefineByConditionNew = new By2("Refine By Condition New Link", By.xpath("//li[@id='p_n_condition-type/6461716011']/span[@class='a-list-item']//a"));
	private static final By2 RefineByDepartment = new By2("Refine By Department Link", By.xpath("//li[@id='n/7072561011'][@class='a-spacing-micro s-navigation-indent-1']//a/span[text()='Cell Phones']"));
	private static final By2 AvgCustomerReview = new By2("Avg Customer Review Link", By.xpath("//li[@id='p_72/2491149011']//a"));
	private static final By2 BrandReview = new By2("Refine By Brand Link", By.xpath("//li[@id='p_89/Apple']//a"));

	public ResultsSidebarOnAmazonPage(WebDriver driver) throws Exception {
		super(driver, RefineByConditionNew, RefineByDepartment, AvgCustomerReview, BrandReview);
	}
	//Step 3 - On the LEFT results, Refine by Condition New.
	public static void RefineByCondition() throws Exception{
		bot.click(RefineByConditionNew);
		//Thread.sleep(500);
	}
	//Step 4 - On the results by Condition Click on ג€˜Cell Phonesג€™ Department.
	public static void RefineByDepartment() throws Exception{
		bot.click(RefineByDepartment);
		//Thread.sleep(500);
	}
	//Step 5 - On the results by Condition Click on Refine by Avg. Customer Review.
	public static void AvgCustomerReview() throws Exception{
		bot.click(AvgCustomerReview);
		//Thread.sleep(500);
	}
	//Step 6 - On the results by Condition Click on Refine by Brand.
	public static void Brand() throws Exception{
		bot.click(BrandReview);
		//Thread.sleep(500);
	}
}