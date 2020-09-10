package screens.androidpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;

import base.ScreenBase;

public class AmazonHomePageAndroid extends ScreenBase {
    String Settings;

    By action_bar_burger_icon = By.id("in.amazon.mShop.android.shopping:id/action_bar_burger_icon");

    By setting_bar_burger = By.xpath("//*[@resource-id='in.amazon.mShop.android.shopping:id/drawer_icon']");

    By sign_out_setting_burger = By.xpath(
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout");

    By sign_out_popup = By.id("android:id/button2");

    By usrname_display_burger = By.id("in.amazon.mShop.android.shopping:id/gno_greeting_text_view");


    By Shop_by_Category = By.xpath("//*[contains(@text,'Shop by Category')]");


    By TV_Appliances_Electronics = By.xpath("//*[contains(@text,'TV, Appliances, Electronics')]");


    By Headphones = By.xpath("//*[contains(@text,'Headphones')]");


    By deals_idp_first_headphone = By.xpath("//*[contains(@text,'Bose SoundSport, Wireless Earbuds, (Sweatproof Bluetooth Headphones for Running and Sports), Aqua')]");


    By Bose = By.xpath("//*[contains(@text,'Bose SoundSport, Wireless Earbuds, (Sweatproof Bluetooth Headphones for Running and Sports), Aqua')]");


    By add_to_cart_button = By.xpath("//*[contains(@text,'Add to Cart')]");


    public void tapAction_bar_burger_icon() {
        driver.findElement(action_bar_burger_icon).click();
    }

    public void tapSetting_bar_burger() {

        driver.findElement(setting_bar_burger).click();

    }

    public void tapSign_out_setting_burger() {

        driver.findElement(sign_out_setting_burger).click();

    }

    public void tapSign_out_popup() {
        driver.findElement(sign_out_popup).click();
    }

    public String getusrname_display_burger() {

        return driver.findElement(usrname_display_burger).getText();

    }

    public void tap_Shop_by_Category() {

        driver.findElement(Shop_by_Category).click();

        System.out.println("Tap on Shop_by_Category ");

    }

    public void tapTV_Appliances_Electronics() {

        driver.findElement(TV_Appliances_Electronics).click();

    }

    public void tapHeadphones() {

        driver.findElement(Headphones).click();

    }

    public void dealsHeadphonesCarousel() {

        driver.findElement(deals_idp_first_headphone).click();

    }

    public void addFirstHeadphonesListing() {

        driver.findElement(Bose).click();

    }

    public void addFirstHeadphonesToCart() {

        driver.findElement(add_to_cart_button).click();

    }

}