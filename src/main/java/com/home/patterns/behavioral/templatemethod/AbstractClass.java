package com.home.patterns.behavioral.templatemethod;

/**
 * Defines interfaces for primitive operations. Implements algorithm.
 *
 *
 */
interface AbstractClass {

    /**
     * Template method, implementation of algorithm which consists of
     * primitiveOperations
     *
     * @return result of the primitive operations
     */
    default String templateMethod() {
        return this.primitiveOperation1() + this.primitiveOperation2();
    }

    abstract String primitiveOperation1();

    abstract String primitiveOperation2();
}
