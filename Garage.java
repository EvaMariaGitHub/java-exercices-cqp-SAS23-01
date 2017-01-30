package com.simplon;

import java.util.ArrayList;

/**
 * Created by alonso on 30/01/17.
 */
public class Garage {
    private String name;
    private ArrayList<Car> cars;

    // Create garage without car
    public Garage(String name){
        this.name = name;
        this.cars = new ArrayList<Car>();
    }

    //create garage with a list of cars
    public Garage(String name, ArrayList<Car> cars) {
        this.name = name;
        this.cars = cars;
    }

    // add one or more car passing Car Objects
    public void addCars(Car... cars) {
        for (Car c : cars) {
            this.cars.add(c);
        }
    }
    // add one or more cars throught a list of cars
    public void addCars(ArrayList<Car> cars) {
        for (Car c : cars) {
            this.cars.add(c);
        }
    }

    // getting all the garage' cars
    public ArrayList<Car> getCars() {
        return this.cars;
    }

    // Cette méthode a t elle un sens ?
    public Car getCar(int i) {
        return this.cars.get(i);
    }

    @Override
    public String toString() {
        String s = "";
        s = "Bienvenue dans le Garage " + name + "\n" +
                "Actuellement nous avons les voitures suivantes : " + '\n';
        for (Car c : this.cars) {
            s += c+"\n";
        }
        return s;
    }
}



