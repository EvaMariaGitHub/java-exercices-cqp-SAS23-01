package com.simplon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by alonso on 30/01/17.
 */
public class LifeGarage {
    public static void main (String [] args) {
        //part 1
        Garage garage = new Garage("Garage1");
        Car car1 = new Car("renault", Color.RED, 999.9F);
        garage.addCar(car1);
        System.out.println(garage);

        Car car2 = new Car("peugeot", Color.GREEN, 1000.0F);
        Car car3 = new Car("volkswagen", Color.BLUE, 1500.0F);
        Car car4 = new Car("renault", Color.RED, 2000.5F);

        List<Car> cars = Arrays.asList(car2, car3, car4);


        garage.addCars(cars);
        System.out.println(garage);


        Bike bike1 = new Bike("harley", Color.RED, 800F);
        Bike bike2 = new Bike("ducati", Color.BLUE, 1000F);
        Bike bike3 = new Bike("bmw", Color.GREEN, 1999.9F);

        List<Bike> bikes = Arrays.asList(bike1, bike2, bike3);

        garage.addBikes(bikes);
        System.out.println(garage);
    }

}
