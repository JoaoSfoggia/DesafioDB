package com.Steps;

import com.Pages.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ComprasSteps {
	
	final double precoTotal = 50.99;
	
	@Dado("que estou na pagina inicial da My Store")
	public void acessarHomePage() {
		HomePage homePage = new HomePage();
		homePage.goToPage();
	}
	
	@E("clico em um produto")
	public void clicarProduto() {
		HomePage homePage = new HomePage();
		homePage.clicarProduto();
	}
	
	@E("clico em Add to cart")
	public void clicarAddToCart() {
		ProdutoPage produtoPage = new ProdutoPage();
		produtoPage.addToCart();
	}

	@E("clico em Proceed to checkout")
	public void clicarCheckoutProduto() {
		ProdutoPage produtoPage = new ProdutoPage();
		produtoPage.checkout();
	}
	
	@Entao("sistema deve apresentar a tela de checkout com o produto correto")
	public void exibirPaginaCheckout() {
		CheckoutPage checkoutPage = new CheckoutPage();

		String produto = "Printed Dress";

		assertTrue("O item não está no carrinho", checkoutPage.estaNoCarrinho(produto));
	}

	@E("no carrinho, clico em Proceed to checkout")
	public void clicarCheckoutCarrinho() {
		CheckoutPage checkoutPage = new CheckoutPage();
		checkoutPage.checkout();
	}
	
	@Quando("^preencho o campo Email address com \"([^\"]*)\"$")
	public void preencherEmail(String email) {
		CheckoutPage checkoutPage = new CheckoutPage();
		checkoutPage.preencheCampoEmail(email);
	}

	@Quando("^clico em Create an account$")
	public void clicarCreateAnAccount() {
		CheckoutPage checkoutPage = new CheckoutPage();
		checkoutPage.createAnAccount();
	}

	@Quando("^preencho o campo First name com \"([^\"]*)\"$")
	public void preencherFirstName(String nome) {
		SignInPage signInPage = new SignInPage();
		signInPage.preencheFirstName(nome);
	}

	@Quando("^preencho o campo Last name com \"([^\"]*)\"$")
	public void preencherLastName(String nome) {
		SignInPage signInPage = new SignInPage();
		signInPage.preencheLastName(nome);
	}

	@Quando("^preencho o campo Password com \"([^\"]*)\"$")
	public void preencherPassword(String senha) {
		SignInPage signInPage = new SignInPage();
		signInPage.preenchePassword(senha);
	}

	@Quando("^preencho o campo Address com \"([^\"]*)\"$")
	public void preencherAddress(String endereco) {
		SignInPage signInPage = new SignInPage();
		signInPage.preencheAddress(endereco);
	}

	@Quando("^preencho o campo City com \"([^\"]*)\"$")
	public void preencherCity(String cidade) {
		SignInPage signInPage = new SignInPage();
		signInPage.preencheCity(cidade);
	}

	@Quando("^preencho o campo State com \"([^\"]*)\"$")
	public void preencherState(String estado) {
		SignInPage signInPage = new SignInPage();
		signInPage.preencheState(estado);
	}

	@Quando("^preencho o campo Zip Code com \"([^\"]*)\"$")
	public void preencherZipCode(String code) {
		SignInPage signInPage = new SignInPage();
		signInPage.preencheZipCode(code);
	}

	@Quando("^preencho o campo Mobile phone com \"([^\"]*)\"$")
	public void preencherPhone(String phone) {
		SignInPage signInPage = new SignInPage();
		signInPage.preenchePhone(phone);
	}

	@Quando("^clico em Register$")
	public void clicarRegister() {
		SignInPage signInPage = new SignInPage();
		signInPage.register();
	}

	@Quando("na confirmacao de endereco, clico em Proceed to checkout")
	public void clicarCheckoutEndereco() {
		SignInPage signInPage = new SignInPage();
		signInPage.checkout();
	}

	@Entao("^sistema deve apresentar a tela de confirmacao de endereco com o endereco correto$")
	public void sistema_deve_apresentar_a_tela_de_confirmacao_de_endereco_com_o_endereco_correto() {

	}

	@Quando("^aceito os termos de servico$")
	public void aceitarTermos() {
		ShippingPage shippingPage = new ShippingPage();
		shippingPage.aceitarTermos();
	}

	@Quando("na tela de shipping, clico em Proceed to checkout")
	public void clicarCheckoutShipping() {
		ShippingPage shippingPage = new ShippingPage();
		shippingPage.checkout();
	}

	@Entao("^sistema deve apresentar a tela de confirmacao de preco com o preco correto$")
	public void validarPreco() {
		CheckoutPage checkoutPage = new CheckoutPage();
		
		assertTrue("Produto com valor incorreto.", checkoutPage.validarPreco(precoTotal));
	}

	@Quando("^seleciono um metodo de pagamento$")
	public void selecionarMetodoPagamento() {
		CheckoutPage checkoutPage = new CheckoutPage();
		checkoutPage.selecionarMetodoPagamento();
	}

	@Quando("^clico em I confirm my order$")
	public void confirmarOrder(){
		CheckoutPage checkoutPage = new CheckoutPage();
		checkoutPage.confirmarOrder();
	}

	@Entao("^o sistema deve apresentar a mensagem \"([^\"]*)\"$")
	public void confirmarMensagem(String mensagem) {
		CheckoutPage checkoutPage = new CheckoutPage();
		
		assertTrue("Mensagem de confirmação não apresentada.", checkoutPage.validarMensagemConfirmacao(mensagem));
	}
}
