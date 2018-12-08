package com.home.patterns.behavioral.mediator;

public class Main {

    //  Imagine that we need to develop a flight simulator.
    // Our flight simulator will have base artifacts, like airport
    // and aircraft. An aircraft can take off from the airport, fly
    // in the sky and land on the airport.
    //
    //  Imagine a scenario when one particular aircraft is landing on
    // the airport: how can that aircraft be sure that the other
    // aircrafts are not trying to land on the same airport at the
    // same time? It is obvious that our aircraft can’t talk to each
    // and every aircraft which is currently approaching the airport.
    //
    //  A better approach would be to introduce a mediator, which is a
    // “man in the middle”, meaning that all the aircrafts will
    // communicate only with the mediator. The task of ensuring the safe
    // operations of the aircrafts belongs to air traffic controllers,
    // who are mediators. They must coordinate the movements of all
    // the aircrafts, keep them at safe distances from each other,
    // direct them during takeoff and landing, direct them around bad
    // weather and ensure that the air traffic flows smoothly with
    // minimal delays.
    //
    //  The example above is a Mediator pattern. The Mediator pattern defines
    // an object that controls how a set of objects interacts.

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Colleague colleague1 = new ConcreteColleague1(mediator);
        Colleague colleague2 = new ConcreteColleague2(mediator);

        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);

        colleague1.notifyColleague("Hello from ConcreteColleague1");
        colleague2.notifyColleague("Hello from ConcreteColleague2");

        System.out.println(colleague1.getReceivedMessage());
        System.out.println(colleague2.getReceivedMessage());
    }
}