package br.ce.steps;

import br.ce.pages.CotacaoPage;
import br.ce.pages.PlanoPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import org.json.simple.JSONObject;

public class CotacaoStep {

    PlanoPage planoPage;
    private JSONObject cotacaoData;

    CotacaoPage cotacaoPage;
    @E("selciono o plano")
    public void selcionoOPlano() {
        planoPage = new PlanoPage();
        planoPage.selecaoPlano();
    }

    @E("informo o email")
    public void informoOEmail() {
        cotacaoPage = new CotacaoPage();
        cotacaoData = null;
        cotacaoData = cotacaoPage.getJsonDataObject("data", "cotacao");
        cotacaoPage.setEmail((String)cotacaoData.get("email"));
    }

    @E("informo o telefone")
    public void informoOTelefone() {
        cotacaoPage = new CotacaoPage();
        cotacaoData = null;
        cotacaoData = cotacaoPage.getJsonDataObject("data", "cotacao");
        cotacaoPage.setTelefone((String)cotacaoData.get("telefone"));
    }

    @E("informo o nome do usuário")
    public void informoONomeDoUsuário() {
        cotacaoPage = new CotacaoPage();
        cotacaoData = null;
        cotacaoData = cotacaoPage.getJsonDataObject("data", "cotacao");
        cotacaoPage.setNomeUser((String)cotacaoData.get("nomeUser"));
    }

    @E("informo a senha")
    public void informoASenha() {
        cotacaoPage = new CotacaoPage();
        cotacaoData = null;
        cotacaoData = cotacaoPage.getJsonDataObject("data", "cotacao");
        cotacaoPage.setSenha((String)cotacaoData.get("senha"));
    }

    @E("confirmo a senha")
    public void confirmoASenha() {
        cotacaoPage = new CotacaoPage();
        cotacaoData = null;
        cotacaoData = cotacaoPage.getJsonDataObject("data", "cotacao");
        cotacaoPage.setConfirmSenha((String)cotacaoData.get("confSenha"));
    }

    @E("informo o comentario")
    public void informoOComentario() {
        cotacaoPage = new CotacaoPage();
        cotacaoData = null;
        cotacaoData = cotacaoPage.getJsonDataObject("data", "cotacao");
        cotacaoPage.setCometarios((String)cotacaoData.get("comentario"));
    }

    @E("clico em enviar")
    public void clicoEmEnviar() {
        cotacaoPage = new CotacaoPage();
        cotacaoPage.buttonNext();

    }

    @E("recebo a mensagem de validação")
    public void receboAMensagemDeValidação() {
        cotacaoPage = new CotacaoPage();
        cotacaoPage.setMensagem();
    }

    @Então("clico em ok")
    public void clicoEmOk() {
        cotacaoPage = new CotacaoPage();
        cotacaoPage.setButtonOk();
    }
}
