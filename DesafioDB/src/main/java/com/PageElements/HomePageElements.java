package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import Utils.SeleniumUtils;

public class HomePageElements extends SeleniumUtils {

	public static WebDriver driver;

	//@FindBy(how = How.XPATH, using = "//a[contains(@title,'Printed Dress')]")
	@FindBy(how = How.XPATH, using = "//*[@id=\"homefeatured\"]/li[4]/div/div[2]/h5/a")
	public WebElement PRODUTO_PRINTED_DRESS;
}