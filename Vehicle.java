package com.simplon;

/**
 * Created by alonso on 30/01/17.
 */
abstract class Vehicle {
    protected String model;
    protected Color color;
    protected float price;
   // private float tax;



    public String getModel (){
        return this.model;
    }

    public Color getColor() {
        return this.color;
    }

    public float getPrice() {
        return this.price;
    }

    abstract float getPriceWithTax();

    @Override
    public String toString() {
        return this.model + ", " +this.color;
    }



}
