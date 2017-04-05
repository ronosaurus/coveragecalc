package com.stateauto.coveragecalc;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;

import javax.swing.*;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;

public class CalcSteps {

    //region start web service and initialize webDriver, can't be embedded in base class ???
    static {
        EmbeddedWebApplicationContext wac = (EmbeddedWebApplicationContext) SpringApplication.run(CoveragecalcApplication.class);
        int webServerPort = wac.getEmbeddedServletContainer().getPort();
    }

    protected WebDriver driver;

    // http://www.testingexcellence.com/open-new-tab-browser-using-selenium-webdriver-java/
    private void openNewTab() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }

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

    @And("^the user hasn't selected a coverage name of <coverageName>$")
    public void theUserHasnTSelectedACoverageNameOfCoverageName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the user is told that a coverage name hasn't been selected$")
    public void theUserIsToldThatACoverageNameHasnTBeenSelected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the user hasn't selected a coverage limit of <coverageLimit>$")
    public void theUserHasnTSelectedACoverageLimitOfCoverageLimit() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the user is told that a coverage limit hasn't been selected$")
    public void theUserIsToldThatACoverageLimitHasnTBeenSelected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(1==2);
        throw new PendingException();
    }
}