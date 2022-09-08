package com.crystal.oop;

public class Car extends Vehicle {

    public Car(String make, String model){
        super(make,model);
    }

       public void turnOnAirConditioning(){
           System.out.println("Turning on air conditioning in "+(make+" "+model));
    }
}
