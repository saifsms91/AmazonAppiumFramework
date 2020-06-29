
package testcases.android;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.TestBase;
import io.qameta.allure.Description;
import screens.androidpageobjects.AmazonHomePageAndroid;
import screens.androidpageobjects.LandingPageAndroid;

public class AmazonLoginTest extends TestBase {
    public LandingPageAndroid LandingPage = new LandingPageAndroid();
    public AmazonHomePageAndroid AmazonHomePage = new AmazonHomePageAndroid();

    @Test(priority = 1, enabled = true)
    @Description("Verify Valid login for Amazon")
    public void verifyValidLogin() throws Exception {

        System.out.println("verifyValidLogin: " + driver);
        LandingPage.tapSignInOnLandingPage();
        LandingPage.enterNumberOrEmail();
        LandingPage.tapContinueBtn();
        LandingPage.enterPassword();
        LandingPage.tapSignInSubmit();
        AmazonHomePage.tapAction_bar_burger_icon();
        String VALIDATEUSRNAME = AmazonHomePage.getusrname_display_burger();

        System.out.println("VALIDATEUSRNAME" + VALIDATEUSRNAME);
        assertEquals(VALIDATEUSRNAME, "Hello, sudhanshu");

    }


    @Test(priority = 3, enabled = true)
    @Description("Logout from Amazon")

    public void verifyLogout() throws Exception {

        AmazonHomePage.tapAction_bar_burger_icon();
        System.out.println("tapAction_bar_burger_icon");

        AmazonHomePage.tapSetting_bar_burger();
        System.out.println("tapSetting_bar_burger");

        AmazonHomePage.tapSign_out_setting_burger();
        System.out.println("tapSign_out_setting_burger");

        AmazonHomePage.tapSign_out_popup();
        System.out.println("tapSign_out_popup");

    }
}