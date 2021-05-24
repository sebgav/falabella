package pruebas.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PageFalabella extends PageObject {

    @FindBy(xpath = "//*[@id='lightbox-close']")
    WebElementFacade btnCerrarPublicidadIni;

    @FindBy(xpath = "//*[@id='acc-alert-close']")
    WebElementFacade btnCerrarPublicidadIni1;

    @FindBy(xpath = "//*[@class='SearchBar-module_searchBar__Input__3xQbs']")
    WebElementFacade txtConsultaFalabella;

    @FindBy(xpath = "//*[@id='testId-ProductLandingContainer-totalResults']")
    WebElementFacade lblResultados;

    @FindBy(id = "testId-pagination-top-arrow-right")
    WebElementFacade btnPaginaSiguiente;

    @FindBy(xpath = "//*[contains(@class,'pod-button-add-to-cart false')]")
    List<WebElementFacade> lsBtnAgregarCarro;

    public void cerrarVentana() {
        btnCerrarPublicidadIni.click();
        waitFor(5).second();
        btnCerrarPublicidadIni1.click();
    }

    public void buscarCelular(String consulta)
    {
        txtConsultaFalabella.sendKeys(consulta);
        waitFor(3).second();
        txtConsultaFalabella.sendKeys(Keys.ENTER);
    }

    public void avanzarPagina() {
        withAction().moveToElement(getDriver().findElement(By.id("testId-pagination-top-arrow-right"))).build().perform();
      //  withAction().moveToElement(btnPaginaSiguiente).build().perform();
        waitFor(3).second();
        //JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        //executor.executeScript("arguments[0].click();", btnPaginaSiguiente);
        btnPaginaSiguiente.click();
        waitFor(3).second();
    }

    public void seleccionarCeluar() {

        lsBtnAgregarCarro.get(ThreadLocalRandom
                .current()
                .nextInt(1, lsBtnAgregarCarro.size())).click();
    }
}
