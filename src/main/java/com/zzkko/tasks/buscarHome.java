package com.zzkko.tasks;

import com.zzkko.interactions.Regresar;
import com.zzkko.interactions.ScrollBajar;
import com.zzkko.interactions.ScrollSubir;
import com.zzkko.userInterface.SheinUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.matchers.statematchers.BaseWebElementStateMatcher;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class buscarHome implements Task {

    SheinUI sheinUI = new SheinUI();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        actor.attemptsTo(
                ScrollBajar.on(),
                ScrollBajar.on(),
                ScrollBajar.on(),
                WaitUntil.the(sheinUI.BTN_PRODUCTOHOME, WebElementStateMatchers.isVisible()),
                Click.on(sheinUI.BTN_PRODUCTOHOME),
                Click.on(sheinUI.BTN_ANADIRCARRITO),
                Regresar.on(),
                ScrollSubir.on(),
                ScrollSubir.on(),
                ScrollSubir.on(),
                Click.on(sheinUI.BTN_CATEGORIA),
                Click.on(sheinUI.BTN_SELECCIONARCATEGORIA),
                Click.on(sheinUI.BTN_PRODUCTOCATEGORIA),
                Click.on(sheinUI.BTN_ANADIRCARRITO),
                Regresar.on(),
                Regresar.on(),
                Click.on(sheinUI.BTN_BARRABUSQUEDA),
                Enter.keyValues("Aretes").into(sheinUI.TXT_PALABRAABUSCAR),
                Click.on(sheinUI.BTN_HACERBUSQUEDA),
                Click.on(sheinUI.BTN_PRODUCTOBARRA),
                Click.on(sheinUI.BTN_ANADIRCARRITO),
                Click.on(sheinUI.BTN_CARRITO),
                WaitUntil.the(sheinUI.BTN_ELIMINARSELLECCIONCARRITO, WebElementStateMatchers.isVisible()),
                Click.on(sheinUI.BTN_ELIMINARSELLECCIONCARRITO),
                WaitUntil.the(sheinUI.BTN_SELECCIONARTODOCARRITO, WebElementStateMatchers.isVisible()),
                Click.on(sheinUI.BTN_SELECCIONARTODOCARRITO),
                WaitUntil.the(sheinUI.BTN_BORRARCARRITO, WebElementStateMatchers.isVisible()),
                Click.on(sheinUI.BTN_BORRARCARRITO),
                Regresar.on()
        );
    }

    public static Performable on(){
        return Instrumented.instanceOf(buscarHome.class).withProperties();
    }
}
