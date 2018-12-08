package com.home.patterns.creational.factory;

/**
 * Creator class declares factory method
 */
interface Creator {

	Product factoryMethod(String type);
}
