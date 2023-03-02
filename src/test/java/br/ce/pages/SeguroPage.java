package br.ce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static br.ce.driverFactory.Hooks.getDriver;

public class SeguroPage extends Utils{

    public SeguroPage() {
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(how = How.ID, using = "firstname")
    private WebElement nome;

    @FindBy(how = How.ID, using = "lastname")
    private WebElement sobreNome;

    @FindBy(how = How.ID, using = "birthdate")
    private WebElement dataNasc;

    @FindBy(how = How.XPATH, using = "//*/input[@id='genderfemale']/../span")
    private WebElement sexFeminino;

    @FindBy(how = How.ID, using = "streetaddress")
    private WebElement endereco;

    @FindBy(how = How.ID, using = "country")
    private WebElement pais;

    @FindBy(how = How.ID, using = "zipcode")
    private WebElement cep;

    @FindBy(how = How.ID, using = "city")
    private WebElement cidade;
    @FindBy(how = How.ID, using = "occupation")
    private WebElement ocupacao;

    @FindBy(how = How.XPATH, using = "//*//input[@id='skydiving']/../span")
    private WebElement hoobe;
    @FindBy(how = How.ID, using = "website")
    private WebElement url;
    @FindBy(how = How.ID, using = "open")
    private WebElement foto;
    @FindBy(how = How.ID, using = "nextenterproductdata")
    private WebElement nextProduct;


    public void setNome(String text){
        escrever(nome,text);
    }
    public void setsobreNome(String text){
        escrever(sobreNome,text);
    }
    public void setDataNasc(String text){
        escrever(dataNasc,text);
    }
    public void setSexFeminino(){
        clicar(sexFeminino);
    }
    public void setEndereco(String text){
        escrever(endereco, text);
    }

    public void setPais(){
        select(pais,"Brazil");
    }
    public void setCep(String text){
        escrever(cep,text);
    }
    public void setCidade(String text){
        escrever(cidade,text);
    }
    public void setOcupacao(){
      select(ocupacao,"Public Official");
    }
    public void setHoobe(){
        clicar(hoobe);
    }
    public void setUrl(String text){
        escrever(url,text);
    }
    public void setFoto(){
        escrever(foto,"C:\\Users\\Angel\\Pictures\\Image.jpeg");
    }

    public void buttonNext(){
        clicar(nextProduct);
    }
    /************************************* Metodo dados do Seguro ***********************************************/
    public void cadastroSeguro(){
        setNome("Ana");
        setsobreNome("Paula");
        setDataNasc("12/09/1999");
        setSexFeminino();
        setEndereco("QNM 52 J 12");
        setPais();
        setCep("75896413");
        setCidade("Santa Catarina");
        setOcupacao();
        setHoobe();
        setUrl("https://www.google.com/");
        buttonNext();
    }
}
