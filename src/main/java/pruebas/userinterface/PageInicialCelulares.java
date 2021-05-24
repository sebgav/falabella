package pruebas.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

@DefaultUrl("https://www.google.com/")
public class PageInicialCelulares extends PageObject {
    @FindBy(xpath = "//*[@aria-label='Buscar']")
    WebElementFacade txtBuscar;

    @FindBy(xpath = "(//a[@href='https://www.falabella.com.co/falabella-co/'])[1]")
    WebElementFacade lblPageFalabella;

    public void buscarFallabella(String pagina) {
        txtBuscar.sendKeys( pagina )  ;
        txtBuscar.sendKeys(Keys.ENTER);
    }

    public void seleccionarFalabella() {
        lblPageFalabella.click();
        getDriver().manage().deleteAllCookies();
    }
}
