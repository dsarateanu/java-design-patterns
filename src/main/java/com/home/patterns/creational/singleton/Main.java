package com.home.patterns.creational.singleton;

public class Main {

	//	Objects reside inside heap memory, and we can instantiate as many objects as the physical space in the heap
	// memory will allow. But, in some cases, we can have a situation when only one instance of a class can be
	// instantiated. So, imagine that we are developing a program which is playing audio files. Inside that program,
	// we need to have a class which handles audio output. A computer usually has one audio output, so no more
	// than one sound can be played at a time. Therefore, a class that handles the computer audio device should
	// have exactly one instance.
	//
	//	How can we ensure that only one instance is created? Each java class has default public constructor, which
	// can be invoked from any part of the code. If we implement a class where default constructor has scope
	// ‘private’, then only the methods from that class can invoke that constructor, meaning that we can’t
	// instantiate that class from other classes. This is a basis of the Singleton pattern.
	//
	//	The Singleton ensures that only one (single) object can be created from the class.

	public static void main(String[] args) {
		// invokes Singleton.getInstance() for first time,
		// object will be created
		Singleton singleton = Singleton.getInstance();
		System.err.println(singleton);

		// invokes Singleton.getInstance() for second time,
		// reference to the same object will be returned
		Singleton secondSingleton = Singleton.getInstance();
		System.err.println((singleton.equals(secondSingleton)));
	}
}
