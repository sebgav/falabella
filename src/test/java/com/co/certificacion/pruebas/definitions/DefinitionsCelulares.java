package com.co.certificacion.pruebas.definitions;


import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.thucydides.core.annotations.Steps;
import pruebas.steps.CelularesStep;

import java.util.HashMap;

public class DefinitionsCelulares {

    @Steps
    CelularesStep celularesStep;
    private HashMap<String, String> mapPrecios;

    @Given("^que ingreso a la pagina falabella (.*)$")
    public void queIngresoALaPaginaFalabella(String pagina)
    {
        celularesStep.abrirGoogle();
        celularesStep.ingresarAFalabella(pagina);

    }
    @When("^consulto un celular \"([^\"]*)\"$")
    public void consultoUnCelular(String consulta) {
        celularesStep.consultarCelular(consulta);
        celularesStep.avanzarPagina();

    }
    @When("^lo agrego al carro de compras$")
    public void loAgregoAlCarroDeCompras() {
        celularesStep.seleccionarCelular();
        mapPrecios=celularesStep.seleccionarSeguro();
        celularesStep.irAComprar();
    }


    @Then("^valido los precios$")
    public void validoLosPrecios() {
        celularesStep.ValidarPrecios(mapPrecios);
    }

}
