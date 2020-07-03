package screens.androidpageobjects;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import base.ScreenBase;
import utils.CommonUtils;

public class LandingPageAndroid extends ScreenBase {

    String USERNAME = "";
    String PASSWORD = "";

    public LandingPageAndroid() {
        try {
            Properties properties = CommonUtils.read_properties();
            USERNAME = properties.getProperty("email");
            PASSWORD = properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    By sign_in_button = By.id("in.amazon.mShop.android.shopping:id/sign_in_button");
    By ap_email_login = By.xpath("//*[@resource-id='ap_email_login']");
    By continueBtn = By.xpath("//*[@resource-id='continue']");
    By ap_password = By.xpath("//*[@resource-id='ap_password']");
    By signInSubmit = By.xpath("//*[@resource-id='signInSubmit']");

    public void tapSignInOnLandingPage() {
        System.out.println("tapSignInOnLandingPage: " + driver);
        driver.findElement(sign_in_button).click();
    }

    public void enterNumberOrEmail() {
        driver.findElement(ap_email_login).sendKeys(USERNAME);
    }

    public void tapContinueBtn() {
        driver.findElement(continueBtn).click();
    }

    public void enterPassword() {
        driver.findElement(ap_password).sendKeys(PASSWORD);
    }

    public void tapSignInSubmit() {
        driver.findElement(signInSubmit).click();
    }

}
