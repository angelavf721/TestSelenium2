package br.ce.steps;

import br.ce.pages.PlanoPage;
import br.ce.pages.ProdutoPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class PlanoStep {

    ProdutoPage produtoPage;
    PlanoPage planoPage;
    @E("realizo o cadastro do produto")
    public void realizoOCadastroDoProduto() {
        produtoPage = new ProdutoPage();
        produtoPage.cadatroProduto();
    }

    @Quando("seleciono o plano")
    public void selecionoOPlano() {
        planoPage = new PlanoPage();
        planoPage.setPlano();

    }

    @Então("vou para cotação")
    public void vouParaCotação() {
        planoPage = new PlanoPage();
        planoPage.buttonNext();
    }
}
