package br.ce.steps;

import br.ce.pages.ProdutoPage;
import br.ce.pages.SeguroPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ProdutoStep {
    ProdutoPage produtoPage;
    SeguroPage seguroPage;
    @E("realizo o cadastro do seguro")
    public void realizeiOCadastroDoSeguro() {
        seguroPage = new SeguroPage();
        seguroPage.cadastroSeguro();
    }

    @Quando("seleciono data de início")
    public void selecionoDataDeInício() {
        produtoPage = new ProdutoPage();
        produtoPage.setData();
    }

    @E("seleciono a soma do seguro")
    public void selecionoASomaDoSeguro() {
        produtoPage = new ProdutoPage();
        produtoPage.setSoma();
    }

    @E("seleciono a Avalição")
    public void selecionoAAvalição() {
        produtoPage = new ProdutoPage();
        produtoPage.setAvaliacao();
    }

    @E("seleciono o seguro")
    public void selecionoOSeguro() {
        produtoPage = new ProdutoPage();
        produtoPage.setSeguro();
    }

    @E("seleciono o tipo do produto")
    public void selecionoOTipoDoProduto() {
        produtoPage = new ProdutoPage();
        produtoPage.setOpcoesProduct();
    }

    @E("seleciono o carro")
    public void selecionoOCarro() {
        produtoPage = new ProdutoPage();
        produtoPage.setCarroCorte();
    }

    @Então("vou para opção de preço")
    public void vouParaOpçãoDePreço() {
        produtoPage = new ProdutoPage();
        produtoPage.buttonNext();
    }

}
