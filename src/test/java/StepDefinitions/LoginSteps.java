package StepDefinitions;

import Hooks.DriverInstance;
import Hooks.MyHooks;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;


public class LoginSteps {


    HomePage hp = new HomePage(MyHooks.driver);
    LoginPage lp = new LoginPage(MyHooks.driver);



    @Given("User clicks on login button")
    public void userClicksOnLoginButton() {
        hp.clickMyAccount();
        hp.clickLogin();

    }

    @Given("User enters username as {string}")
    public void userEntersUsernameAs(String Username) {
        lp.enterEmail(Username);
    }

    @Given("User enters password as {string}")
    public void userEntersPasswordAs(String Password) {
      lp.enterPassword(Password);
    }

    @When("User clicks on login option")
    public void userClicksOnLoginOption() {
        lp.clickLogin();
    }

    @Then("Login should be successful")
    public void loginShouldBeSuccessful() {
        String text=lp.verifyLogin();
        System.out.println("Logged in with : "+text);
    }
    
    @But("Login should not be successful")
    public void loginShouldNotBeSuccessful() {
        System.out.println("Login Failed ... ");

    }
}
