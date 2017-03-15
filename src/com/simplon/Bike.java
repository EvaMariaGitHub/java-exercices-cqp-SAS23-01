package com.simplon;

/**
 * Created by alonso on 30/01/17.
 */
public class Bike extends Vehicle {

    public Bike(String model, Color color, float price) {
            this.model = model;
            this.color = color;
            this.price = price;
    }

    public float getPriceWithTax() { // on ne met pas public ?
        return this.price+1f;
    }

    @Override
    public String toString(){
        return "Bike : "+super.toString();
    }

}
