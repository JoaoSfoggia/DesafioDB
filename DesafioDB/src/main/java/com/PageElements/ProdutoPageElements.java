package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import Utils.SeleniumUtils;

public class ProdutoPageElements extends SeleniumUtils {

	public static WebDriver driver;

	@FindBy(how = How.NAME, using = "Submit")
	public WebElement BOTAO_ADD_TO_CART;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@title,'Proceed to checkout')]")
	public WebElement BOTAO_PROCEED_TO_CHECKOUT;
}
