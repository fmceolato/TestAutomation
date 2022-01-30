# language: pt
@cadastro
Funcionalidade: Cadastro de usuário
  Eu como usario quero fazer meu cadastro


  @cadastro_sucesso
  Cenário: Registrar novo usuario com sucesso
    Dado que estou na tela de cadastro
    Quando preencho o formulario de cadastro
    E clico em submit
    Então vejo cadastro realizado com sucesso