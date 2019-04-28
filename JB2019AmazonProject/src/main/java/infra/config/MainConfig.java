package infra.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import infra.web.WebDriverType;

public class MainConfig {

	public static WebDriverType webDriverType;
	public static boolean closeBrowserAtTestEnd;
	public static int webDriverImplicitWaitInSeconds;
	public static String baseUrl;
	public static String username;
	public static String password;
	public static String AmazonUsername;
	public static String AmazonPassword;
	public static String GmailUsername;
	public static String GmailPassword;
	
	public static void initFromFile(String filePath) throws IOException {
		
		Properties prop = new Properties();
		InputStream input = new FileInputStream("resources/MainConfig.properties");

		prop.load(input);

		webDriverType = WebDriverType.valueOf(prop.getProperty("webDriverType"));
		closeBrowserAtTestEnd = Boolean.parseBoolean(prop.getProperty("closeBrowserAtTestEnd"));
		webDriverImplicitWaitInSeconds = Integer.parseInt(prop.getProperty("webDriverImplicitWaitInSeconds"));
		baseUrl = prop.getProperty("baseUrl");
		AmazonUsername = prop.getProperty("AmazonUsername");
		AmazonPassword = prop.getProperty("AmazonPassword");
		GmailUsername = prop.getProperty("GmailUsername");
		GmailPassword = prop.getProperty("GmailPassword");
		
		input.close();
	}
}