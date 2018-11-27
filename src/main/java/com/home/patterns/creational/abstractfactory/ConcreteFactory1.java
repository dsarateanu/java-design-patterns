package com.home.patterns.creational.abstractfactory;

import com.home.patterns.creational.abstractfactory.producta.AbstractProductA;
import com.home.patterns.creational.abstractfactory.producta.ProductA1;
import com.home.patterns.creational.abstractfactory.productb.AbstractProductB;
import com.home.patterns.creational.abstractfactory.productb.ProductB1;

/**
 *
 * ConcreteFactory1, implements creation of the concrete Product1 objects
 *
 */
public class ConcreteFactory1 implements AbstractFactory {

	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	public AbstractProductB createProductB() {
		return new ProductB1();
	}
}
