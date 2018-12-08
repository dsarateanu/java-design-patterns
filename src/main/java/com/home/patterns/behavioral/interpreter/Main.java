package com.home.patterns.behavioral.interpreter;

public class Main {

    public static void main(String[] args) {

        // testAnd1Expression
        test(false, false, "and");

        // testAnd2Expression
        test(false, true, "and");

        // testAnd3Expression
        test(true, false, "and");

        // testAnd4Expression
        test(true, true, "and");

        // testOr1Expression
        test(false, false, "or");

        // testOr2Expression
        test(false, true, "or");

        // testOr3Expression
        test(true, false, "or");

        // testOr4Expression
        test(true, true, "or");

    }

    private static void test(boolean terminalExpression1, boolean terminalExpression2, String expressionType) {
        Context context = new Context();

        // interpret true & true expression
        TerminalExpression firstTerminalExpression = new TerminalExpression(terminalExpression1);
        TerminalExpression secondTerminalExpression = new TerminalExpression(terminalExpression2);

        if (expressionType.equals("and")) {
            AndExpression andExpression = new AndExpression(firstTerminalExpression, secondTerminalExpression);
            andExpression.interpret(context);
        } else if (expressionType.equals("or")) {
            OrExpression orExpression = new OrExpression(firstTerminalExpression, secondTerminalExpression);
            orExpression.interpret(context);
        } else {
            System.out.println("Expression type " + expressionType + " not exists");
            return;
        }

        System.out.println("Result for expression " + expressionType + " with values "
                + terminalExpression1 + ", " + terminalExpression2 + ": " + context.isResult());
    }
}
