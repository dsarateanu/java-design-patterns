package com.home.patterns.structural.decorator;

/**
 *
 * Decorator, keep reference to Component object
 *
 */
abstract class Decorator implements Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }
}
