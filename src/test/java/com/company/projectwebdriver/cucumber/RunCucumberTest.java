package com.company.projectwebdriver.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {  //permite visualizar los reportes de las pruebas localmente html
        "pretty",
        "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/json-reports/Cucumber.json",
        "junit:target/cucumber-reports/junit-reports/Cucumber.xml"},
        tags = {"@E2E"},  //ejecuta los issues que tienen dichos tags
        glue = {"com.company.projectwebdriver.cucumber"},  //el contexto de ejecución de las pruebas se da nivel de paquete asignado (clases java en el paquete->stepdefs)
        features ={"src/test/resources/com/company/projectwebdriver/cucumber/features"},
        monochrome = true, snippets = CucumberOptions.SnippetType.CAMELCASE)//dirección de .features

public class RunCucumberTest {
}
