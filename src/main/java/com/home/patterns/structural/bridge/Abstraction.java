package com.home.patterns.structural.bridge;

abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    abstract String operation();
}
