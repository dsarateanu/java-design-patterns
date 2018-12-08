package com.home.patterns.behavioral.command;

/**
 *
 * Receiver class, knows how to perform the operations associated with carrying
 * out a request
 *
 */
public class Receiver {

    private boolean operationPerformed = false;

    public void action() {
        operationPerformed = true;
    }

    protected boolean isOperationPerformed() {
        return operationPerformed;
    }
}
