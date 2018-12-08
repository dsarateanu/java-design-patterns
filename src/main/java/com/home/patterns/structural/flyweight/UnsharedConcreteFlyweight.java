package com.home.patterns.structural.flyweight;

/**
 * UnsharedConcreteFlyweight, defines objects which are not shared.
 *
 */
public class UnsharedConcreteFlyweight implements Flyweight {

    private Object state;

    public UnsharedConcreteFlyweight(Object state) {
        this.state = state;
    }

    public void operation(Object extrinsicState) { //NO SONAR

    }

    public Object getState() {
        return state;
    }
}
