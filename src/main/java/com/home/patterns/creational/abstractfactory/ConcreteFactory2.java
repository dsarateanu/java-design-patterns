package com.home.patterns.creational.abstractfactory;

import com.home.patterns.creational.abstractfactory.producta.AbstractProductA;
import com.home.patterns.creational.abstractfactory.producta.ProductA2;
import com.home.patterns.creational.abstractfactory.productb.AbstractProductB;
import com.home.patterns.creational.abstractfactory.productb.ProductB2;

/**
 *
 * ConcreteFactory2, implements creation of the concrete Product2 objects
 *
 */
public class ConcreteFactory2 implements AbstractFactory {

	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	public AbstractProductB createProductB() {
		return new ProductB2();
	}
}
