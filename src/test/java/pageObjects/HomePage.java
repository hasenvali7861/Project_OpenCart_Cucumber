package pageObjects;

import Hooks.DriverInstance;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverInstance {

    public HomePage(RemoteWebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='My Account']")
    WebElement lnkMyAccount;

    @FindBy(xpath = "//a[text()='Register']")
    WebElement lnkRegister;

    @FindBy(xpath = "//a[text()='Login']")
    WebElement lnkLogin;



    public void clickMyAccount(){
        lnkMyAccount.click();
    }

    public void clickRegister(){
        lnkRegister.click();
    }

    public void clickLogin(){
        lnkLogin.click();
    }
}
