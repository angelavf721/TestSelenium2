package br.ce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static br.ce.steps.Hooks.getDriver;

public class PlanoPage extends Utils{
    public PlanoPage() {
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(how = How.XPATH, using = "//*/input[@id='selectplatinum']/../span")
    private WebElement plano;
    @FindBy(how = How.ID, using = "nextsendquote")
    private WebElement pageCotacao;

    public void setPlano(){
        clicar(plano);
    }
    public void buttonNext(){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clicar(pageCotacao);
    }

    /************************************* Metodo Selecionar Plano ***********************************************/
    public void selecaoPlano(){
        setPlano();
        buttonNext();
    }
}
