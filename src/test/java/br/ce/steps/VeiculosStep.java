package br.ce.steps;

import br.ce.pages.VeiculosPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;


import static br.ce.steps.Hooks.*;

public class VeiculosStep {
    private JSONObject veiculosJsonData;
    VeiculosPage veiculosPage;

    public WebDriver driver;


    @Dado("que estou na aplicação")
    public void que_estou_na_aplicação() {
        abrirUrl("http://sampleapp.tricentis.com/101/app.php");
        driver = getDriver();
    }

    @Quando("seleciono a marca do veiculo")
    public void selecionoAMarcaDoVeiculo() {
        veiculosPage = new VeiculosPage();
        veiculosPage.Honda();
    }

    @E("seleciono o modelo")
    public void selecionoOModelo() {
        veiculosPage = new VeiculosPage();
        veiculosPage.modelo();
    }

    @E("informo a capacidade do cilindro")
    public void informoACapacidadeDoCilindro() {
        veiculosPage = new VeiculosPage();
        veiculosJsonData = null;
        veiculosJsonData = veiculosPage.getJsonDataObject("data", "veiculos");
        veiculosPage.cilindro((String)veiculosJsonData.get("capCilindro"));
    }

    @E("informo o desempenho do motor")
    public void informoODesempenhoDoMotor() {
        veiculosPage = new VeiculosPage();
        veiculosJsonData = null;
        veiculosJsonData = veiculosPage.getJsonDataObject("data", "veiculos");
        veiculosPage.despenhoMotor((String)veiculosJsonData.get("desMotor"));
    }

    @E("seleciono a data da fabricação")
    public void selecionoADataDaFabricação() {
        veiculosPage = new VeiculosPage();
        veiculosPage.setData();
        veiculosPage.validaMesData();
        veiculosPage.validaAnoData();
        veiculosPage.setDataDia();
    }
    @E("seleciono o numero de assentos")
    public void selecionoONumeroDeAssentos() {
        veiculosPage = new VeiculosPage();
        veiculosPage.setNumeroAss();
    }

    @E("seleciono a direção do volante")
    public void selecionoADireçãoDoVolante() {
        veiculosPage = new VeiculosPage();
        veiculosPage.setVolante();
    }
    @E("escolho o numero de assentos")
    public void escolhoONumeroDeAssentos() {
        veiculosPage = new VeiculosPage();
        veiculosPage.setNumberofseat();
    }

    @E("seleciono o tipo de combustível")
    public void selecionoOTipoDeCombustível() {
        veiculosPage = new VeiculosPage();
        veiculosPage.setCombustivel();
    }

    @E("informo a carga útil")
    public void informoACargaÚtil() {
        veiculosPage = new VeiculosPage();
        veiculosJsonData = null;
        veiculosJsonData = veiculosPage.getJsonDataObject("data", "veiculos");
        veiculosPage.setCarga((String)veiculosJsonData.get("carga"));
    }

    @E("informo o peso total")
    public void informoOPesoTotal() {
        veiculosPage = new VeiculosPage();
        veiculosJsonData = null;
        veiculosJsonData = veiculosPage.getJsonDataObject("data", "veiculos");
        veiculosPage.setPeso((String)veiculosJsonData.get("peso"));
    }

    @E("informo o preço de tabela")
    public void informoOPreçoDeTabela() {
        veiculosPage = new VeiculosPage();
        veiculosJsonData = null;
        veiculosJsonData = veiculosPage.getJsonDataObject("data", "veiculos");
        veiculosPage.setPreco((String)veiculosJsonData.get("precoTabela"));
    }

    @E("informo o número da placa")
    public void informoONúmeroDaPlaca() {
        veiculosPage = new VeiculosPage();
        veiculosJsonData = null;
        veiculosJsonData = veiculosPage.getJsonDataObject("data", "veiculos");
        veiculosPage.setPlaca((String)veiculosJsonData.get("placa"));
    }

    @E("informo a quilometragem anual")
    public void informoAQuilometragemAnual() {
        veiculosPage = new VeiculosPage();
        veiculosJsonData = null;
        veiculosJsonData = veiculosPage.getJsonDataObject("data", "veiculos");
        veiculosPage.setQuilometragem((String)veiculosJsonData.get("quilometragem"));
    }

    @Entao("clico em next")
    public void clicoEmNext() {
        veiculosPage = new VeiculosPage();
        veiculosPage.buttonNext();
    }

}
