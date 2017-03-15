package com.simplon;

/**
 * Created by alonso on 30/01/17.
 */
public class Car extends Vehicle {

    private static float taxe = 2f;

    public Car(String model, Color color, float price) {
            this.model = model;
            this.color = color;
            this.price = price;
    }

    public float getPriceWithTax() { // on ne met pas public ?
        return this.price+ this.taxe;
    }

    @Override
    public String toString(){
        return "Car : "+super.toString();
    }

}
