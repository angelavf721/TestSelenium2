package br.ce.driverFactory;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;


    public static void iniciarDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Documents\\driver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 765));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public static void fecharDriver() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void abrirUrl(String url) {
        driver.get(url);
    }
}
