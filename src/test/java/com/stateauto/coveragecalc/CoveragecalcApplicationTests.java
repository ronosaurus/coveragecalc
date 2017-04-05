package com.stateauto.coveragecalc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CoveragecalcApplicationTests {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		// https://github.com/mozilla/geckodriver/issues/552
		// System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		// driver = new FirefoxDriver();
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		if (driver != null) {
			driver.quit();
		}
	}

	@Test
	public void selenium_calling_embedded_server() throws Exception {
		driver.get("http://localhost:8614/helloWorld");
		assertTrue(driver.getPageSource().contains("Hello World"));
	}
}
