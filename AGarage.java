package com.simplon;

import java.util.ArrayList;

/**
 * Created by alonso on 30/01/17.
 */
public class AGarage {
    private String name;
    private ArrayList<Vehicle> vehicles;

    // Create garage without car
    public AGarage(String name){
        this.name = name;
        this.vehicles = new ArrayList<Vehicle>();
    }

    //create garage with a list of vehicles
    public AGarage(String name, ArrayList<Vehicle> vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    // add one or more vehicles passing Vehicles Objects
    public void addVehicles(Vehicle... vehicles) {
        for (Vehicle v : vehicles) {
            this.vehicles.add(v);
        }
    }
    // add one or more vehicless throught a list of vehicles
    public void addVehicles(ArrayList<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            this.vehicles.add(v);
        }
    }

    // getting all the garage' vehicles
    public ArrayList<Vehicle> getVehicles() {
        return this.vehicles;
    }

    // Cette méthode a t elle un sens ?
    public Vehicle getVehicle(int i) {
        return this.vehicles.get(i);
    }

    @Override
    public String toString() {
        String s = "";
        s = "Bienvenue dans le Garage " + name + "\n" +
                "Actuellement nous avons les vehicules suivants : " + '\n';
        for (Vehicle v : this.vehicles) {
            s += v+"\n";
        }
        return s;
    }
}



