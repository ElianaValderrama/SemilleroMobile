package com.zzkko.stepDefinitions;

import com.zzkko.driver.AppiumAndroidDriver;
import com.zzkko.tasks.buscarHome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class buscarStepDefinitions {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que el usuario se encuentra en la app shein$")
    public void queElUsuarioSeEncuentraEnLaAppShein() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.appium().on()));
    }

    @When("^desee ver productos$")
    public void deseeVerProductos() {
        OnStage.theActorInTheSpotlight().attemptsTo(buscarHome.on());
    }

    @Then("^usara la barra de busqueda para encontrar los productos deseados$")
    public void usaraLaBarraDeBusquedaParaEncontrarLosProductosDeseados() {

    }
}
