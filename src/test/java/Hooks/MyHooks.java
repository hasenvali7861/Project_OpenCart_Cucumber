package Hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;

import cucumber.api.java.Before;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;

import java.time.Duration;

public class MyHooks {

    public static RemoteWebDriver driver;


    @Before
    public void beforeScenario(Scenario scenario){

        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();

        System.out.println("Name : "+scenario.getName());
        System.out.println("ID : "+scenario.getId());
        System.out.println("URI (Path of feature file ) : "+scenario.getUri());
        System.out.println("Lines : "+scenario.getLines());
        System.out.println("Tags : "+scenario.getSourceTagNames());
        System.out.println("Status : "+scenario.getStatus());
    }
    @After
    public void afterScenario(Scenario scenario){
        boolean failed=scenario.isFailed();
        if (failed){
            byte[] screenshot=driver.getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }

        driver.quit();
    }

}
