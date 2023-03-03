package br.ce.steps;

import br.ce.pages.SeguroPage;
import br.ce.pages.VeiculosPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.json.simple.JSONObject;

public class SeguroStep {
    VeiculosPage veiculosPage;
    SeguroPage seguroPage;

    private JSONObject seguroData;
    @E("realizo o cadastro do veiculo")
    public void que_realizei_o_cadastro_do_veiculo() {
        veiculosPage = new VeiculosPage();
        veiculosPage.cadastroVeiculo();
    }

    @Quando("informo o nome")
    public void informoONome() {
        seguroPage = new SeguroPage();
        seguroData = null;
        seguroData = seguroPage.getJsonDataObject("data", "seguro");
        seguroPage.setNome((String)seguroData.get("nome"));
    }

    @E("informo o sobrenome")
    public void informoOSobrenome() {
        seguroPage = new SeguroPage();
        seguroData = null;
        seguroData = seguroPage.getJsonDataObject("data", "seguro");
        seguroPage.setsobreNome((String)seguroData.get("sobrenome"));
    }


    @E("informo a data de nascimento")
    public void informoADataDeNascimento() {
        seguroPage = new SeguroPage();
        seguroData = null;
        seguroData = seguroPage.getJsonDataObject("data", "seguro");
        seguroPage.setDataNasc((String)seguroData.get("data"));
    }

    @E("seleciono o gênero")
    public void selecionoOGênero() {
        seguroPage = new SeguroPage();
        seguroPage.setSexFeminino();
    }

    @E("informo o endereço")
    public void informoOEndereço() {
        seguroPage = new SeguroPage();
        seguroData = null;
        seguroData = seguroPage.getJsonDataObject("data", "seguro");
        seguroPage.setEndereco((String)seguroData.get("endereco"));
    }

    @E("seleciono o país")
    public void selecionoOPaís() {
        seguroPage = new SeguroPage();
        seguroPage.setPais();
    }

    @E("informo o CEP")
    public void informoOCEP() {
        seguroPage = new SeguroPage();
        seguroData = null;
        seguroData = seguroPage.getJsonDataObject("data", "seguro");
        seguroPage.setCep((String)seguroData.get("CEP"));
    }

    @E("informo a cidade")
    public void informoACidade() {
        seguroPage = new SeguroPage();
        seguroData = null;
        seguroData = seguroPage.getJsonDataObject("data", "seguro");
        seguroPage.setCidade((String)seguroData.get("cidade"));
    }

    @E("seleciono a ocupação")
    public void selecionoAOcupação() {
        seguroPage = new SeguroPage();
        seguroPage.setOcupacao();
    }

    @E("seleciono os hobbies")
    public void selecionoOsHobbies() {
        seguroPage = new SeguroPage();
        seguroPage.setHoobe();
    }

    @E("informo a URL")
    public void informoAURL() {
        seguroPage = new SeguroPage();
        seguroData = null;
        seguroData = seguroPage.getJsonDataObject("data", "seguro");
        seguroPage.setUrl((String)seguroData.get("link"));
    }
    @E("insiro a foto")
    public void insiroAFoto() {
        seguroPage = new SeguroPage();
        seguroPage.setFoto();
    }
    @Então("vou para proxima pagina")
    public void vouParaProximaPagina() {
        seguroPage.buttonNext();
    }

}
