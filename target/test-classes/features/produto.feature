#language: pt

  Funcionalidade: Informações do produto
    Como usuário
    Eu quero cadastrar meu produto
    Para manter meu veiculo seguro

  Contexto: Cadastro do produto
    Dado que estou na aplicação
    E realizo o cadastro do veiculo
    E realizo o cadastro do seguro

    Cenario: Dados do produto
      Quando seleciono data de início
      E seleciono a soma do seguro
      E seleciono a Avalição
      E seleciono o seguro
      E seleciono o tipo do produto
      E seleciono o carro
      Então vou para opção de preço