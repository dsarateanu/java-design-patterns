package com.home.patterns.creational.prototype;

public class Main {

	//	In Singleton pattern we saw how to tackle the situation when we should instantiate a single object of a class.
	// However, we may have a situation when, during runtime, we want to copy an object which already exists in
	// memory, particularly if the object is complex.
	//
	//	So, imagine that we are developing software which can work with spreadsheets. A spreadsheet consist of cells,
	// and a cell is a complex object with lot of attributes, such as borders, content, format, color, etc.
	// Now, if we want to split a cell, we can develop a method which will copy each attribute of that object.
	// This method can became very complex, so we should consider a more elegant solution. It would be nice if
	// we could copy an object with a single method, for example cloneMe().
	//
	//	Such solution is a Prototype pattern.

	public static void main(String[] args) throws CloneNotSupportedException {
		// creates object of type Prototype
		Prototype prototype = new ConcretePrototype();
		// creates Client object(Prototype is "injected" via Constructor)
		Client client = new Client(prototype);

		// client creates new object(clone it self) of type Prototype
		Prototype prototypeClone = client.operation();

		// ensure that prototype and it's own clone are not same objects
		System.err.print(prototype.equals(prototypeClone));
	}
}
