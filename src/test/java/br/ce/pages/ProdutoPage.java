package br.ce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static br.ce.steps.Hooks.getDriver;

public class ProdutoPage extends Utils {
    public ProdutoPage() {
        PageFactory.initElements(getDriver(), this);
    }
    @FindBy(how = How.XPATH, using = "//*/input[@id='startdate']")
    private WebElement calendario;



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
        escrever(calendario,dataDiferencaSemanas(5));
    }
    public static String dataDiferencaSemanas(Integer qtdSemanas){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_WEEK_IN_MONTH,qtdSemanas);
        return getDataFormatada(cal.getTime());
    }

    public static String getDataFormatada(Date data){
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        return format.format(data);
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
        setSoma();
        setAvaliacao();
        setSeguro();
        setOpcoesProduct();
        setCarroCorte();
        buttonNext();
    }

}
