package com.crystal.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Car toyota = new Car("Toyota","Corolla");
        Car audi = new Car("Audi","A5");
        Motorcycle motorcycle = new Motorcycle("Suzuki","Katana");

        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(toyota);
        fleet.add(audi);
        fleet.add(motorcycle);
        //fleet.add(new Bmw("X5"));

        //Vehicle vehicle = (Vehicle) toyota;  //UP-CASTING

        startAndShowTurnSignal(toyota);
        startAndShowTurnSignal(audi);
        //startAndShowTurnSignal(motorcycle); just for Car

        countCars(fleet);

        turnOnAirConditioning(fleet);

        short s=5;
        int i=s;  //implicit casting

        short s2=(short) i; //explicit casting //COMPATIBLE!

    }

    public static void countCars(List<Vehicle> fleet){
        for(Vehicle vehicle:fleet){
            int count=0;
            if(vehicle instanceof Car){ //operator in java return true
                count++;
            }

            System.out.println(count);
        }
    }

    public static void turnOnAirConditioning(List<Vehicle> fleet){
        for(Vehicle vehicle:fleet){
            if(vehicle instanceof Car){ //always include an instaceof check when we do DOWNCASTING
                Car car = (Car) vehicle;
                car.turnOnAirConditioning();
               // ((Car) vehicle).turnOnAirConditioning();  //simple way
            }
        }
    }

    public static void startAndShowTurnSignal(Vehicle vehicle){
        vehicle.start();
        vehicle.showTurnSignal();
    }

}


//an example of compile time/runtime poli
//read about rules of overiding and covariant return types
//abstraction
