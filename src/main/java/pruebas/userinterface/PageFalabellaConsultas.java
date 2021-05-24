package pruebas.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class PageFalabellaConsultas extends PageObject {
    @FindBy(xpath = "//*[@id='testId-ProductLandingContainer-totalResults']")
    WebElementFacade lblResultados;

    @FindBy(xpath = "(//*[@class='jsx-1738323148 jsx-2760063687 arrow right'])[1]")
    WebElementFacade btnPaginaSiguiente;

    @FindBy(xpath = "//*[contains(@class,'pod-button-add-to-cart false')]")
    List<WebElementFacade> lsBtnAgregarCarro;


    public void avanzarPagina() {
        //withAction().moveToElement(getDriver().findElement(By.id("testId-pagination-top-arrow-right"))).build().perform();
        waitFor(3).second();
        //JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        //executor.executeScript("arguments[0].click();", btnPaginaSiguiente);
        btnPaginaSiguiente.click();
        waitFor(3).second();
    }
}
