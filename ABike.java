package com.simplon;

/**
 * Created by alonso on 30/01/17.
 */
public class ABike extends Vehicle {

    public ABike(){
    }

    public ABike(String model, Color color, float price) {
            this.model = model;
            this.color = color;
            this.price = price;
    }

    float getPriceWithTax() { // on ne met pas public ?
        return this.getPrice()+1;
    }

    @Override
    public String toString(){
        return "Bike : "+super.toString() +", "+ this.getPriceWithTax();
    }
}
