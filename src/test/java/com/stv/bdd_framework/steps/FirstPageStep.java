package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;

public class FirstPageStep extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();

    @Given("^Main page is loaded")
    public void mainPageIsOpened() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
    }

    @When("^Click on accoun link$")
    public void userClicksAccountLink() {
        //mainFactoryPage.clickOnConfirmButton();
        mainFactoryPage.isAccountLinkDisplayed();
        mainFactoryPage.clickOnAccountLink();
    }

    @Then("^Account page is loaded$")
    public void assertLoginPageOpened(){
        boolean isAccountLinkDisplayed = mainFactoryPage.isAccountLinkDisplayed();
        Assert.assertTrue(isAccountLinkDisplayed, "Account link isn't visible"); }
}
