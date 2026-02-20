package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
//        features = "src/test/resources/Features/",
        features = "src/test/resources/Features/registrationScenarioOutline.feature",
        dryRun = !true,
        snippets = SnippetType.CAMELCASE,
        monochrome = true,//to remove junk characters from the console
        glue = {"StepDefinitions","Hooks"},
        plugin =  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//        plugin = {"pretty","html:CucumberReports",
//                    "json:reports/result.json",
//                    "junit:reports/result.xml"},
        //tags = {"@smoke,@reg"}

)
public class Runner extends AbstractTestNGCucumberTests {


}
