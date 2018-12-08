package com.home.patterns.structural.adapter;

/**
 *
 * Adapter class, adapts Adaptee to the Target interface
 *
 */
public class AdapterClass extends Adaptee implements Target {

        public String request() {
            return this.specialRequest();
        }
}
