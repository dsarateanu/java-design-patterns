package com.home.patterns.behavioral.chainofresponsability;

public class Main {

//    Imagine that you just have bought a new wireless router from the local Internet
// Service Provider. You unpack a router from the box, plug the necessary cables and you
// switch on your new wireless router. But, the router is not able to establish an Internet
// connection. After checking the technical manuals and playing with router settings, you
// finally give up and you call the ISP operator’s call center.
//
//    The first thing you hear is a machine voice of the auto responder. It suggests dozen
// of possible solutions to various problems, but none of those are related to your particular
// problem. After a while, the machine connects you to the live operator. After a short discussion,
// the operator realizes that he cannot help you either. So, he connects you to an engineer,
// who finally fixes your problem.
//
//    That was an example of the Chain of Responsibility.
//
//    In essence, we pass an object along a “chain” of potential handlers for that object until
// one of the handlers handles the request. The Chain of Responsibility allows an object to send
// a command without knowing which object will receive and handle it. The request is sent from
// one object to another, making them parts of a chain and each object in this chain can handle
// the command, pass it on or do both.

    public static void main(String[] args) {
        // create two handlers
        Handler concreteHandler1 = new ConcreteHandler1();
        Handler concreteHandler2 = new ConcreteHandler2();
        // connect handler in chain
        concreteHandler1.setSuccesor(concreteHandler2);

        // handleRequest on handlers is not invoked
        System.out.println(((ConcreteHandler1) concreteHandler1).isHandleRequestInvoked());
        System.out.println(((ConcreteHandler2) concreteHandler2).isHandleRequestInvoked());

        concreteHandler1.handleRequest();

        // handleRequest on handlers is invoked
        System.out.println(((ConcreteHandler1) concreteHandler1).isHandleRequestInvoked());
        System.out.println(((ConcreteHandler2) concreteHandler2).isHandleRequestInvoked());
    }
}