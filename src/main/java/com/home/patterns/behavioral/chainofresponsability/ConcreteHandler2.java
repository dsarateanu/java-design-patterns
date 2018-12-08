package com.home.patterns.behavioral.chainofresponsability;

public class ConcreteHandler2 extends Handler {

    private boolean handleRequestInvoked = false;

    void handleRequest() {
        handleRequestInvoked = true;
    }

    protected boolean isHandleRequestInvoked() {
        return handleRequestInvoked;
    }

}
