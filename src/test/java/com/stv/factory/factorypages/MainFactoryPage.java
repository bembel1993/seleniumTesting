package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {
    //define locator of link account
    @FindBy(id = "accountLink")
    private WebElement accountLink;

    @FindBy(xpath = "//*[@id='truste-consent-button']")
    private WebElement allCookieEnter;

    //define locator of user menu
    @FindBy(xpath = "//*[@id='wiggle']")
    private WebElement userMenu;
    //define locator of button logout from account
   // @FindBy(linkText = "//*[contains(text(),'Log Out')]")
   // private WebElement logoutBtn;
//*[@id="wiggle"]/div/div/div/div/div[1]/div/div/a
    @FindBy(xpath = "//*[contains(text(),'Log Out')]")
    private WebElement logoutBtn;

    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    private WebElement trustButton;

    public MainFactoryPage() {

    }

    public void clickCookie(){allCookieEnter.click();}

    //show link account
    public boolean isAccountLinkDisplayed() {
        return accountLink.isDisplayed();
    }

    //click link account
    public void clickOnAccountLink() {
        accountLink.click();
    }

    //method for push button of user menu
    public void entryMenu() {
        userMenu.click();
    }

    //method for push button of logout from account
    public void userLogout() {
        logoutBtn.click();
    }

    /*
        //метод для получения имени пользователя из меню пользователя
        public String getUserName() {
          //  WebDriverWait wait = new WebDriverWait(driver, 10);
          //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='wiggle']/div/div/div/div/div[1]/div/div/h2")));
            String userName = userMenu.getText();
            return userName;
        }
     */

 /*   //конструктор класса, занимающийся инициализацией полей класса
    public WebDriver driver;

    public MainFactoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    //определение локатора меню пользователя
    @FindBy(xpath = "//*[@id='wiggle']")
    private WebElement userMenu;

    //определение локатора кнопки выхода из аккаунта
    @FindBy(xpath = "//*[@id='wiggle']/div/div/div/div/div[1]/div/div/a")
    private WebElement logoutBtn;

    public MainFactoryPage() {

    }

    //метод для получения имени пользователя из меню пользователя
    public String getUserName() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='wiggle']/div/div/div/div/div[1]/div/div/h2")));
        String userName = userMenu.getText();
        return userName;
    }

    //метод для нажатия кнопки меню пользователя
    public void entryMenu() {
        userMenu.click();
    }

    //метод для нажатия кнопки выхода из аккаунта
    public void userLogout() {
        logoutBtn.click();
    }*/
}
