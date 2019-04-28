package infra.web;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import infra.config.MainConfig;
import infra.reports.ConsoleReporter;
import il.co.topq.difido.ReportDispatcher;
import il.co.topq.difido.ReportManager;

public class WebDriverFactory {
	
	public WebDriverFactory() {
        ReportDispatcher report = ReportManager.getInstance();
    }

	public static WebDriver getWebDriver(WebDriverType webDriverType) {
		
		WebDriver driver = null;
		
		switch(webDriverType) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver");
			driver = new FirefoxDriver();
			break;
		case INTERNET_EXPLORER:
			System.setProperty("webdriver.ie.driver", "webdrivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}
		
		driver.manage().timeouts().implicitlyWait(MainConfig.webDriverImplicitWaitInSeconds, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		ConsoleReporter.report("Opened new " + webDriverType + " browser window");
		
		return driver;
	}
}