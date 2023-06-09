$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Automation.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "acessar site automationpractece",
  "description": "",
  "id": "acessar-site-automationpractece",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 5,
  "name": "criar novo usuario",
  "description": "",
  "id": "acessar-site-automationpractece;criar-novo-usuario",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 6,
  "name": "que eu esteja na tela inicial do practice",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "clico em sign",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "preencho email valido",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "clico em create an accont",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "preencho os dados solicitados",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "clico em save",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "vejo nome cadastrado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginStep.que_eu_esteja_na_tela_inicial_do_practice()"
});
formatter.result({
  "duration": 14968978800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.clico_em_sign()"
});
formatter.result({
  "duration": 2065483500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.preencho_email_valido()"
});
formatter.result({
  "duration": 372582700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.clico_em_create_an_accont()"
});
formatter.result({
  "duration": 247355800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStep.preencho_os_dados_solicitados()"
});
formatter.result({
  "duration": 10546789200,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStep.clico_em_save()"
});
formatter.result({
  "duration": 1291892500,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStep.vejo_nome_cadastrado_com_sucesso()"
});
formatter.result({
  "duration": 218707900,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "",
  "description": "",
  "id": "acessar-site-automationpractece;",
  "type": "scenario",
  "keyword": "Cenario"
});
});