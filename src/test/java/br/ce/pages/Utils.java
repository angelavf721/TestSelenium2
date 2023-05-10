package br.ce.pages;

import br.ce.steps.Hooks;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static br.ce.steps.Hooks.driver;
import static br.ce.steps.Hooks.getDriver;

public class Utils {

    public Utils() {
        PageFactory.initElements(getDriver(), this);
    }

    JSONParser parser = new JSONParser();

    public void select(WebElement element, String value) {
            Select combo = new Select(element);
            boolean visible = element.isDisplayed();
            boolean isSelect = element.isSelected();
            if(visible == true && isSelect == false){
                combo.selectByValue(value);
            }
    }


    public void escrever(WebElement element, String text) {
        boolean visible = element.isDisplayed();
        boolean abilitado = element.isEnabled();
        if(visible == true && abilitado == true){
        element.clear();
        element.sendKeys(text);}
    }

    public void clicar(WebElement element) {
        element.click();
    }
    public void submit(WebElement element) {
        element.submit();
    }

    public void ValidarText(String text, WebElement element) {
        Assert.assertEquals(text, element.getText());
    }


    public JSONObject getJsonDataObject(String jsonFileName, String dataGroup) {
        jsonFileName = osAdaptFileName(jsonFileName);
        JSONObject jsonDataObject = null;
        try {
            Object jsonFileObject = parser.parse(new FileReader(System.getProperty("user.dir") + File.separator + "src" +
                    File.separator + "test" + File.separator + "resources" + File.separator + "dados" + File.separator + jsonFileName));
            jsonDataObject = (JSONObject) jsonFileObject;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        assert jsonDataObject != null;
        return (JSONObject) jsonDataObject.get(dataGroup);
    }

    private String osAdaptFileName(String baseFileName) {
        if (System.getProperty("os.name").startsWith("Windows")) {
            baseFileName += ".json";
        }
        return baseFileName;
    }
    public static File gerarScreenShot(Scenario cenario) {
        driver = Hooks.getDriver();
        File screenshot  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        cenario.attach(String.valueOf(screenshot), "image/png", "finalScreenshot");
        File imagem = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(imagem, (new File("./target/screenshots", cenario.getName() + "-" + cenario.getStatus() + ".png")));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return imagem;
    }

}
