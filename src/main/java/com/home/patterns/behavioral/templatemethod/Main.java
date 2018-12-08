package com.home.patterns.behavioral.templatemethod;

public class Main {

    //  Imagine that we need to implement an application which performs
    // various operations on a database. We decide to use JDBC, which
    // is a standard Java interface for accessing a relational database.
    // Using JDBC for database operations (for example, a read operation
    // via select SQL statement), the user must execute following steps:
    //
    //      connect to database
    //      execute SQL statement
    //      process data which are gathered from database
    //      close database connection
    //      handle errors if something goes wrong
    //
    //  If we implement such a database operation several times for various
    // read operations, we will find out that we are repeating some steps.
    // We can also see that some steps are always the same, i.e. ‘connect
    // to database’, ‘close database connection’, ‘handle errors’. The
    // remaining steps, such as ‘execute SQL statement’ and ‘process data
    // obtained from the database’ are different for each read operation.
    // So, let’s call those steps which are the same ‘invariant’ and
    // remaining steps ‘variant’.
    //
    //  We now implement invariant steps inside an abstract base class, while
    // the variant steps are either given a default implementation, or no
    // implementation at all. The variant steps represent “hooks”, or
    // “placeholders”, that may, or must, be supplied by the component’s
    // client in a concrete derived class.
    //
    //  The solution in the above example is the Template Method design pattern.
    //
    //  The Template Method defines a skeleton of an algorithm in an operation.
    // Algorithm will have a common part and a specialized part.

    public static void main(String[] args) {
        ConcreteClass template = new ConcreteClass();
        System.out.println(template.templateMethod());
    }
}