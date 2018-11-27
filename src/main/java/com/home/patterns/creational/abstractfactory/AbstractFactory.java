package com.home.patterns.creational.abstractfactory;

import com.home.patterns.creational.abstractfactory.producta.AbstractProductA;
import com.home.patterns.creational.abstractfactory.productb.AbstractProductB;

/**
 *
 * Abstract Factory, defines interface for creation of the abstract product
 * objects
 *
 */
public interface AbstractFactory {

	AbstractProductA createProductA();

	AbstractProductB createProductB();
}
