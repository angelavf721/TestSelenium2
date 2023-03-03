package br.ce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static br.ce.steps.Hooks.getDriver;

public class ProdutoPage extends Utils {
    public ProdutoPage() {
        PageFactory.initElements(getDriver(), this);
    }
    @FindBy(how = How.ID, using = "openstartdatecalender")
    private WebElement calendario;

    @FindBy(how = How.XPATH, using = "//a[@class='ui-datepicker-next ui-corner-all']")
    private WebElement proxData;
    @FindBy(how = How.XPATH, using = "//div[@class='ui-datepicker-title']//span[contains(text(),'April')]")
    private WebElement mes;
    @FindBy(how = How.XPATH, using = "//div[@class='ui-datepicker-title']//span[contains(text(),'2023')]")
    private WebElement ano;
    @FindBy(how = How.XPATH, using = "//a[@class='ui-state-default']/..//a[contains(text(),'20')]")
    private WebElement dia;

    @FindBy(how = How.ID, using = "insurancesum")
    private WebElement soma;
    @FindBy(how = How.ID, using = "meritrating")
    private WebElement avaliacao;
    @FindBy(how = How.ID, using = "damageinsurance")
    private WebElement seguro;
    @FindBy(how = How.XPATH, using = "//label[@class='ideal-radiocheck-label']/input[@id='LegalDefenseInsurance']/../span")
    private WebElement opcoesProduct;

    @FindBy(how = How.ID, using = "courtesycar")
    private WebElement carroCorte;


    @FindBy(how = How.ID, using = "nextselectpriceoption")
    private WebElement nextPage;

    public void setData(){
        clicar(calendario);
        clicar(proxData);
    }
    public void validaMesData(){
        ValidarText("April",mes);
    }
    public void validaAnoData(){
        ValidarText("2023",ano);
    }
    public void setDataDia(){
        clicar(dia);
    }

    public void setSoma(){
        select(soma,"15000000");
    }
    public void setAvaliacao(){
        select(avaliacao,"Bonus 7");
    }

    public void setSeguro(){
        select(seguro,"Partial Coverage");
    }

    public void setOpcoesProduct(){
        clicar(opcoesProduct);
    }

    public void setCarroCorte(){
        select(carroCorte,"Yes");
    }

    public void buttonNext(){
        clicar(nextPage);
    }

    /************************************* Metodo dados do Produto ***********************************************/
    public void cadatroProduto(){
        setData();
        setDataDia();
        setSoma();
        setAvaliacao();
        setSeguro();
        setOpcoesProduct();
        setCarroCorte();
        buttonNext();
    }

}
