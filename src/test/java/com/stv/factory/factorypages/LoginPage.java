package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends FactoryPage {

    public static final String EMAIL_VALID = "vitali@mail.com";
    public static String PASSWORD_VALID = "vitalibembel";

    ///////////////////////////--Sign In--/////////////////////////////////////
    @FindBy(xpath = "//*[@id='LogOnModel_UserName-error']")
    private WebElement error;


    @FindBy(xpath = "//*[@id='wiggle']/div/div[1]/div")
    private WebElement fullSignInForm;
    //define locator of field Email address
    @FindBy(xpath = "//*[@id='LogOnModel_UserName']")
    private WebElement loginField;
    //button Sign in securely
    @FindBy(xpath = "//*[@id='qa-login']")
    private WebElement loginBtn;
    //define locator field Password
    @FindBy(xpath = "//*[@id='LogOnModel_Password']")
    private WebElement passwdField;
    ///////////////////////////--New Customer--/////////////////////////////////////
    //define locators field of address of form New Customer
    @FindBy(xpath = "//*[@id='DualRegisterEmailModel_Email']")
    private WebElement addNewCust;
    //button Sign in securely
    @FindBy(xpath = "//*[@id='qa-dual-register']")
    private WebElement continueBtn;
    //form new customer
    @FindBy(xpath = "//*[@id='wiggle']/div/div[2]/div")
    private WebElement formNewCust;
    //show password field
    @FindBy(id = "//*[@id='DualRegisterEmailModel_Email']")
    private WebElement passwordField;


    //method login
    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    //method password
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd);
    }

    //method enter button
    public void clickLoginBtn() {
        loginBtn.click();
    }

    //method new customer
    public void inputEmailNewCust(String login) {
        addNewCust.sendKeys(login);
    }
    //method continue button
    public void clickContinueBtn() {
        continueBtn.click();
    }

    //show form password
    public boolean isPasswordFieldDisplayed() {
        return passwordField.isDisplayed();
    }
    //full sign in form
    public boolean isFullSignInForm() {
        return fullSignInForm.isDisplayed();
    }
    //
    public boolean isErrorDisplayed(){
        return error.isDisplayed();
    }

    //method show login container
    public boolean isLoginContainerDisplayed(){
        return loginField.isDisplayed();
    }
    //method show form New Customer
    public boolean isFormNewCustomer(){
        return formNewCust.isDisplayed();
    }

    //чтобы аннотация @FindBy заработала,
    // необходимо использовать класс PageFactory.
   /* public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //определение локаторов поля Email address
    @FindBy(xpath = "//*[@id='qa-login']")
    private WebElement loginField;
    //кнопка Sign in securely
    @FindBy(xpath = "//*[@id='qa-login']")
    private WebElement loginBtn;
    //определение локаторов поля Password
    @FindBy(xpath = "//*[@id='LogOnModel_Password']")
    private WebElement passwdField;

    //определение локатора поля Email address формы New Customer
    @FindBy(xpath = "//*[@id='DualRegisterEmailModel_Email']")
    private WebElement addNewCust;
    //кнопка Sign in securely
    @FindBy(xpath = "//*[@id='qa-dual-register']")
    private WebElement continueBtn;

    //show password field
    @FindBy(id = "//*[@id='DualRegisterEmailModel_Email']")
    private WebElement passwordField;

    public LoginPage() {

    }

    //method login
    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    //method password
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd);
    }

    //method enter button
    public void clickLoginBtn() {
        loginBtn.click();
    }

    //method new customer
    public void inputEmailNewCust(String login) {
        addNewCust.sendKeys(login);
    }
    //method continue button
    public void clickContinueBtn() {
        continueBtn.click();
    }

    //show form password
    public boolean isPasswordFieldDisplayed() {
        return passwordField.isDisplayed();
    }*/
}
