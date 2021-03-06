package com.home.patterns.structural.flyweight;

/**
 *
 * Flyweight, interface through flyweight can receive and act on extrinsic
 * state.
 *
 */
public interface Flyweight {

    void operation(Object extrinsicState);
}
