$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\Features\\login.feature");
formatter.feature({
  "name": "My Demo Opencart Application Login page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login should be Successful",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User enters username as \"abc123@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEntersUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password as \"test@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEntersPasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login option",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.userClicksOnLoginOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.loginShouldBeSuccessful()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login should not be Successful",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "User enters username as \"incorrect@demo.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEntersUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password as \"incorrectPass\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEntersPasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login should not be successful",
  "keyword": "But "
});
formatter.match({
  "location": "LoginSteps.loginShouldNotBeSuccessful()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});