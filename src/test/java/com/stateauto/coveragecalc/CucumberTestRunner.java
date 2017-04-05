package com.stateauto.coveragecalc;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/report"}, features = "src/test/resources")
public class CucumberTestRunner {

}
