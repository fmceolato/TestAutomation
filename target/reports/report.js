$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("register_user.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Cadastro de usuário",
  "description": "Eu como usario quero fazer meu cadastro",
  "id": "cadastro-de-usuário",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@cadastro"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Registrar novo usuario com sucesso",
  "description": "",
  "id": "cadastro-de-usuário;registrar-novo-usuario-com-sucesso",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 7,
      "name": "@cadastro_sucesso"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que estou na tela de cadastro",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "preencho o formulario de cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "clico em submit",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "vejo cadastro realizado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "registerSteps.que_estou_na_tela_de_cadastro()"
});
formatter.result({
  "duration": 5174839900,
  "status": "passed"
});
formatter.match({
  "location": "registerSteps.preencho_o_formulario_de_cadastro()"
});
formatter.result({
  "duration": 3132391600,
  "status": "passed"
});
formatter.match({
  "location": "registerSteps.clico_em_submit()"
});
formatter.result({
  "duration": 145197900,
  "status": "passed"
});
formatter.match({
  "location": "registerSteps.vejo_cadastro_realizado_com_sucesso()"
});
formatter.result({
  "duration": 383125600,
  "error_message": "org.junit.ComparisonFailure: O TESTE FALHOU expected:\u003c[Brazil]\u003e but was:\u003c[                                Select Country\n                            ]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat Pages.homePage.checkRegister(homePage.java:126)\r\n\tat Steps.registerSteps.vejo_cadastro_realizado_com_sucesso(registerSteps.java:45)\r\n\tat ✽.Então vejo cadastro realizado com sucesso(register_user.feature:12)\r\n",
  "status": "failed"
});
});