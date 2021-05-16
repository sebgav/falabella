package pruebas.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.core.Serenity.takeScreenshot;

public class PageFravegaConsultas extends PageObject {
    @FindBy(xpath = "(//*[contains(@name,'subcategoryAggregation') and contains(text(),'Heladeras')])[1]")
    WebElementFacade btnFiltroHeladera;

    @FindBy(xpath = "//input[@value='peabody']//ancestor::a[1]")
    WebElementFacade btnFiltroPeabody;

    @FindBy(xpath = "//*[@data-testid='tag-pill' and contains(text(),'peabody')]")
    WebElementFacade lblFiltroAplicado;

    @FindBy(xpath = "//*[contains(@class,'listingDesktopstyled__SearchResultList')]//*[contains(@class,'PieceTitle')]")
    List<WebElementFacade> lslblTitleHeladeras;

    @FindBy(xpath = "//*[@name='totalResult']//span")
    private WebElementFacade lblCantidadResultados;

    @FindBy(xpath = "//*[@name='breadcrumb']")
    WebElementFacade lblMigaPan;


    public void  seleccionarFiltroHeladeras()
    {
        btnFiltroHeladera.click();
        takeScreenshot();
    }

    public void seleccionarFiltroPeabody() {
        withAction().moveToElement(btnFiltroPeabody).build().perform();

        waitFor(ExpectedConditions.visibilityOf(btnFiltroPeabody));
        btnFiltroPeabody.click();
        takeScreenshot();
    }

    public List<String> getHeladerasTitle()
    {

        List<String> titleHeladeras=new ArrayList<>();
        waitFor(ExpectedConditions.visibilityOf(lblFiltroAplicado));
        for (WebElementFacade lblTitleHeladeras :lslblTitleHeladeras)
        {
            withAction().moveToElement(lblTitleHeladeras).build().perform();
            titleHeladeras.add(lblTitleHeladeras.getText());
        }
        return titleHeladeras;
    }

    public int getCantidadResultadosLabel() {
       return Integer.parseInt(lblCantidadResultados.getText().trim());
    }

    public String getMigePan() {
withAction().moveToElement(lblMigaPan).build().perform();
return lblMigaPan.getText();
    }
}
