# language: pt

Funcionalidade: acessar site automationpractece

  Cenario: criar novo usuario
    Dado que eu esteja na tela inicial do practice
    Quando clico em sign
    E preencho email valido
    E clico em create an accont
    E preencho os dados solicitados
    E clico em save
    Entao vejo nome cadastrado com sucesso