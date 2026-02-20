package pageObjects;

import Hooks.DriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverInstance {


    public LoginPage(RemoteWebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@name='email']")
    WebElement txtemail;

    @FindBy(xpath = "//input[@name='password']")
    WebElement txtpassword;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement btnLogin;

    @FindBy(xpath ="//h2[text()='My Account']" )
    WebElement verify;



    public void enterEmail(String email){
        txtemail.sendKeys(email);
    }
    public void enterPassword(String password){
        txtpassword.sendKeys(password);
    }
    public void clickLogin(){
        btnLogin.click();
    }
    public String verifyLogin(){
        return verify.getText();
    }

}
