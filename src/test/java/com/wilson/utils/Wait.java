package com.wilson.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.time.Duration;

public class Wait implements Task {
    private final Duration duration;

    public Wait(Duration duration) {
        this.duration = duration;
    }

    public static Performable to(Duration duration) {
        return Tasks.instrumented(Wait.class, duration);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(duration.toMillis());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Error waiting....", e);
        }
    }
}
