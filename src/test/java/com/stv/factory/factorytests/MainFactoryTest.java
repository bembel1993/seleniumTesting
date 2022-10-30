package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import org.testng.Assert;
import org.testng.annotations.*;


public class MainFactoryTest extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();

    //--1--//Input Login Password click Log Button
    @Test
    public void loginTest() {
        Assert.assertTrue(loginPage.isFullSignInForm(), "Not load");
        loginPage.inputLogin(LoginPage.EMAIL_VALID);
        loginPage.inputPasswd(LoginPage.PASSWORD_VALID);
        loginPage.clickLoginBtn();
        Assert.assertTrue(loginPage.isLoginContainerDisplayed(), "error");
    }

    //--2--//Input New Customer click Continue Button
    @Test
    public void addNewCustomerTest() {
        loginPage.inputEmailNewCust(LoginPage.EMAIL_VALID);
        loginPage.clickContinueBtn();
        boolean isFormNewCustomer = loginPage.isFormNewCustomer();
        Assert.assertTrue(isFormNewCustomer, "Form was not load");
    }

    //--3--//Link displayed
    @Test(description = "Assert the login page is loaded")
    public void assertLoginPageOpened() {
        boolean isAccountLinkDisplayed = mainFactoryPage.isAccountLinkDisplayed();
        Assert.assertTrue(isAccountLinkDisplayed, "Account link isn't visible");
        mainFactoryPage.clickOnAccountLink();
        Assert.assertTrue(new LoginPage().isLoginContainerDisplayed(), "Login page isn't loaded properly");
    }

    //--4--//
    @Test
    public void assertMainFactoryPage() {
        Assert.assertTrue(loginPage.isFullSignInForm(), "Not load");
        loginPage.inputLogin(LoginPage.EMAIL_VALID);
        loginPage.inputPasswd(LoginPage.PASSWORD_VALID);
        loginPage.clickLoginBtn();
        mainFactoryPage.entryMenu();
        mainFactoryPage.clickCookie();
        mainFactoryPage.userLogout();
        Assert.assertTrue(mainFactoryPage.isAccountLinkDisplayed(), "Login page isn't loaded properly");
    }
}


