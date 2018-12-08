package com.home.patterns.structural.decorator;

public class Main {

//    Suppose that we are working on a user interface toolkit and we want to be able to add borders
// and scroll bars to the windows. If we use inheritance, we will extend Window class with new classes,
// such as WindowVerticalScrollBar, WindowHorizontalScrollBar, WindowBorder, etc.
//
//    The solution with the inheritance is not flexible, since we will end up with too many subclasses.
// Such a hierarchy is difficult to maintain, difficult to extend and difficult to use.
//
//            But, if we enclose a window in an object which can add new features, such as scroll bar
// and border dynamically, we will have a much more flexible solution. The “enclosed” object is a
// decorator.
//
//    The Decorator pattern attaches additional responsibilities to an object dynamically.

    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        Decorator decoratorA = new ConcreteDecoratorA();
        decoratorA.setComponent(component);
        decoratorA.operation();

        System.out.println(((ConcreteDecoratorA) decoratorA).isState());

        Decorator decoratorB = new ConcreteDecoratorB();
        decoratorB.setComponent(component);

        System.out.println(((ConcreteDecoratorB) decoratorB).isBehaviorMethodInvoked());

        decoratorB.operation();

        System.out.println(((ConcreteDecoratorB) decoratorB).isBehaviorMethodInvoked());

    }
}
