package io.tigranes;

import java.util.Random;

public abstract class Car {

    // private - modifikator dostupa
    // Declaraciya tipa class
    // nazvanie peremennoy
    // new keyword
    // Constructor()
    private Wheel wheel;
    public int x = 0;
    protected int y = 0;
    private Engine engine;

    private boolean isStarted;

    public Car(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
        this.isStarted = false;
    }



    public boolean getIsStarted() {
        return this.isStarted;
    }

    public void startEngine() {
        if (this.isStarted != true) {
            this.isStarted = true;
        }
    }

    public static int VIN_CODE() {
        return new Random().nextInt();
    }

    abstract void customMethod();

}
