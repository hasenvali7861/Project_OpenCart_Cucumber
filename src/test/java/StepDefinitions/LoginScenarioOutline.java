package StepDefinitions;

import Hooks.MyHooks;
import cucumber.api.java.en.Given;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyhAccountPage;

public class LoginScenarioOutline {

    HomePage hp = new HomePage(MyHooks.driver);
    LoginPage lp = new LoginPage(MyHooks.driver);



    @Given("User logins to application with {string} and  {string}")
    public void userLoginsToApplicationWithAnd(String username, String password) {
        hp.clickMyAccount();
        hp.clickLogin();

        lp.enterEmail(username);
        lp.enterPassword(password);
        lp.clickLogin();


    }



}
