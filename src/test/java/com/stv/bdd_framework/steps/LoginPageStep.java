package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.tools.ant.taskdefs.Sleep;
import org.testng.Assert;

import static java.lang.String.valueOf;

public class LoginPageStep extends BasicFactoryTest {
   /* LoginPage loginPage = new LoginPage();

    @When("The user inputs email {int}")
    public void theUserInputsEmail(int emailAddress){
        String arg = valueOf(emailAddress).toString();
        loginPage.inputEmailAddress(arg);
        //Sleep sleep = new Sleep();
        //sleep.doSleep(2000);
    }

    @When("The user inputs passwor {string}")
    public void theUserInputsPassword(String arg){
        loginPage.inputPassword(arg);
    }
//
    @And("^The user clears password field$")
    public void theUserClearsPasswordField(){
        loginPage.clearPassword();
    }
    /*
    @Then("^account page is opened$")
    public void accountPageIsOpened() {
        Assert.assertTrue(new LoginPage().isLoginContainerDisplayed(), "Login page isn't loaded properly");
    }

    @When("^a user inputs email (.+@.+\\..+)$")
    public void userInputsEmail(String email) {
        loginPage.insertEmailOnRegistration(email);
    }

    @And("^click Continue button$")
    public void userClicksContinueButton() {
        loginPage.clickRegisterButton();
    }

    @Then("^a user is redirected to New customer page$")
    public void newCustomerPageOpened() {
        boolean isFullRegistrationFormDisplayed = loginPage.isFullRegistrationFormDisplayed();
        Assert.assertTrue(isFullRegistrationFormDisplayed, "Full Registration Form is not available");
    }*/
}
