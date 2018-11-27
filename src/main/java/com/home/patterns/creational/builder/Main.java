package com.home.patterns.creational.builder;

public class Main {

	//	The Builder, as the name suggests, builds complex objects from simple ones, step-by-step.
	//
	//	Let’s say we order a child meal at a fast food restaurant. What is it comprised of?
	// Well, a burger, a cold drink, fries and a toy. In fact, a child meal consist of a main item,
	// a side item, a drink and a toy.
	//
	//	Every time a child meal is ordered, the service boy will take a burger, fries, a cold drink
	// and a toy. Now suppose that there are 3 types of burgers available – Cheese, Beef and Chicken,
	// 2 types of cold drinks available – Cola and Orange, and 2 types of toys available – a car
	// and a doll.
	//
	//	So, the order might be a combination of one of these, but the process of building a
	// child meal will be the same. One burger, one cold drink, fries and one toy. All these items
	// are placed in a paper bag, which is given to the customer. The process of producing a child meal
	// is an example of the Builder pattern.
	//
	//	The Builder pattern separates construction of a complex object from its representation, so
	// that the same construction process can create different representations.

	public static void main(String[] args) {
		// creates object of type ConcreteBuilder
		ConcreteBuilder builder = new ConcreteBuilder();
		// creates object of type Director
		Director director = new Director(builder);
		// Director constructs a Product
		director.construct();
		// get Product from builder
		Product product = builder.getResult();

		System.err.print(product.getPart1().equals("part1"));
		System.err.print(product.getPart2().equals("part2"));
	}
}
