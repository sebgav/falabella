package com.co.certificacion.pruebas.definitions;

import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;

import javax.xml.ws.WebServiceClient;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class DefinitionsServicions {

    private Response responde;

    @Given("^consumo el  serivio$")

    public void consumoElSerivio() throws IOException {
        given().contentType(ContentType.JSON).contentType(ContentType.JSON)
                .header("Content-Type", "application/json")
                .get("https://api.openbrewerydb.org/breweries").statusCode();
    }
}
