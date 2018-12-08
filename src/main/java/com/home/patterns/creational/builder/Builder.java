package com.home.patterns.creational.builder;

/**
 * Builder, declares interface for creating parts of a Product object
 */
interface Builder {

	Builder createProduct();

	Builder buildPart1(String part);

	Builder buildPart2(String part);
}
