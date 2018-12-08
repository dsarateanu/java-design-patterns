package com.home.patterns.structural.facade;

public class Main {

//    Let’s say that we need to develop a compiler for a brand new programming language.
//
//    The compiling process consist of steps, such as scanning, tokenizing, parsing, building
// abstract syntax tree, code generation, etc. We need to develop a separate subcomponent for
// each step. In principle, each subcomponent is complex, and the usage of subcomponents is
// complex as well.
//
//    It does not make sense for a client which wants to compile code to invoke complex
// subcomponents in order to compile.
//
//    A better approach would be to define a uniform interface which presents the compiler
// functionality – a Compiler class. The Compiler class hides “low-level” functionality from
// the client, so we can say that Compiler class is a facade.
//
//    The Facade design pattern hides the complexity of a system and provides an interface to
// the client through which the client can access the system.

    public static void main(String[] args) throws Exception {
        // Compiler class is a facade, it can add two numbers with following
        // expression: 1 + 2
        // all other operations are not supported
        System.out.println(Compiler.compile("1 + 2"));

        try {
            // right operand is not a number
            Compiler.compile("1 + x");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            // - expression is not supported
            Compiler.compile("1 - 1");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
