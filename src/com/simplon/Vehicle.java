package com.simplon;

/**
 * Created by alonso on 30/01/17.
 */
public abstract class Vehicle {
    protected String model;
    protected Color color;
    protected float price;

    public abstract float getPriceWithTax();

    @Override
    public String toString() {
        return this.model + ", " +this.color+ ", "+getPriceWithTax();
    }
}
