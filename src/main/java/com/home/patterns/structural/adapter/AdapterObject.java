package com.home.patterns.structural.adapter;

/**
 *
 * Adapter class, adapts Adaptee to the Target interface
 *
 */
public class AdapterObject implements Target {

    private Adaptee adaptee;

    public AdapterObject(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String request() {
        return this.adaptee.specialRequest();
    }
}
