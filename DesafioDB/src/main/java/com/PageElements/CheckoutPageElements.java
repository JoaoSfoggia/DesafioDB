package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import Utils.SeleniumUtils;

public class CheckoutPageElements extends SeleniumUtils {

	public static WebDriver driver;

	@FindBy(how = How.XPATH, using = "//td[@class='cart_description']//a[contains(text(),'Printed Dress')]")
	public WebElement PRINTED_DRESS_NO_CARRINHO;

	@FindBy(how = How.XPATH, using = "//p[@class='cart_navigation clearfix']//a[contains(@title,'Proceed to checkout')]")
	public WebElement BOTAO_PROCEED_TO_CHECKOUT;

	@FindBy(how = How.ID, using = "email_create")
	public WebElement TEXTBOX_EMAIL;

	@FindBy(how = How.ID, using = "SubmitCreate")
	public WebElement BOTAO_CREATE_AN_ACCOUNT;

	@FindBy(how = How.XPATH, using = "//a[@title='Pay by bank wire']")
	public WebElement BOTAO_METODO_PAGAMENTO;

	@FindBy(how = How.XPATH, using = "//*[@id='cart_navigation']/button")
	public WebElement BOTAO_CONFIRMAR_ORDER;

	@FindBy(how = How.XPATH, using = "//td[@class='cart_total']/span")
	public WebElement LABEL_PRECO_TOTAL;

	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/p/strong")
	public WebElement LABEL_ORDER_CONFIRMATION;
}
