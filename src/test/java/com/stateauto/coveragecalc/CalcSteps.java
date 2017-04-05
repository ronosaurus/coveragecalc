package com.stateauto.coveragecalc;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;

import javax.swing.*;

import static junit.framework.TestCase.assertTrue;

public class CalcSteps {

    //region start web service and initialize webDriver, can't be embedded in base class ???
    static {
        EmbeddedWebApplicationContext wac = (EmbeddedWebApplicationContext) SpringApplication.run(CoveragecalcApplication.class);
        int webServerPort = wac.getEmbeddedServletContainer().getPort();
    }

    protected WebDriver driver;

    @Before
    public void beforeScenario() {
        driver = new ChromeDriver();
    }

    @After
    public void afterScenario() {
        if (driver != null) {
            driver.quit();
        }
    }
    //endregion

    @Given("^the user selects a coverage of (.+)$")
    public void the_user_selects_a_coverage_of(String arg0) throws Throwable {
        System.out.println(arg0);
        assertTrue(true);
    }

    @And("^the user also selects a (.+)$")
    public void theUserSelectsACoverageLimit(String arg0) throws Throwable {
        System.out.println(arg0);
        assertTrue(true);
    }

    @And("^the user asks for the coverage amount to be calculated$")
    public void theUserAsksForTheCoverageAmountToBeCalculated() throws Throwable {
        driver.get("http://localhost:8614/helloWorld");
        assertTrue(driver.getPageSource().contains("Hello World"));

        assertTrue(true);
    }

    @Then("^the coverage amount is (\\d+)$")
    public void the_coverage_amount_is(int arg0) throws Throwable {
        System.out.println(arg0);
        assertTrue(true);
    }
}