package com.simplon;

/**
 * Created by alonso on 30/01/17.
 */
public class Car {
    private String model;
    private Color color;
    private float price;

    public Car(String model, Color color, float price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel (){
        return this.model;
    }

    public Color getColor() {
        return this.color;
    }

    public float getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.model + ", " +this.color +", "+this.price;
    }
}
