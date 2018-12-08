package com.home.patterns.behavioral.strategy;

/**
 * Declares an interface common to all supported algorithms. Context uses this
 * interface to call the algorithm defined by a ConcreteStrategy.
 *
 */
public interface Strategy {

    String algorithmInterface();
}
