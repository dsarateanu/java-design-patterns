package com.home.patterns.behavioral.visitor;

/**
 * Implements operation declared by Visitor. Each operation implements a
 * fragment of the algorithm defined for the corresponding class of object in
 * the structure.
 *
 */
public class ConcreteVisitorA implements Visitor {

    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        concreteElementA.operationA();
    }

    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        concreteElementB.operationB();
    }
}
