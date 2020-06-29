package testcases.android;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.TestBase;
import io.qameta.allure.Description;
import screens.androidpageobjects.AmazonHomePageAndroid;
import screens.androidpageobjects.LandingPageAndroid;

public class SelectHeadPhonefromElectronic extends TestBase {

    public LandingPageAndroid LandingPage = new LandingPageAndroid();
    public AmazonHomePageAndroid AmazonHomePage = new AmazonHomePageAndroid();

    @Test(priority = 2, enabled = true)
    @Description("Add 1st headphone in cart")
    public void headPhoneSection() throws Exception {

        System.out.println("Select Headphone: " + driver);
//		AmazonHomePage.tapAction_bar_burger_icon();
//		System.out.println("tapAction_bar_burger_icon");


        AmazonHomePage.tap_Shop_by_Category();


        AmazonHomePage.tapTV_Appliances_Electronics();
        System.out.println("Select tapTV_Appliances_Electronics: ");

        AmazonHomePage.tapHeadphones();
        System.out.println("Select tapHeadphones: ");

        AmazonHomePage.dealsHeadphonesCarousel();
        System.out.println("Select dealsHeadphonesCarousel: ");


        AmazonHomePage.addFirstHeadphonesListing();
        System.out.println("Select addFirstHeadphonesListing: ");


        AmazonHomePage.addFirstHeadphonesToCart();
        System.out.println("Select addFirstHeadphonesToCart: ");


    }


}
