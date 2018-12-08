package com.home.patterns.behavioral.observer;

public class Main {

    //  Imagine that we are developing a computer game.
    //
    //  One feature of our game will be the awards system.
    // Players will earn dozens of different badges for
    // completing specific milestones during the game.
    //
    //  When players pass or reach a certain point in the game,
    // for example jump over a complex fence, we need to catch
    // that part of the code and calculate the award.
    //
    //  But, how should we implement such a feature?
    //
    //  One approach would be to find a place in the code where
    // specific milestones are completed and extend those places
    // with code which calculates the awards. This approach is
    // not flexible, it is not intuitive, and makes our code c
    // omplex and difficult and violates the single responsibility
    // principle.
    //
    //  Another approach would be to create award events in the
    // code, where specific milestones are completed. Award events
    // are then published as notifications, regardless of who
    // receives the notification. The awards system is listening
    // to all award events and implements all the necessary logic.
    //
    //  This solution is the Observer pattern.
    //
    //  The Observer pattern defines a one-to-many dependency between
    // objects, so that when one object changes state, all its
    // dependents are notified and updated automatically.

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer = new ConcreteObserver(subject);
        subject.attach(observer);
        subject.setState(1);

        // changes via subject.setState is propagated towards observer
        System.out.println(((ConcreteObserver) observer).getObserverState());

        subject.detach(observer);
        subject.setState(0);

        // observer is detached so changes are not propagated
        System.out.println(((ConcreteObserver) observer).getObserverState());
    }
}