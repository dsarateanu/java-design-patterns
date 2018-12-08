package com.home.patterns.behavioral.visitor;

public class Main {

    //  Imagine that we need to implement a compiler. A compiler
    // is a program which transforms code written in one programming
    // language (the source language) into another programming
    // language (the target language).
    //
    //  The compiler functionality is divided into two major blocks:
    // a front-end and a back-end. The front-end block comprises of
    // a sequence of several phases, with each stage taking input from
    // its previous stage, modifying it and producing its own
    // representation of the source program and passing it to the next
    // phase. The front-end includes three main stages, which are
    // called the lexical, the syntax and the semantic analysis.
    //
    //  The first phase takes the source code as a stream of characters
    // and identifies distinct words (tokens), such as variable names,
    // keywords and punctuators. The second phase determines the
    // validity of syntactic organization of the program and produces
    // the Abstract Syntax Tree (AST). The semantic analysis checks
    // whether the AST follows the rules of a language (type checking,
    // name resolution, etc.).
    //
    //  AST, which represents the program written in source code, is
    // created during the second phase and is used in later phases of
    // the compiling process for operations such as type-checking,
    // code generation, code optimization, flow analysis, pretty-printing,
    // code instrumentation, etc.
    //
    //  Most of these operations will need to treat nodes that represent
    // assignment statements differently from nodes that represent
    // variables or arithmetic expressions. Distributing all these
    // operations across the various node classes leads to a system
    // that’s hard to understand, maintain and change.
    //
    //  It would be better if each new operation could be added separately,
    // and if the node classes were independent of the operations that
    // apply to them. If we package related operations in a separate
    // object, called a visitor, and pass it to elements of the AST as
    // it is traversed, then when an element of the AST “accepts” the
    // visitor, it sends a request to the visitor that encodes the
    // element’s class.
    //
    //  This solution is example of the Visitor design pattern.
    //
    //  The Visitor allows one or more operations to be applied to a set
    // of objects at runtime, decoupling the operations from the object
    // structure.

    public static void main(String[] args) {
        // Setup structure
        ObjectStructure objectStructure = new ObjectStructure();

        ConcreteElementA concreteElementA = new ConcreteElementA();
        ConcreteElementB concreteElementB = new ConcreteElementB();

        objectStructure.add(concreteElementA);
        objectStructure.add(concreteElementB);

        // Create visitor objects
        ConcreteVisitorA v1 = new ConcreteVisitorA();
        ConcreteVisitorB v2 = new ConcreteVisitorB();

        // Structure accepting visitors
        objectStructure.acceptAll(v1);
        System.out.println(concreteElementA.getCounter());
        System.out.println(concreteElementB.getCounter());

        objectStructure.acceptAll(v2);
        System.out.println(concreteElementA.getCounter());
        System.out.println(concreteElementB.getCounter());

        // lets remove second element from objectStructure
        Element element = objectStructure.getChild(1);
        objectStructure.remove(element);
        // now visit all elements on objectStructure
        objectStructure.acceptAll(v1);
        System.out.println(concreteElementA.getCounter());

        // this element was removed from objectStructure so counter should remain
        // the same as before last invocation of the acceptAll
        System.out.println(concreteElementB.getCounter());
    }
}