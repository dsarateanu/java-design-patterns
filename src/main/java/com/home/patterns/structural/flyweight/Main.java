package com.home.patterns.structural.flyweight;

public class Main {

//    Let’s imagine that you are teaching youngsters programming. You decided to start
// with simple but exciting example, so during the course, a graphical editor which can
// draw a line will be developed.
//
//    The Base artifact is a Line class, with start and end point. Now a draw method needs
// to be implemented – and voila, our simple graphical editor is implemented. After using the editor
// for a while, we decide that a new feature should be implemented: in fact, we want our line to
// have basic colors.
//
//    The Line class will be extended with a new attribute (Color class), which holds information
// about the color, and the draw method will be extended accordingly. Now we have a new version
// of our editor, and some users want to test the editor to its limits, so they draw several thousand lines. Drawing several thousand lines means that we have several thousand Line objects in memory, but we also have several thousand Color objects in memory, even if our editor is drawing lines with basic colors only.
//
//    Can we use memory more efficiently? The Color objects include information that is duplicated.
// Why not set up a pool of basic color objects and share those colors when a Line object needs it?
//
//    The properties of the objects which are shared and are reasonably unchanging are moved into
// flyweight objects. For each of the Line objects which use the shared data, only a reference to
// the appropriate flyweight object is required. This will drastically reduce the memory used by
// each of the Line objects.
//
//    The solution used in explanation is an example of the Flyweight pattern. The Flyweight
// patterns remove duplicates and reduce memory by loading only the data necessary to perform action.

    public static void main(String[] args) {
        Flyweight flyweight1 = FlyweightFactory.getFlyweight("key1", "value1");
        Flyweight flyweight2 = FlyweightFactory.getFlyweight("key2", "value2");
        Flyweight flyweight3 = FlyweightFactory.getFlyweight("key1", "value3");

        Flyweight unsharedFlyweight1 = FlyweightFactory.getFlyweight("unsharedKey1", "value1");
        Flyweight unsharedFlyweight2 = FlyweightFactory.getFlyweight("unsharedKey2", "value2");
        Flyweight unsharedFlyweight3 = FlyweightFactory.getFlyweight("unsharedKey1", "value3");

        System.out.println(flyweight1.equals(flyweight2));
        System.out.println(flyweight1.equals(flyweight3));
        System.out.println(flyweight2.equals(flyweight3) + "\n");

        System.out.println(unsharedFlyweight1.equals(flyweight2));
        System.out.println(unsharedFlyweight1.equals(flyweight3));
        System.out.println(unsharedFlyweight2.equals(flyweight3) + "\n");

        if (flyweight1 instanceof ConcreteFlyweight) {
            System.out.println("value1".equals(((ConcreteFlyweight) flyweight1).getIntrinsicState()));
        }

        if (flyweight2 instanceof ConcreteFlyweight) {
            System.out.println("value2".equals(((ConcreteFlyweight) flyweight2).getIntrinsicState()));
        }

        if (flyweight2 instanceof ConcreteFlyweight) {
            System.out.println("value1".equals(((ConcreteFlyweight) flyweight3).getIntrinsicState()));
        }

        if (unsharedFlyweight1 instanceof ConcreteFlyweight) {
            System.out.println("value1".equals(((ConcreteFlyweight) unsharedFlyweight1).getIntrinsicState()));
        }

        if (unsharedFlyweight2 instanceof ConcreteFlyweight) {
            System.out.println("value2".equals(((ConcreteFlyweight) unsharedFlyweight2).getIntrinsicState()));
        }

        if (unsharedFlyweight3 instanceof ConcreteFlyweight) {
            System.out.println("value3".equals(((ConcreteFlyweight) unsharedFlyweight3).getIntrinsicState()));
        }
    }
}
