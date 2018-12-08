package com.home.patterns.behavioral.interpreter;

/**
 *
 * AbstractExpresion defines interface for interpretation. Interface must be
 * used by TerminalEpression and NonTerminalEpression.
 *
 */
interface AbstractExpression {

	void interpret(Context context);

}
