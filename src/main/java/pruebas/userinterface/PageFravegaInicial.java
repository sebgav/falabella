package pruebas.userinterface;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static net.serenitybdd.core.Serenity.takeScreenshot;

@DefaultUrl("https://www.fravega.com/")
public class PageFravegaInicial  extends PageObject {

    @FindBy(xpath = "(//*[contains(@class,'GeolocalizationDesktop__Button')])[2]")
    WebElementFacade btnCancelarPublicidadInicial;

    @FindBy(xpath = "//*[contains(@placeholder,'Buscar productos')]")
    WebElementFacade txtConsultarProductos;

    @FindBy(xpath = "//*[contains(@class,'InputBar__SearchButton')]")
    WebElementFacade btnConsultarProductos;

    public void consultarHeladera(String heladeria) {
        btnCancelarPublicidadInicial.click();
        waitFor(ExpectedConditions.elementToBeClickable(txtConsultarProductos));
        txtConsultarProductos.sendKeys(heladeria);
        takeScreenshot();
        btnConsultarProductos.click();
    }
}
