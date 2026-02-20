package Hooks;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class DriverInstance {

    //BasePage class contains only constructor which is used to invoke the Driver

    public DriverInstance(RemoteWebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
