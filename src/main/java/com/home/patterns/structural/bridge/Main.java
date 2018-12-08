package com.home.patterns.structural.bridge;

public class Main {

//    Let’s say that that we want to develop an audio player on our Windows OS. We define the base
// class, Audio, which has two subclasses – MP3Audio and WavAudio. The first version of the player
// on Windows is running well, but after some time we want to implement the same player on Linux OS.
//
//    How do we tackle this situation?
//
//    If we incorporate the OS specifics in our hierarchy, we will end up with 4 class combinations,
// such as WindowsMP3Audio, LinuxMP3Audio, WindowsWavAudio and LinuxWavAudio. Adding more codec types
// and more operating systems will make the hierarchy even larger.
//
//    The appropriate solution would be to extract our structure into two separate hierarchies.
//
//    The original audio structure classes will remain the same, and they will contain a reference
// to an object of the new hierarchy, the OS hierarchy. This way we will extract the OS specifics
// into a class of its own, with two child classes, Windows and Linux. The Audio class will get a
// reference field to one of the OS classes. Using that reference, it will be able to delegate work
// to OS objects when needed. This reference will serve as a bridge between the Audio and OS
// hierarchies.
//
//    The explained solution is an example of the Bridge pattern.
//
//    The bridge pattern decouples an abstraction from its implementation, so that the two can vary
// independently.

    public static void main(String[] args) {

        // creates refined abstraction with concreteimplementorA
        RefinedAbstraction refinedAbstractionA = new RefinedAbstraction(
                new ConcreteImplementorA());
        // invokes operation
        System.out.println("com.home.patterns.structural.bridge.ConcreteImplementorA".equals(refinedAbstractionA.operation()));

        // creates refined abstraction with concreteimplementorB
        RefinedAbstraction refinedAbstractionB = new RefinedAbstraction(
                new ConcreteImplementorB());

        // invokes operation
        System.out.println("com.home.patterns.structural.bridge.ConcreteImplementorB".equals(refinedAbstractionB.operation()));
    }
}
