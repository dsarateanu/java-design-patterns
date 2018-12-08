package com.home.patterns.behavioral.state;

public class Main {

    //  Imagine that we need to implement a state machine. We begin
    // with a few states, and a few simple conditions for those states.
    // Our initial State machine is implemented using if/else blocks,
    // which are checking the current state and which perform the
    // appropriate actions.
    //
    //  But, the number of states gradually increases over time.
    // In addition, the conditions for reaching certain states become
    // more complex. Our ‘if/else’ based state machine has more and more
    // ‘if/else’ blocks and it becomes really difficult to maintain and
    // debug such a code base.
    //
    //  Is there a more elegant way to implement the State Machine?
    //
    //  Another approach would be that, for every possible state, a
    // separate class is implemented over a common interface, with
    // the state related behavior. The Context class will contain a
    // reference to a state object, which represents its current state.
    // Instead of acting on its own, the context will delegate the
    // execution to the state object. To change the state of the context,
    // one would pass another state object to the context.
    //
    //  This solution is an example of the State pattern.
    //
    //  The State pattern allows an object to alter its behavior when its
    // internal state changes.

    public static void main(String[] args) {
        State state1 = new ConcreteState1();
        State state2 = new ConcreteState2();

        System.out.println(((ConcreteState1) state1).isHandleInvoked());
        System.out.println(((ConcreteState2) state2).isHandleInvoked());

        Context context = new Context();
        context.setState(state1);
        context.request();

        System.out.println(((ConcreteState1) state1).isHandleInvoked());

        context.setState(state2);
        context.request();

        System.out.println(((ConcreteState2) state2).isHandleInvoked());
    }
}
