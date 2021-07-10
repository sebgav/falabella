package pruebas.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;


import java.util.HashMap;
import java.util.List;

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

    @FindBy(xpath = "//*[@class='jsx-4099777552 search-results--actionbar']//*[@class='jsx-1738323148 jsx-2760063687 pagination']//*[contains(@class,'select')]")
    WebElementFacade btnPagSelect;

    @FindBy(xpath = "//*[contains(@id,'testId-Pod-action-prod')]")
    List<WebElementFacade> lsCelAddCart;

    @FindBy(xpath = "//*[contains(text(),'Gold Protection')]")
    WebElementFacade btnSeguro;

    @FindBy(xpath = "//*[@data-variant='CART']")
    WebElementFacade lblValor;

    @FindBy(xpath = "//*[@id='linkButton']")
    WebElementFacade btnVerBolsacompras;

    @FindBy(xpath = "//*[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']")
    WebElementFacade btnSeguirComprando;

    @FindBy(xpath = "(//*[@class='fbra_text fbra_test_orderSummary__itemPrice fbra_orderSummary__itemPrice'])[1]")
    WebElementFacade lblPrecioPFinal;

    @FindBy(xpath = "(//*[@class='fbra_text fbra_test_orderSummary__itemPrice fbra_orderSummary__itemPrice'])[2]")
    WebElementFacade lblSeguroPFinal;

    @FindBy(xpath = "//*[@class='fbra_text fbra_test_orderSummary__itemsTotalPrice fbra_orderSummary__itemsTotalPrice']")
    WebElementFacade lblValorTotal;


    public HashMap<String, String> seleccionarSeguro()
    {
        HashMap<String, String> valores = new HashMap<String, String>();

        valores.put("precio",lblValor.getText().replaceAll("\\$","").replaceAll("\\.","").trim());
      valores.put("seguro", btnSeguro.getText().replaceAll("Gold Protection","").replaceAll("\\$","").replaceAll("\\.","").trim());

        btnSeguro.click();
        btnVerBolsacompras.click();

        return valores;

    }

    public void cerrarVentana() {
        btnCerrarPublicidadIni.click();
        waitFor(5).second();
        if(btnCerrarPublicidadIni1.isVisible())
        {
            btnCerrarPublicidadIni1.click();
        }
    }

    public void buscarCelular(String consulta)
    {
        txtConsultaFalabella.sendKeys(consulta);
        waitFor(3).second();
        txtConsultaFalabella.sendKeys(Keys.ENTER);

    }


    public void avanzarPagina() {
        btnPaginaSiguiente.isCurrentlyEnabled();
        btnPaginaSiguiente.click();
    }

    public void AgregarAlCarro() {
        waitFor(5).second();
        lsCelAddCart.get(3).click();
        waitFor(5).second();
    }

    public void seleccionarIrPagar() {
        btnSeguirComprando.click();
    }

    public HashMap<String, String> getpreciosAComprar() {

        HashMap<String, String> valoresFinal = new HashMap<String, String>();

        valoresFinal.put("precio",lblPrecioPFinal.getText().replaceAll("\\$","").replaceAll("\\.","").trim());
        valoresFinal.put("seguro", lblSeguroPFinal.getText().replaceAll("\\$","").replaceAll("\\.","").trim());
return valoresFinal;
    }

    public String getPrecioTotal() {
return lblValorTotal.getText().replaceAll("\\$","").replaceAll("\\.","").trim();
    }

    public void cerrarPopup() {
        btnCerrarPublicidadIni.click();
        btnCerrarPublicidadIni1.click();

    }
}
