package com.Setup;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Setup {

	protected static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	@After
	public void afterCenario() throws IOException, HeadlessException, AWTException {
		driver.quit();
	}

	@Before
	public void beforeCenario() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--allow-running-insecure-content");
		options.addArguments("--incognito");
		options.addArguments("start-maximized");
		options.addArguments("--lang=pt-BR");
		String pathProjeto = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", pathProjeto + "/drivers/chromedriver.exe");
		driver = new ChromeDriver(options);
	}

}