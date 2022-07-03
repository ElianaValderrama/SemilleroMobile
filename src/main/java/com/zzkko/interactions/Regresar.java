package com.zzkko.interactions;

import com.zzkko.tasks.buscarHome;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static com.zzkko.driver.AppiumAndroidDriver.driver;

public class Regresar implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        driver.navigate().back();
    }
    public static Performable on(){
        return Instrumented.instanceOf(Regresar.class).withProperties();
    }
}
