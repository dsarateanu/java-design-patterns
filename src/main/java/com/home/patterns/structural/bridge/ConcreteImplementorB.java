package com.home.patterns.structural.bridge;

public class ConcreteImplementorB implements Implementor {

    public String implementation() {
        return this.getClass().getName();
    }
}
