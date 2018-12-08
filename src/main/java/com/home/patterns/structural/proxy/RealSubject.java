package com.home.patterns.structural.proxy;

/**
 * RealSubject class is a real object which is represented by Proxy
 *
 */
public class RealSubject implements Subject {

    public void doOperation() {
        System.out.println("Do operation");
    }
}
