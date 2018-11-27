package com.home.patterns.creational.factory;

public class Main {

	//	Imagine that we need to develop a reporting library. Two basic abstractions in this library are the
	// Engine and the Report classes. Both classes are abstract, and clients have to extend them in order
	// to realize their application specific implementations.
	//
	//	The Engine class is responsible for managing Reports and will create them as required. Report subclasses
	// which Engine should instantiate are application specific and Engine only knows when a new report should
	// be created, but not what type of Report to create. This leads us to a situation in which our library
	// should instantiate classes, but it only knows about abstract classes, which it cannot instantiate.
	//
	//	So, how can we solve this?
	//
	//	If we encapsulate the knowledge of which Report subclasses to create and move this knowledge outside
	// of the library, then Engine subclass will be able to create Report objects. This solution is the Factory Method pattern.
	//
	//	The Factory Method defines an interface for creating objects, but lets subclasses decide which class to instantiate.

	public static void main(String[] args) {
		Creator factory = new ConcreteCreator();

		Product productA = factory.factoryMethod("A");
		Product productB = factory.factoryMethod("B");

		System.out.print(productA instanceof ConcreteProductA);
		System.out.print(productB instanceof ConcreteProductB);
	}
}
