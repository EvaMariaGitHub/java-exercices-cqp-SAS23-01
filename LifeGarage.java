package com.simplon;

import java.util.ArrayList;

/**
 * Created by alonso on 30/01/17.
 */
public class LifeGarage {
    public static void main (String [] args) {
        //part 1
        Garage garage = new Garage("Garage1");
        Car car1 = new Car("renault", Color.RED, 999.9F);
        garage.addCars(car1);
        System.out.println(garage);

       // ArrayList<Car> cars = new ArrayList<Car>();
        Car car2 = new Car("peugeot", Color.GREEN, 1000.0F);
        Car car3 = new Car("volkswagen", Color.BLUE, 1500.0F);
        Car car4 = new Car("renault", Color.RED, 2000.5F);

        garage.addCars(car2, car3, car4);
        System.out.println(garage);

        ACar aCar1 = new ACar("renault", Color.RED, 999.9F);
        ACar aCar2 = new ACar("peugeot", Color.GREEN, 1000.0F);
        ACar aCar3 = new ACar("volkswagen", Color.BLUE, 1500.0F);
        ACar aCar4 = new ACar("renault", Color.RED, 2000.5F);

        ABike aBike1 = new ABike("harley", Color.RED, 800F);
        ABike aBike2 = new ABike("ducati", Color.BLUE, 1000F);
        ABike aBike3 = new ABike("bmw", Color.GREEN, 1999.9F);
        AGarage aGarage = new AGarage("Garage2");
        aGarage.addVehicles(aCar1, aCar2, aCar3, aCar4, aBike1, aBike2, aBike3);
        System.out.println(aGarage);


    }

}
