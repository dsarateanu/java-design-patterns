package com.home.patterns.structural.composite;

public class Main {

//    Imagine that we need to develop a graphical framework which should speed up the development
// of business applications, where the user works with data using graphical forms. A graphical form
// is made up of the basic graphical elements, such as label, text, input field, button, list, etc.
//
//    In order to draw something on the screen, each graphical element should implement a common
// interface with the draw method. But, in addition to the draw interface, some graphical elements
// must act as containers for other graphical elements. So, for example, a form is a container for
// labels, input fields and buttons.
//
//    It seems that a tree structure can be the basis for such a graphical framework, but the problem
// is that we must treat a leaf node and an internal node the same way. This problem can be solved by
// using the Composite pattern.
//
//    The Composite pattern composes objects into tree structures to represent part-whole hierarchies.
// A group of objects is to be treated the same way as a single instance of an object.

    public static void main(String[] args) {
        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");
        Component leaf3 = new Leaf("leaf3");

        Composite composite = new Composite();
        composite.add(leaf1);
        composite.add(leaf2);
        composite.add(leaf3);

        composite.operation();

        composite.remove(leaf1);

        composite.operation();
    }
}
