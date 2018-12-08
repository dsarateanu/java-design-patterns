package com.home.patterns.structural.adapter;

public class Main {

//    Imagine that we need to develop a graphical editor which should
// be able to draw various graphical shapes like line, circle, rectangle and text.
// All of our graphical elements are subclass of the base class Shape. So, we will
// have LineShape, CircleShape, RectangeShape and TextShape.
//
//    The implementation of the TextShape is not easy. We need to implement a lot
// of complex functionalities, such as text buffering, text bolding, text coloring,
// undo, redo, ‘what you see is what you get’, etc. We have found an open source
// text library which implements pretty much all of the text functionality which
// we are looking for.
//
//    Why not adapt an existing text library, so that we can reuse already
// implemented functionality for our graphical editor? But, in order to use the
// existing text library, we must adapt interfaces from the existing text library
// to our interfaces.
//
//    The process of adaptation of the existing interfaces is an example of the Adapter pattern.
//
//    The adapter allows us to access the interface of an existing class from another interface.

    public static void main(String[] args) {

        // creates AdapterClass
        Target targetClass = new AdapterClass();

        System.out.println(targetClass.request());

        // creates AdapterObject
        Target targetObj = new AdapterObject(new Adaptee());

        System.out.println(targetObj.request());

    }
}
