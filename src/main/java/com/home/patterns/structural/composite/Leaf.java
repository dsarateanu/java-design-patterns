package com.home.patterns.structural.composite;

/**
 *
 * Leaf class represents leaf objects in the composition
 *
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void operation() {
        System.out.println(this.name);
    }
}
