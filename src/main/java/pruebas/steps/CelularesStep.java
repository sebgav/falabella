package pruebas.steps;

import net.serenitybdd.core.pages.PageObject;
import pruebas.userinterface.PageFalabella;
import pruebas.userinterface.PageFalabellaConsultas;
import pruebas.userinterface.PageInicialCelulares;


public class CelularesStep extends PageObject {
    PageInicialCelulares pageInicialCelulares;
    PageFalabella pageFalabella;
    PageFalabellaConsultas pageFalabellaConsultas;//=new PageFalabellaConsultas();
    public void abrirGoogle() {
        pageInicialCelulares.open();
    }

    public void ingresarAFalabella(String pagina) {
        pageInicialCelulares.buscarFallabella(pagina);
        pageInicialCelulares.seleccionarFalabella();

    }

    public void consultarCelular(String consulta)
    {
        pageFalabella.cerrarVentana();
        pageFalabella.buscarCelular(consulta);
        pageFalabellaConsultas.avanzarPagina();
    }


    public void agregarCarro() {
        pageFalabella.seleccionarCeluar();
    }
}
