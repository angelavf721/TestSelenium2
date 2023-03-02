#language: pt

  Funcionalidade: Selecionar plano
    Como usuário
    Eu quero escolher meu plano
    Para possuir um plano ideal para mim

  Contexto: Seleção do plano
    Dado que estou na aplicação
    E realizo o cadastro do veiculo
    E realizo o cadastro do seguro
    E realizo o cadastro do produto

    Cenario: selecionar plano
      Quando seleciono o plano
      Então vou para cotação