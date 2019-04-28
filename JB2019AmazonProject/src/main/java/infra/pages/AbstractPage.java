package infra.pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import infra.web.ActionBot;
import infra.web.By2;
import il.co.topq.difido.ReportDispatcher;
import il.co.topq.difido.ReportManager;

public abstract class AbstractPage {

	protected ReportDispatcher report = ReportManager.getInstance();
	protected static WebDriver driver;
	protected static ActionBot bot;
	public static By2[] pageUniqueElements;
	
	//Call to function accept to call 0 or +1 of object is By
	public AbstractPage(WebDriver driver, By2... pageUniqueElements) throws Exception {
		this.driver = driver;
		this.bot = new ActionBot(driver);
		this.pageUniqueElements = pageUniqueElements;
		assertInPage();
	}
	
	public void assertInPage() throws Exception {
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		
		try {
			for (By2 uniqueElement : pageUniqueElements) {
				webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(uniqueElement.by));
			}
			report.log("*** On page: " + this.getClass().getSimpleName());
		}
		catch (TimeoutException ex) {
			throw new Exception("Not on the expected page: " + this.getClass().getSimpleName() + "\n" + ex.getMessage());
		}
	}
}