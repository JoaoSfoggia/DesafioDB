package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.PageElements.ShippingPageElements;
import com.Setup.Setup;

public class ShippingPage extends ShippingPageElements {

	public ShippingPage() {
		driver = Setup.getDriver();
		PageFactory.initElements(Setup.getDriver(), this);
	}

	public void aceitarTermos() {
		esperaElemento(BOTAO_CHECKOUT);
		CHECKBOX_TERMS_OF_SERVICE.click();	
	}
	
	public void checkout() {
		BOTAO_CHECKOUT.click();		
	}
	
	public boolean validaEndereco() {
		if(!LABEL_ADDRESS.getText().equals("Rua Teste")) {
			return false;
		}
		else if (!LABEL_CITY_STATE_ZIP.getText().equals("Cidade, Alabama 91754")) {
			return false;
		}
		else
			return true;
	}
}
