package base;

import java.net.MalformedURLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.AppiumDriver;
import screens.androidpageobjects.LandingPageAndroid;

import utils.CommonUtils;

public class TestBase {

	public static AppiumDriver driver;
	public LandingPageAndroid LandingPage;

	private static final String ANDROID_URI = "/Users/saif.siddiqui/Downloads/Appium/src/test/resources/app/AmazonIndia.apk";

	@BeforeSuite
	public void setUp() throws MalformedURLException {

		pageObjectConfig();
		System.out.println("Setup TestCase");

		CommonUtils utils = new CommonUtils();

		utils.setup("Android", "Motorola", ANDROID_URI);
		driver = utils.driver;

	}

	private void pageObjectConfig() {

	}

	@AfterSuite
	public void tearDown() {

		driver.quit();

	}

}
