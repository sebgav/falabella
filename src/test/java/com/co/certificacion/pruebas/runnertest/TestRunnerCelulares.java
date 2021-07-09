package com.co.certificacion.pruebas.runnertest;


import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.core.snippets.SnippetType.*;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/celulares.feature",
        glue = "com.co.certificacion.pruebas.definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestRunnerCelulares {
}
