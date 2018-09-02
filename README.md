# DesafioDB

Projeto desafio para a empresa DB Server de automação de testes. O projeto utiliza o selenium webdriver com integração do Cucumber e foi realizado utilizando a linguagem Java.

## Caso de teste: realizar uma compra com sucesso.
1. Acessar o site: www.automationpractice.com.
2. Escolha um produto qualquer na loja.
3. Adicione o produto escolhido ao carrinho.
4. Prossiga para o checkout.
5. Valide se o produto foi corretamente adicionado ao carrinho e prossiga caso esteja tudo certo.
6. Realize o cadastro do cliente preenchendo todos os campos obrigatórios dos formulários.
7. Valide se o endereço está correto e prossiga.
8. Aceite os termos de serviço e prossiga.
9. Valide o valor total da compra.
10. Selecione um método de pagamento e prossiga.
11. Confirme a compra e valide se foi finalizada com sucesso.

## instruções de configuração e execução
Para executar o projeto basta importá-lo no Eclipse, ir em File > Import > Maven > Existing Maven Projects e importar o projeto. Realizar o build do Maven (ele deve resolver todas as dependências sozinho) e executar o método main que se encontra em test/Teste.Java.
