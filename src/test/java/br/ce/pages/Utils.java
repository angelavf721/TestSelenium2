package br.ce.pages;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static br.ce.steps.Hooks.getDriver;

public class Utils {

    public Utils() {
        PageFactory.initElements(getDriver(), this);
    }

    JSONParser parser = new JSONParser();

    public void select(WebElement element, String value) {
        Select combo = new Select(element);
        combo.selectByValue(value);
    }


    public void escrever(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public void clicar(WebElement element) {
        element.click();
    }

    public void ValidarText(String text, WebElement element) {
        Assert.assertEquals(text, element.getText());
    }


    public JSONObject getJsonDataObject(String jsonFileName, String dataGroup) {
        jsonFileName = osAdaptFileName(jsonFileName);
        JSONObject jsonDataObject = null;
        try {
            Object jsonFileObject = parser.parse(new FileReader(System.getProperty("user.dir") + File.separator + "src" +
                    File.separator + "test" + File.separator + "java" + File.separator + "br" + File.separator + "ce" + File.separator + "dados" + File.separator + jsonFileName));
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

}
