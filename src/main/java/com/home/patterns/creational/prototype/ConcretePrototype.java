package com.home.patterns.creational.prototype;

public class ConcretePrototype extends Prototype {

	/**
	 * Implements Prototype, meaning clone method.
	 */
	public Prototype copyMe() throws CloneNotSupportedException {
		return (Prototype) this.clone();
	}
}
