package StepDefinitions;

import Hooks.MyHooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;

public class RegistrationSteps {

    HomePage hp=new HomePage(MyHooks.driver);
    RegistrationPage rp=new RegistrationPage(MyHooks.driver);

    @Given("User clicks on Register button")
    public void userClicksOnRegisterButton() {
        hp.clickMyAccount();
        hp.clickRegister();
    }

    @Given("Enter firstName as {string}")
    public void enterFirstNameAs(String firstName) {
       rp.setFirstName(firstName);
    }

    @Given("Enter lastName as {string}")
    public void enterLastNameAs(String lastName) {
        rp.setLastName(lastName);

    }

    @Given("Enter email as {string}")
    public void enterEmailAs(String email) {
       rp.setEmail(email);
    }

    @Given("Enter telephone as {string}")
    public void enterTelephoneAs(String telephone) {
        rp.setTelephone(telephone);
    }

    @Given("Enter password as {string}")
    public void enterPasswordAs(String password) {
        rp.setPassword(password);

    }

    @Given("Re_Enter password as {string}")
    public void re_enterPasswordAs(String password2) {
       rp.setPasswordConfirm(password2);
    }

    @Given("Check on Privacy policy")
    public void checkOnPrivacyPolicy() {
       rp.setCheckPolicy();
    }

    @Given("Click on continue button")
    public void clickOnContinueButton() {
       rp.clcikContinue();
    }

    @Then("Registration done successfully")
    public void registrationDoneSuccessfully() {
        String text= rp.getConfirmMessage();
        System.out.println("Registration successful " +text);
    }


}
