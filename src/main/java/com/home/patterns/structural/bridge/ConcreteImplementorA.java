package com.home.patterns.structural.bridge;

public class ConcreteImplementorA implements Implementor {

    public String implementation() {
        return this.getClass().getName();
    }
}
