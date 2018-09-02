package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import Utils.SeleniumUtils;

public class ShippingPageElements extends SeleniumUtils {

	public static WebDriver driver;

	@FindBy(how = How.ID, using = "cgv")
	public WebElement CHECKBOX_TERMS_OF_SERVICE;

	@FindBy(how = How.NAME, using = "processCarrier")
	public WebElement BOTAO_CHECKOUT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"address_delivery\"]/li[4]")
	public WebElement LABEL_ADDRESS;

	@FindBy(how = How.XPATH, using = "//*[@id=\"address_delivery\"]/li[5]")
	public WebElement LABEL_CITY_STATE_ZIP;
}
