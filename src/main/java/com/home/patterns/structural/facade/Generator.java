package com.home.patterns.structural.facade;

/**
 * Generator, supposed to generate binary code, but in this case acts as a
 * calculator which adds two numbers.
 */
public class Generator {

    private Generator() {
    }

    public static int generate(Node expression) throws Exception {

        if (expression instanceof ExpressionNode) {
            ExpressionNode expressionNode = (ExpressionNode) expression;

            OperandNode rightOperandNode = (OperandNode) expressionNode.getRight();
            OperandNode leftOperandNode = (OperandNode) expressionNode.getLeft();
            return rightOperandNode.getValue() + leftOperandNode.getValue();

        } else {
            throw new Exception("Error in generator");
        }
    }
}
