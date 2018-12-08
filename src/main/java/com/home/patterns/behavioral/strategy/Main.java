package com.home.patterns.behavioral.strategy;

public class Main {

    //  Imagine that we need to implement a network load balancer.
    // The Load balancer serves as the single point of contact
    // for clients: it distributes incoming traffic across multiple
    // targets, which increases the availability and capability of
    // your application.
    //
    //  The question is: how will the load balancer distribute the
    // incoming traffic? We can have various algorithms, like round
    // robin, ip-hash, least connected, etc. New algorithms can be
    // introduced over time. So, it is obvious that an algorithm for
    // traffic distribution can be implemented in different ways.
    //
    //  A straight solution would be to implement a few algorithms
    // and hide the invocation of the algorithm in an ‘if/then’
    // or in a ‘switch’ statement.
    //
    //Is the proposed solution flexible enough?
    //
    //  Another solution would be to define a common interface for our
    // algorithm and then encapsulate the behavior of an algorithm as
    // an object which implements a common interface. During runtime
    // we can select which object to use and many different behaviors
    // can be implemented without creating huge ‘if/then’ or ‘switch’
    // statements.
    //
    //  This solution is a Strategy pattern.
    //
    //  The Strategy pattern defines a family of algorithms, encapsulates
    // each one, and makes them interchangeable. The Strategy lets the
    // algorithm vary independently from the clients that use it.

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        System.out.println(context.contextInterface());

        context = new Context(new ConcreteStrategyB());
        System.out.println(context.contextInterface());

        context = new Context(new ConcreteStrategyC());
        System.out.println(context.contextInterface());
    }
}