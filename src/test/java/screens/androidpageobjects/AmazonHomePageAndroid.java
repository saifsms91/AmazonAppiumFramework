package screens.androidpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;

import base.ScreenBase;

public class AmazonHomePageAndroid extends ScreenBase {
	String Settings;

	By action_bar_burger_icon = By.id("in.amazon.mShop.android.shopping:id/action_bar_burger_icon");
	By setting_bar_burger = By.xpath(
			"//android.widget.TextView[@content-desc=\"Settings button. Double tap for links to change country, sign out, and more.\"]");
	By sign_out_setting_burger = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout");
	By sign_out_popup = By.id("android:id/button2");
	By usrname_display_burger = By.id("in.amazon.mShop.android.shopping:id/gno_greeting_text_view");
	By Shop_by_Category = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
	By TV_Appliances_Electronics = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[11]/android.view.View[1]/android.view.View[4]");
	By Headphones = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[11]/android.view.View[20]");

	By deals_idp_first_headphone = By.id("idp-first-image");

	By Sennheiser_CX_180_Street_II_In = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ViewSwitcher/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup");

	By add_to_cart_button = By.id("add-to-cart-button");

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

	public String getusrname_display_burger()

	{

		return driver.findElement(usrname_display_burger).getText();

	}

	public void tap_Shop_by_Category()

	{

		driver.findElement(Shop_by_Category).click();

		System.out.println("Tap on Shop_by_Category ");

	}

	public void tapTV_Appliances_Electronics()

	{

		driver.findElement(TV_Appliances_Electronics).click();

	}

	public void tapHeadphones()

	{

		driver.findElement(Headphones).click();

	}

	public void dealsHeadphonesCarousel()

	{

		driver.findElement(deals_idp_first_headphone).click();

	}

	public void addFirstHeadphonesListing()

	{

		driver.findElement(Sennheiser_CX_180_Street_II_In).click();

	}

	public void addFirstHeadphonesToCart()

	{

		driver.findElement(add_to_cart_button).click();

	}

}
