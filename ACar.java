package com.simplon;

/**
 * Created by alonso on 30/01/17.
 */
public class ACar extends Vehicle {

    public ACar(){
    }

    public ACar(String model, Color color, float price) {
            this.model = model;
            this.color = color;
            this.price = price;
    }

    float getPriceWithTax() { // on ne met pas public ?
        return this.getPrice()+2;
    }

    @Override
    public String toString(){
        return "Car : "+super.toString() +", "+ this.getPriceWithTax();
    }
}
