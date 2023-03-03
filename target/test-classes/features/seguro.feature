#language: pt

  Funcionalidade: Cadastro do usuário
    Como usuário
    Eu quero fazer o seguro
    Para manter meu veiculo seguro

  Contexto: Cadastro do Seguro
    Dado que estou na aplicação
    E realizo o cadastro do veiculo


    Cenario: Dados do usuário para o seguro
      Quando informo o nome
      E informo o sobrenome
      E informo a data de nascimento
      E seleciono o gênero
      E informo o endereço
      E seleciono o país
      E informo o CEP
      E informo a cidade
      E seleciono a ocupação
      E seleciono os hobbies
      E informo a URL
      E insiro a foto
      Então vou para proxima pagina
