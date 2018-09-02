package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import com.PageElements.ProdutoPageElements;
import com.Setup.Setup;

public class ProdutoPage extends ProdutoPageElements {

	public ProdutoPage() {
		driver = Setup.getDriver();
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
	public void addToCart() {
		esperaElemento(BOTAO_ADD_TO_CART);
		BOTAO_ADD_TO_CART.click();
	}
	
	public void checkout() {
		esperaElemento(BOTAO_PROCEED_TO_CHECKOUT);
		BOTAO_PROCEED_TO_CHECKOUT.click();
	}
}
