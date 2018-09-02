$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/Compras.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Compras",
  "description": "",
  "id": "compras",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 2956897675,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 5,
  "name": "que estou na pagina inicial da My Store",
  "keyword": "Dado "
});
formatter.match({
  "location": "ComprasSteps.acessarHomePage()"
});
formatter.result({
  "duration": 6443858947,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Realizar uma compra com sucesso com inclusao de usuario",
  "description": "",
  "id": "compras;realizar-uma-compra-com-sucesso-com-inclusao-de-usuario",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@efetuarLogin"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "clico em um produto",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "clico em Add to cart",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "clico em Proceed to checkout",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "sistema deve apresentar a tela de checkout com o produto correto",
  "keyword": "Então "
});
formatter.step({
  "line": 13,
  "name": "no carrinho, clico em Proceed to checkout",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "preencho o campo Email address com \"teste11@email.com\"",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "clico em Create an account",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "preencho o campo First name com \"João\"",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "preencho o campo Last name com \"Guilherme\"",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "preencho o campo Password com \"swordfish\"",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "preencho o campo Address com \"Rua Teste\"",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "preencho o campo City com \"Cidade\"",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "preencho o campo State com \"Alabama\"",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "preencho o campo Zip Code com \"91754\"",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "preencho o campo Mobile phone com \"51999018421\"",
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "clico em Register",
  "keyword": "E "
});
formatter.step({
  "line": 25,
  "name": "sistema deve apresentar a tela de confirmacao de endereco com o endereco correto",
  "keyword": "Então "
});
formatter.step({
  "line": 26,
  "name": "na confirmacao de endereco, clico em Proceed to checkout",
  "keyword": "Quando "
});
formatter.step({
  "line": 27,
  "name": "aceito os termos de servico",
  "keyword": "E "
});
formatter.step({
  "line": 28,
  "name": "na tela de shipping, clico em Proceed to checkout",
  "keyword": "E "
});
formatter.step({
  "line": 29,
  "name": "sistema deve apresentar a tela de confirmacao de preco com o preco correto",
  "keyword": "Então "
});
formatter.step({
  "line": 30,
  "name": "seleciono um metodo de pagamento",
  "keyword": "Quando "
});
formatter.step({
  "line": 31,
  "name": "clico em I confirm my order",
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "o sistema deve apresentar a mensagem \"Your order on My Store is complete.\"",
  "keyword": "Então "
});
formatter.match({
  "location": "ComprasSteps.clicarProduto()"
});
formatter.result({
  "duration": 1766411753,
  "status": "passed"
});
formatter.match({
  "location": "ComprasSteps.clicarAddToCart()"
});
formatter.result({
  "duration": 149640164,
  "status": "passed"
});
formatter.match({
  "location": "ComprasSteps.clicarCheckoutProduto()"
});
formatter.result({
  "duration": 1878955795,
  "status": "passed"
});
formatter.match({
  "location": "ComprasSteps.exibirPaginaCheckout()"
});
formatter.result({
  "duration": 94479022,
  "status": "passed"
});
formatter.match({
  "location": "ComprasSteps.clicarCheckoutCarrinho()"
});
formatter.result({
  "duration": 1847475877,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "teste11@email.com",
      "offset": 36
    }
  ],
  "location": "ComprasSteps.preencherEmail(String)"
});
formatter.result({
  "duration": 140554998,
  "status": "passed"
});
formatter.match({
  "location": "ComprasSteps.clicarCreateAnAccount()"
});
formatter.result({
  "duration": 142384079,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "João",
      "offset": 33
    }
  ],
  "location": "ComprasSteps.preencherFirstName(String)"
});
formatter.result({
  "duration": 15368721597,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: Proxy element for: DefaultElementLocator \u0027By.id: customer_firstname\u0027 (tried for 15 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat Utils.SeleniumUtils.esperaElemento(SeleniumUtils.java:19)\r\n\tat com.Pages.SignInPage.preencheFirstName(SignInPage.java:18)\r\n\tat com.Steps.ComprasSteps.preencherFirstName(ComprasSteps.java:73)\r\n\tat ✽.E preencho o campo First name com \"João\"(src/main/java/Features/Compras.feature:16)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"customer_firstname\"}\n  (Session info: chrome\u003d68.0.3440.106)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.13.0\u0027, revision: \u00272f0d292\u0027, time: \u00272018-06-25T15:24:21.231Z\u0027\nSystem info: host: \u0027CERBERUS\u0027, ip: \u0027192.168.15.2\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\JOOGUI~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 68.0.3440.106, webStorageEnabled: true}\nSession ID: eae41772e4d0e6f9a16b12a036fe2859\n*** Element info: {Using\u003did, value\u003dcustomer_firstname}\r\n\tat sun.reflect.GeneratedConstructorAccessor15.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.isDisplayed(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:315)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$100(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:301)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:298)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$23.apply(ExpectedConditions.java:686)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$23.apply(ExpectedConditions.java:682)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat Utils.SeleniumUtils.esperaElemento(SeleniumUtils.java:19)\r\n\tat com.Pages.SignInPage.preencheFirstName(SignInPage.java:18)\r\n\tat com.Steps.ComprasSteps.preencherFirstName(ComprasSteps.java:73)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Guilherme",
      "offset": 32
    }
  ],
  "location": "ComprasSteps.preencherLastName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "swordfish",
      "offset": 31
    }
  ],
  "location": "ComprasSteps.preencherPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Rua Teste",
      "offset": 30
    }
  ],
  "location": "ComprasSteps.preencherAddress(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Cidade",
      "offset": 27
    }
  ],
  "location": "ComprasSteps.preencherCity(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Alabama",
      "offset": 28
    }
  ],
  "location": "ComprasSteps.preencherState(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "91754",
      "offset": 31
    }
  ],
  "location": "ComprasSteps.preencherZipCode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "51999018421",
      "offset": 35
    }
  ],
  "location": "ComprasSteps.preencherPhone(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ComprasSteps.clicarRegister()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ComprasSteps.sistema_deve_apresentar_a_tela_de_confirmacao_de_endereco_com_o_endereco_correto()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ComprasSteps.clicarCheckoutEndereco()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ComprasSteps.aceitarTermos()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ComprasSteps.clicarCheckoutShipping()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ComprasSteps.validarPreco()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ComprasSteps.selecionarMetodoPagamento()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ComprasSteps.confirmarOrder()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Your order on My Store is complete.",
      "offset": 38
    }
  ],
  "location": "ComprasSteps.confirmarMensagem(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 623942891,
  "status": "passed"
});
});