package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.PageElements.SignInPageElements;
import com.Setup.Setup;

public class SignInPage extends SignInPageElements {

	public SignInPage() {
		driver = Setup.getDriver();
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
	public void preencheFirstName(String nome) {
		esperaElemento(TEXTBOX_FIRST_NAME);
		TEXTBOX_FIRST_NAME.sendKeys(nome);
	}
	
	public void preencheLastName(String nome) {
		TEXTBOX_LAST_NAME.sendKeys(nome);
	}
	
	public void preenchePassword(String password) {
		TEXTBOX_PASSWORD.sendKeys(password);
	}
	
	public void preencheAddress(String address) {
		TEXTBOX_ADDRESS.sendKeys(address);
	}
	
	public void preencheCity(String city) {
		TEXTBOX_CITY.sendKeys(city);
	}
	
	public void preencheState(String state) {
		Select dropdown = new Select(COMBOBOX_STATE);
		dropdown.selectByVisibleText(state);
	}
	
	public void preencheZipCode(String zip) {
		TEXTBOX_ZIP_CODE.sendKeys(zip);
	}
	
	public void preenchePhone(String phone) {
		TEXTBOX_PHONE.sendKeys(phone);
	}
	
	public void register() {
		BOTAO_REGISTER.click();
	}
	
	public void checkout() {
		BOTAO_CHECKOUT.click();
	}
}
