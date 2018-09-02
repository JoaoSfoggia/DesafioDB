#language: pt
Funcionalidade: Compras

	Contexto: 
    Dado que estou na pagina inicial da My Store

  @efetuarLogin
  Cenario: Realizar uma compra com sucesso com inclusao de usuario
    Quando clico em um produto
    E clico em Add to cart
    E clico em Proceed to checkout
    Então sistema deve apresentar a tela de checkout com o produto correto
    Quando no carrinho, clico em Proceed to checkout
    E preencho o campo Email address com "teste@email.com"
    E clico em Create an account
    E preencho o campo First name com "João"
    E preencho o campo Last name com "Guilherme"
    E preencho o campo Password com "swordfish"
    E preencho o campo Address com "Rua Teste"
    E preencho o campo City com "Cidade"
    E preencho o campo State com "Alabama"
    E preencho o campo Zip Code com "91754"
    E preencho o campo Mobile phone com "51999018421"
    E clico em Register
    Então sistema deve apresentar a tela de confirmacao de endereco com o endereco correto
    Quando na confirmacao de endereco, clico em Proceed to checkout
    E aceito os termos de servico
    E na tela de shipping, clico em Proceed to checkout
    Então sistema deve apresentar a tela de confirmacao de preco com o preco correto
    Quando seleciono um metodo de pagamento
    E clico em I confirm my order
    Então o sistema deve apresentar a mensagem "Your order on My Store is complete."
    