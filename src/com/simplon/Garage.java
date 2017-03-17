package com.simplon;

import javax.sql.rowset.CachedRowSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alonso on 30/01/17.
 */
public class Garage {
    private String name;
    private List<Car> cars;
    private List<Bike> bikes;
    private List<Vehicle> vehicules;

    // Create garage without car
    public Garage(String name){
        this.name = name;
        this.cars = new ArrayList<>();
        this.bikes = new ArrayList<>();
        this.vehicules = new ArrayList<>();
    }


    public void addCar(Car car) {
        this.vehicules.add(car);
    }

    public void addCars(List<Car> cars) {
        this.vehicules.addAll(cars);
    }

    public void addBikes(List<Bike> bikes) {
        this.vehicules.addAll(bikes);
    }

    @Override
    public String toString() {
        String s;
        s = "Garage " +
            "name=" + name + "\n";
            for (Vehicle v : vehicules) {
                s +=""+v+"\n";
            }
        return s;
    }
}



