package pruebas.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.slf4j.Logger;
import pruebas.userinterface.PageFalabella;
import pruebas.userinterface.PageInicialCelulares;

import java.util.HashMap;

import static jxl.biff.BaseCellFeatures.logger;


public class CelularesStep  {
    PageInicialCelulares pageInicialCelulares;
    PageFalabella pageFalabella;
    private HashMap<String, String> valoresFinal;
    private String valorTotal;

    @Step
    public void abrirGoogle() {
        pageInicialCelulares.open();
    }


@Step
    public void ingresarAFalabella(String pagina) {
        pageInicialCelulares.buscarFallabella(pagina);
        pageInicialCelulares.seleccionarFalabella();

    }

    @Step
    public void consultarCelular(String consulta)
    {
        pageFalabella.cerrarVentana();
        pageFalabella.buscarCelular(consulta);

    }

@Step
    public void avanzarPagina() {
        pageFalabella.avanzarPagina();
    }
@Step
    public void seleccionarCelular() {
        pageFalabella.AgregarAlCarro();
    }
@Step
    public HashMap<String, String> seleccionarSeguro() {
        return pageFalabella.seleccionarSeguro();
    }

    @Step
    public void irAComprar() {
        pageFalabella.seleccionarIrPagar();

    }
@Step
    public void ValidarPrecios(HashMap<String, String> mapPrecios)
    {
        valoresFinal=pageFalabella.getpreciosAComprar();
        Assert.assertTrue("Se valida seguro ",valoresFinal.get("seguro").equals(mapPrecios.get("seguro")));
        Assert.assertTrue("Se valida precio ",valoresFinal.get("precio").equals(mapPrecios.get("precio")));
        logger.info(String.format("Se valida seguro %s vs %s ", valoresFinal.get("seguro"),mapPrecios.get("seguro")));
        logger.info(String.format("Se valida precio %s vs %s ", valoresFinal.get("precio"),mapPrecios.get("precio")));

        valorTotal=pageFalabella.getPrecioTotal();
        Assert.assertTrue("Se valida el valor total", Integer.parseInt(valorTotal)==
                (Integer.parseInt(mapPrecios.get("seguro"))+Integer.parseInt(mapPrecios.get("precio"))));

        logger.info(String.format("Se valida el valor total %s Vs %s",Integer.parseInt(valorTotal),
                (Integer.parseInt(mapPrecios.get("seguro"))+Integer.parseInt(mapPrecios.get("precio"))))  );
    }
}
