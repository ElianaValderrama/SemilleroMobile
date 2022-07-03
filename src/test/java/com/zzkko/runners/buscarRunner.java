package com.zzkko.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/shein.feature",
        glue = "com.zzkko.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)

public class buscarRunner {
}
