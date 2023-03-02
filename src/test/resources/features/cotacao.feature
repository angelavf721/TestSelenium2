#language: pt

  Funcionalidade: Informações da Cotação
    Como usuário
    Eu quero fazer meu cadastro da cotação
    Para finalizar o processo de criação do seguro

  Contexto: Cadastro da cotação
    Dado que estou na aplicação
    E realizo o cadastro do veiculo
    E realizo o cadastro do seguro
    E realizo o cadastro do produto
    E selciono o plano

    Cenario: Dados da Cotação
      E informo o email
      E informo o telefone
      E informo o nome do usuário
      E informo a senha
      E confirmo a senha
      E informo o comentario
      E clico em enviar
      E recebo a mensagem de validação
      Então clico em ok