package pruebas.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.locators.WaitForWebElements;
import org.jruby.RubyProcess;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.List;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

@DefaultUrl("https://www.google.com/")
public class PageInicialCelulares extends PageObject {
    @FindBy(xpath = "//*[@aria-label='Buscar']")
    WebElementFacade txtBuscar;

    @FindBy(xpath = "//*[text()='https://www.falabella.com.co']//ancestor::a[1]//h3")
    WebElementFacade lblPageFalabella;

    public void buscarFallabella(String pagina) {
        txtBuscar.sendKeys( pagina )  ;
        txtBuscar.sendKeys(Keys.ENTER);
    }

    public void seleccionarFalabella() {
        waitFor(ExpectedConditions.visibilityOf(lblPageFalabella));
        lblPageFalabella.click();
        getDriver().manage().deleteAllCookies();
    }
}
