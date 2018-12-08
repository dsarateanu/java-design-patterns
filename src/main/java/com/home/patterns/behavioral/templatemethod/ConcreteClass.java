package com.home.patterns.behavioral.templatemethod;

/**
 *
 * Implements the primitive operations to carry out subclass-specific steps of
 * the algorithm.
 *
 */
public class ConcreteClass implements AbstractClass {

    public String primitiveOperation1() {
        return "Template";
    }

    public String primitiveOperation2() {
        return "Method";
    }
}
