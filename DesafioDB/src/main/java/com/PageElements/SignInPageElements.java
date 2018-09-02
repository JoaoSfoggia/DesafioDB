package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import Utils.SeleniumUtils;

public class SignInPageElements extends SeleniumUtils {

	public static WebDriver driver;
	
	@FindBy(how = How.ID, using = "customer_firstname")
	public WebElement TEXTBOX_FIRST_NAME;

	@FindBy(how = How.ID, using = "customer_lastname")
	public WebElement TEXTBOX_LAST_NAME;

	@FindBy(how = How.ID, using = "passwd")
	public WebElement TEXTBOX_PASSWORD;

	@FindBy(how = How.ID, using = "address1")
	public WebElement TEXTBOX_ADDRESS;

	@FindBy(how = How.ID, using = "city")
	public WebElement TEXTBOX_CITY;

	@FindBy(how = How.ID, using = "id_state")
	public WebElement COMBOBOX_STATE;

	@FindBy(how = How.ID, using = "postcode")
	public WebElement TEXTBOX_ZIP_CODE;

	@FindBy(how = How.ID, using = "id_country")
	public WebElement COMBOBOX_COUNTRY;

	@FindBy(how = How.ID, using = "phone_mobile")
	public WebElement TEXTBOX_PHONE;

	@FindBy(how = How.ID, using = "submitAccount")
	public WebElement BOTAO_REGISTER;

	@FindBy(how = How.NAME, using = "processAddress")
	public WebElement BOTAO_CHECKOUT;
}
