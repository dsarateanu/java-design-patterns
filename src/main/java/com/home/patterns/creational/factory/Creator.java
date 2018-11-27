package com.home.patterns.creational.factory;

/**
 * Creator class declares factory method
 */
abstract class Creator {

	abstract Product factoryMethod(String type);
}
