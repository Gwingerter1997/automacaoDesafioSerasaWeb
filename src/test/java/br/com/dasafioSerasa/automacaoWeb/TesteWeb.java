package br.com.dasafioSerasa.automacaoWeb;
import br.com.dasafioSerasa.core.Driver;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;


public class TesteWeb {
    WebDriver driver;
    Driver driverWeb;


    public void inicializarTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        //Acessando o site
        driver.get("https://www.serasa.com.br/ecred/simulador");

    }

     public void slideValorDeMil() {
        WebElement sl = driver.findElement(By.cssSelector("#slider-range"));
        Actions move = new Actions(driver);
        Action action = move.dragAndDropBy(sl, -200, 0).build();
        action.perform();
        }
    public void slideValorDeQuatroMil() {
        WebElement sl = driver.findElement(By.cssSelector("#slider-range"));
        Actions move = new Actions(driver);
        Action action = move.dragAndDropBy(sl, -159,0).build();
        action.perform();
    }

    public void slideParcelaDozeVezes() {
        WebElement sl = driver.findElement(By.cssSelector("#slider-range-month"));
        Actions move = new Actions(driver);
        Action action = move.dragAndDropBy(sl, -100, 2).build();
        action.perform();
    }
    public void slideValorDeSeisMil() {
        WebElement sl = driver.findElement(By.cssSelector("#slider-range"));
        Actions move = new Actions(driver);
        Action action = move.dragAndDropBy(sl, -128,0).build();
        action.perform();
    }
    public void slideParcelaVinteEQuatroVezes() {
        WebElement sl = driver.findElement(By.cssSelector("#slider-range-month"));
        Actions move = new Actions(driver);
        Action action = move.dragAndDropBy(sl, -50, 2).build();
        action.perform();
    }

     public void validacaoparcela(String prazo) {
            String cssQntParcela = "#month-amount-output";
            WebElement txtparcela = driver.findElement(By.cssSelector(cssQntParcela));
            String qtdParcela = txtparcela.getText();
            assertEquals(prazo,qtdParcela);
        }
    public void validacaoValorParcela(String valor) {
        String cssValorParcela = "#loan-amount-output";
        WebElement txtparcela = driver.findElement(By.cssSelector(cssValorParcela));
        String valorParcela = txtparcela.getText();
        assertEquals(valor,valorParcela);
    }





}

