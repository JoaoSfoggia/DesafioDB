package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import com.PageElements.CheckoutPageElements;
import com.Setup.Setup;

public class CheckoutPage extends CheckoutPageElements {

	public CheckoutPage() {
		driver = Setup.getDriver();
		PageFactory.initElements(Setup.getDriver(), this);
	}

	public boolean estaNoCarrinho(String produto) {
		esperaElemento(PRINTED_DRESS_NO_CARRINHO);
		if(produto.equals(PRINTED_DRESS_NO_CARRINHO.getText())) {
			return true;
		}
		else 
			return false;
	}
	
	public void checkout() {
		esperaElemento(BOTAO_PROCEED_TO_CHECKOUT);
		BOTAO_PROCEED_TO_CHECKOUT.click();
	}
	
	public void preencheCampoEmail (String email) {
		esperaElemento(TEXTBOX_EMAIL);
		TEXTBOX_EMAIL.sendKeys(email);
	}
	
	public void createAnAccount() {
		esperaElemento(BOTAO_CREATE_AN_ACCOUNT);
		BOTAO_CREATE_AN_ACCOUNT.click();
	}
	
	public void selecionarMetodoPagamento() {
		esperaElemento(BOTAO_METODO_PAGAMENTO);
		BOTAO_METODO_PAGAMENTO.click();
	}
	
	public void confirmarOrder() {
		esperaElemento(BOTAO_CONFIRMAR_ORDER);
		BOTAO_CONFIRMAR_ORDER.click();
	}
	
	public boolean validarPreco(double preco) {
		String str = LABEL_PRECO_TOTAL.getText().replace("$","");
        str = str.trim();
        
		if(preco == Double.parseDouble(str)) {
			return true;
		}
		else
			return false;
	}
	
	public boolean validarMensagemConfirmacao(String mensagem) {
		if(mensagem.equals(LABEL_ORDER_CONFIRMATION.getText())) {
			return true;
		}
		else
			return false;
	}
}
