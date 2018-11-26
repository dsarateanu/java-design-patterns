package com.home.patterns.creational;

public class Main {

	public static void main(String[] args) {
		Runtime singletonRuntime = Runtime.getRuntime();

		singletonRuntime.gc();

		System.out.println(singletonRuntime);

		Runtime anotherSingletonRuntime = Runtime.getRuntime();

		System.out.println(anotherSingletonRuntime);

		if(singletonRuntime == anotherSingletonRuntime){
			System.out.print("They are the same instance");
		}

		System.out.println();

		SingletonPattern instance = SingletonPattern.getInstance();

		System.out.println(instance);

		SingletonPattern anotherInstance = SingletonPattern.getInstance();

		System.out.println(anotherInstance);

		if(instance == anotherInstance){
			System.out.print("They are the same instance");
		}
	}

}
