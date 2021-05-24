package com.co.certificacion.pruebas.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pruebas.steps.CelularesStep;

public class DefinitionsCelulares {

    CelularesStep celularesStep;
    @Given("^que ingreso a la pagina falabella (.*)$")
    public void queIngresoALaPaginaFalabella(String pagina)
    {
        celularesStep.abrirGoogle();
        celularesStep.ingresarAFalabella(pagina);
    }
    @When("^consulto un celular \"([^\"]*)\"$")
    public void consultoUnCelular(String consulta) {
        celularesStep.consultarCelular(consulta);
    }
    @When("^lo agrego al carro de compras$")
    public void loAgregoAlCarroDeCompras() {
        celularesStep.agregarCarro();
    }


    @Then("^valido los precios$")
    public void validoLosPrecios() {
        // Write code here that turns the phrase above into concrete actions
    }
}
