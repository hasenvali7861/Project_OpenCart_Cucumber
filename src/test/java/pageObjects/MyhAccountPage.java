package pageObjects;

import Hooks.DriverInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class MyhAccountPage extends DriverInstance {

    public MyhAccountPage(RemoteWebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement msgHeadding;

    @FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
    WebElement btnLogout;



    public void clickLogout(){
        btnLogout.click();
    }

    public boolean isMyAccountExists(){
        try {
            return (msgHeadding.isDisplayed());
        }
        catch (Exception e){
            return false;
        }

    }

}
