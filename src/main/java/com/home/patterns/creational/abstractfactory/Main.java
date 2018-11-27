package com.home.patterns.creational.abstractfactory;

import com.home.patterns.creational.abstractfactory.producta.ProductA1;
import com.home.patterns.creational.abstractfactory.productb.ProductB1;

public class Main {

	//	Imagine that we are developing a framework for a GUI environment, were windows will be drawn on a display
	// device and the user will interact with the GUI using a mouse and a keyboard.
	//
	//	The first version of the framework will support Windows OS, so Factory method is used for creation of the
	// graphical abstractions like Frame, Window, ScrollBar, etc.
	//
	//	In the next version, the framework will be extended to Linux OS. So, how should we extend our factory method?
	//
	//	One way would be to introduce factory abstraction, where each OS will have dedicated factory for creation of
	// the graphical abstractions. The proposed solution is an example of the Abstract Factory.
	//
	//	The Abstract Factory is one level higher in abstraction than the Factory Method. The Factory Method abstracts
	// the way objects are created, while the Abstract Factory also abstracts the way factories are created,
	// which in turn abstracts the way objects are created.
	//
	//	The Abstract Factory provides an interface for creating families of related objects, without specifying
	// concrete classes.

	public static void main(String[] args) {
		AbstractFactory abstractFactory1 = new ConcreteFactory1();
		AbstractFactory abstractFactory2 = new ConcreteFactory2();

		System.out.println(abstractFactory1.createProductA() instanceof ProductA1);
		System.out.println(abstractFactory1.createProductB() instanceof ProductB1);

		System.out.println(abstractFactory2.createProductA() instanceof ProductA1);
		System.out.println(abstractFactory2.createProductB() instanceof ProductB1);
	}
}
