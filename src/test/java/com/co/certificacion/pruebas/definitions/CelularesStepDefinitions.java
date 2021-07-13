package com.co.certificacion.pruebas.definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pruebas.steps.CelularesStep;

public class CelularesStepDefinitions {

    @Steps
    CelularesStep celularesStep;



    @Given("que ingreso a la pagina falabella {string}")
    public void queIngresoALaPaginaFalabella(String pagina) {
        // Write code here that turns the phrase above into concrete actions
        celularesStep.abrirGoogle();
        celularesStep.ingresarAFalabella(pagina);
    }

    @When("consulto un celular {string}")
    public void consultoUnCelular(String string) {
        celularesStep.cerrarPopup();
        celularesStep.validarMensaje();

    }

    @When("lo agrego al carro de compras")
    public void loAgregoAlCarroDeCompras() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("valido los precios")
    public void validoLosPrecios() {
        // Write code here that turns the phrase above into concrete actions
    }

}
