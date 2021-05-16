package pruebas.steps;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import pruebas.userinterface.PageFravegaConsultas;
import pruebas.userinterface.PageFravegaInicial;

import static jxl.biff.BaseCellFeatures.logger;


import java.util.List;

public class HeladeriaStep extends PageObject {
    PageFravegaInicial pageFravegaInicial;
    PageFravegaConsultas pageFravegaConsultas;
    private List<String> lsHeladeras;


    @Step
    public void abrirUrl() {
        pageFravegaInicial.open();
    }

    @Step
    public void consultarHeladera(String heladeria) {
        pageFravegaInicial.consultarHeladera(heladeria);
    }

    @Step
    public void seleccionarFiltros() {
        pageFravegaConsultas.seleccionarFiltroHeladeras();
        pageFravegaConsultas.seleccionarFiltroPeabody();
    }

    @Step
    public void validarTitle() {
        lsHeladeras = pageFravegaConsultas.getHeladerasTitle();
        for (int i = 0; lsHeladeras.size() > i; i++) {
            Assert.assertTrue("Se valida Title que contenga el filtro de Peabody", lsHeladeras.get(i).contains("Peabody"));
            logger.info(String.format("Se valida Title que contenga el filtro de Peabody \" %s \"  ", lsHeladeras.get(i)));
        }
    }

    @Step
    public void validarCantidadResultados() {
        Assert.assertTrue("Se valida Cantidad de Resultados", pageFravegaConsultas.getCantidadResultadosLabel() == lsHeladeras.size());
        logger.info(String.format("Se valida cantidad de registro recuperados %s",lsHeladeras.size() ));
    }

    public WebDriver validarMigaPan() {
         pageFravegaConsultas.getMigePan();
         Assert.assertTrue(String.format("Se valida Miga de Pan %s",pageFravegaConsultas.getMigePan()), pageFravegaConsultas.getMigePan().contains("Heladeras") );
         return getDriver();
    }




}
