package com.nopcommerce.demo.testSuite.homePage;

import com.nopcommerce.demo.customlisteners.CustomListner;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.retryAnalyzer.RetryAnalyzer;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListner.class)
public class TestTopMenu extends TestBase {

    HomePage homepage=new HomePage();

    @Test(groups = {"smoke","sanity","regression"},retryAnalyzer = RetryAnalyzer.class)
    public void selectMenuAndClick() throws InterruptedException {
        String expectedText=homepage.selectMenu("Computers");
        String actualText=homepage.getActualText();
        Assert.assertEquals(expectedText,actualText);

    }

}
