package com.co.certificacion.pruebas.definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pruebas.steps.CelularesStep;

public class CelularesStepDefinitions {
    @Steps
    CelularesStep celularesStep;
    @Given("^que ingreso a la pagina falabella Falabella$")
    public void queIngresoALaPaginaFalabellaFalabella() {
        celularesStep.abrirGoogle();

    }

    @When("^consulto un celular \"([^\"]*)\"$")
    public void consultoUnCelular(String arg1) {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^lo agrego al carro de compras$")
    public void loAgregoAlCarroDeCompras() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^valido los precios$")
    public void validoLosPrecios() {
        // Write code here that turns the phrase above into concrete actions
    }

}
