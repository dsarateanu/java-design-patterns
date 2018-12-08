package com.home.patterns.behavioral.iterator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();

        Iterator iterator = aggregate.createIterator();
        System.out.println(Arrays.toString(((ConcreteAggregate) aggregate).getRecords()));
        System.out.println("--------");
        System.out.println(iterator.first());
        System.out.println(iterator.currentItem());
        System.out.println(iterator.isDone());
        System.out.println("--------");
        System.out.println(iterator.next());
        System.out.println(iterator.currentItem());
        System.out.println(iterator.isDone());
        System.out.println("--------");
        System.out.println(iterator.next());
        System.out.println(iterator.currentItem());
        System.out.println(iterator.isDone());
        System.out.println("--------");
        System.out.println(iterator.next());
        System.out.println(iterator.currentItem());
        System.out.println(iterator.isDone());
    }
}
