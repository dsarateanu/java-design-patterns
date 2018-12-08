package com.home.patterns.behavioral.memento;

public class Main {

    //  Modern cars have brakes on all four wheels, operated by a hydraulic system.
    // The brakes may be disc type or drum type.
    //
    //  The front brakes play a greater part in stopping the car than the rear ones,
    // because braking throws the car weight forward on to the front wheels.
    //
    //  Many cars therefore have disc brakes, which are generally more efficient, at
    // the front, and drum brakes at the rear.
    //
    //  Imagine a scenario in which we need to replace the drum brakes at the rear
    // by ourselves? How do we ensure that the new drum brake has all the necessary
    // pieces in their proper places? One solution might be to use the Memento.
    //
    //  The drums are removed from both sides, exposing both the right and left brakes.
    // Only one side is disassembled and the other serves as a Memento of how the
    // brake parts fit together. The other side is disassembled only after the job
    // has been completed on one side. When the second side is disassembled, the first
    // side acts as the Memento.
    //
    //  Thus we have an example of the Memento design pattern. Memento design pattern
    // helps to restore an object’s state to it previous state.

    public static void main(String[] args) {
        // init state of the Originator
        Originator originator = new Originator();
        originator.setState(1);

        System.out.println(originator.getState());

        // Caretaker stores current state of the Originator
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        // change a Originator's state
        originator.setState(2);
        System.out.println(originator.getState());

        // undo Originator's initial state
        originator.setMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}