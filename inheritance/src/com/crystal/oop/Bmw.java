package com.crystal.oop;

public class Bmw extends Car {

    public Bmw(String model){
        super("BMW",model);
    }

    @Override
    public void showTurnSignal() throws RuntimeException {
        throw new RuntimeException("No turn signal available on BMWs!");
    }
}
