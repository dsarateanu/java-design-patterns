package com.home.patterns.creational.factory;

/**
 *
 * ConcreteCreator class returns an instance of the ConcreteProduct
 *
 */
public class ConcreteCreator implements Creator {

	public Product factoryMethod(String type) {

		if (type.equals("A")) {
			return new ConcreteProductA();
		} else if (type.equals("B")) {
			return new ConcreteProductB();
		}

		return null;
	}
}
