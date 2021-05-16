package com.co.certificacion.pruebas.definitions;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pruebas.steps.HeladeriaStep;

public class DefinitionsHeladera {

    private HeladeriaStep heladeria;
    private WebDriver driver;

    @Given("^que ingreso a la pagina fravega$")
    public void queIngresoALaPaginaFravega() {
        heladeria.abrirUrl();
    }

    @When("^consulto heladeras de una marca especifica$")
    public void consultoHeladerasDeUnaMarcaEspecifica() {
        heladeria.consultarHeladera("Heladera");
        heladeria.seleccionarFiltros();
    }

    @Then("^se validaran los atributos y cantidad de elemntos de las heladeras$")
    public void seValidaranLosAtributosYCantidadDeElemntosDeLasHeladeras() {
        heladeria.validarTitle();
        heladeria.validarCantidadResultados();
        driver=heladeria.validarMigaPan();
    }
    @After
    public void after_test()
    {
        System.out.println("Termino la ejecucion");
        driver.close();
        driver.quit();
    }





}
