package br.ce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static br.ce.steps.Hooks.getDriver;

public class VeiculosPage extends Utils{

    public VeiculosPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(how = How.ID, using = "make")
    private WebElement make;
   @FindBy(how = How.ID, using = "model")
    private WebElement model;
   @FindBy(how = How.ID, using = "cylindercapacity")
    private WebElement cilindro;

   @FindBy(how = How.ID, using = "engineperformance")
    private WebElement motor;

   @FindBy(how = How.ID, using = "opendateofmanufacturecalender")
    private WebElement data;
   @FindBy(how = How.XPATH, using = "//a[@class='ui-state-default']/..//a[contains(text(),'20')]")
    private WebElement dia;
   @FindBy(how = How.XPATH, using = "//div[@class='ui-datepicker-title']//span[contains(text(),'February')]")
    private WebElement mes;
    @FindBy(how = How.XPATH, using = "//div[@class='ui-datepicker-title']//span[contains(text(),'2023')]")
    private WebElement ano;
    @FindBy(how = How.XPATH, using = "//a[@class='ui-datepicker-prev ui-corner-all']")
    private WebElement voltaData;

    @FindBy(how = How.ID, using = "numberofseats")
    private WebElement numberAss;
    @FindBy(how = How.XPATH, using = "//p[@class='group']//input[@value='Yes']//..//span[@class='ideal-radio']")
    private WebElement volante;

    @FindBy(how = How.ID, using = "numberofseatsmotorcycle")
    private WebElement numberofseat;

    @FindBy(how = How.ID, using = "fuel")
    private WebElement combustivel;

    @FindBy(how = How.ID, using = "payload")
    private WebElement carga;

    @FindBy(how = How.ID, using = "totalweight")
    private WebElement peso;
    @FindBy(how = How.ID, using = "listprice")
    private WebElement preco;
    @FindBy(how = How.ID, using = "licenseplatenumber")
    private WebElement placa;
    @FindBy(how = How.ID, using = "annualmileage")
    private WebElement quilometragem;
    @FindBy(how = How.ID, using = "nextenterinsurantdata")
    private WebElement next;

    /************************************* Metodos ***********************************************/
    public void Honda(){
        select(make,"Honda");
    }
    public void modelo(){
        select(model,"Three-Wheeler");
    }
    public void cilindro(String text){
        escrever(cilindro,text);
    }
    public void despenhoMotor(String text){
        escrever(motor,text);
    }
    /*Pensei em criar um metodo unico para data em Utlis,
     porém misturaria metodos de preenchimento com validação*/
    public void setData(){
        clicar(data);
        clicar(voltaData);
    }
    public void validaMesData(){
         ValidarText("February",mes);
    }
    public void validaAnoData(){
        ValidarText("2023",ano);
    }
    public void setDataDia(){
        clicar(dia);
    }
    public void setNumberofseat(){
        select(numberofseat,"3");
    }
    public void setVolante(){
        clicar(volante);
    }
    public void setNumeroAss(){
        select(numberAss,"4");
    }
    public void setCombustivel(){
        select(combustivel,"Diesel");
    }
    public void setCarga(String text){
        escrever(carga, text);
    }
    public void setPeso(String text){
        escrever(peso, text);
    }
    public void setPreco(String text){
        escrever(preco, text);
    }
    public void setPlaca(String text){
        escrever(placa, text);
    }
    public void setQuilometragem(String text){
        escrever(quilometragem, text);
    }

    public  void buttonNext(){
        clicar(next);
    }

/************************************* Metodo dados do Veiculo ***********************************************/

    public void cadastroVeiculo(){
        Honda();
        modelo();
        cilindro("55");
        despenhoMotor("552");
        setData();
        setDataDia();
        setNumeroAss();
        setVolante();
        setNumberofseat();
        setCombustivel();
        setCarga("222");
        setPeso("789");
        setPreco("85589");
        setPlaca("BRA7E59");
        setQuilometragem("55588");
        buttonNext();
    }


}
