package br.ce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static br.ce.steps.Hooks.getDriver;

public class CotacaoPage extends Utils{

    public CotacaoPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(how = How.ID, using = "email")
    private WebElement email;
    @FindBy(how = How.ID, using = "phone")
    private WebElement telefone;
    @FindBy(how = How.ID, using = "username")
    private WebElement nomeUser;
    @FindBy(how = How.ID, using = "password")
    private WebElement senha;
    @FindBy(how = How.ID, using = "confirmpassword")
    private WebElement confirmSenha;
    @FindBy(how = How.ID, using = "Comments")
    private WebElement cometarios;
    @FindBy(how = How.ID, using = "sendemail")
    private WebElement enviar;

    @FindBy(how = How.XPATH, using = "//div[@class='sweet-alert showSweetAlert visible']/h2[contains(text(),'Sending e-mail success!')]")
    private WebElement mensagem;
    @FindBy(how = How.XPATH, using = "//*/button[@class='confirm']")
    private WebElement buttonOk;

    public void setEmail(String text){
        escrever(email,text);
    }
    public void setTelefone(String text){
        escrever(telefone,text);
    }
    public void setNomeUser(String text){
        escrever(nomeUser,text);
    }
    public void setSenha(String text){
        escrever(senha,text);
    }
    public void setConfirmSenha(String text){
        escrever(confirmSenha,text);
    }
    public void setCometarios(String text){
        escrever(cometarios,text);
    }
    public void buttonNext(){
        clicar(enviar);
    }
    public void setMensagem(){
        getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        ValidarText("Sending e-mail success!",mensagem);
    }
    public void setButtonOk(){
        clicar(buttonOk);
    }
}
