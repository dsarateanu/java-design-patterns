package com.home.patterns.behavioral.iterator;

/**
 * ConcreteAgregate implements the Iterator creation interface to return an
 * instance of the proper ConcreteIterator.
 */
public class ConcreteAggregate implements Aggregate {

    private static final String[] records = {"first", "second", "third", "fourth"};

    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    protected String[] getRecords() {
        return records;
    }
}
