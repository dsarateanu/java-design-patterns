package com.home.patterns.creational;

import java.sql.Connection;

public class SingletonPattern {

	private static volatile SingletonPattern instance = null;

	private SingletonPattern(){
		// if it's used reflection to call private constructor
		if(instance != null){
			throw new RuntimeException("Use getInstance() method to create");
		}
	}

	public static SingletonPattern getInstance(){
		if(instance == null){
			// used to be threadsafe
			synchronized (SingletonPattern.class){
				if(instance == null){
					instance = new SingletonPattern();
				}
			}
		}
		return instance;
	}

}
