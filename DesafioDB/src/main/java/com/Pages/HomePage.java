package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.PageElements.HomePageElements;
import com.Setup.Setup;

public class HomePage extends HomePageElements {

	public HomePage() {
		driver = Setup.getDriver();
		PageFactory.initElements(Setup.getDriver(), this);
	}

	public void goToPage() {
		String url = "http://www.automationpractice.com/";
		driver.navigate().to(url);
	}
	
	public void clicarProduto() {
		PRODUTO_PRINTED_DRESS.click();
	}
}
