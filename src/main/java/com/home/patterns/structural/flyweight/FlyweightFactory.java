package com.home.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * FlyweightFactory, creates and manages the flyweight objects.
 *
 */
public class FlyweightFactory {

    private FlyweightFactory() {
    }

    private static Map<String, Flyweight> flyweights = new HashMap<>();

    /**
     * Returns Flyweight object. Just for sake of example following logic is
     * applied, if key starts with phrase:unshared than UnsharedConcreteFlyweight
     * object is created. Otherwise ConcreteFlyweight object is created.
     *
     * @param key
     * @return Flyweight
     *
     */
    public static Flyweight getFlyweight(String key, String value) {

        if (key.startsWith("unshared")) {
            flyweights.put(key, new UnsharedConcreteFlyweight(value));
        } else {
            if (!flyweights.containsKey(key)) {
                flyweights.put(key, new ConcreteFlyweight(value));
            }
        }

        return flyweights.get(key);
    }
}
