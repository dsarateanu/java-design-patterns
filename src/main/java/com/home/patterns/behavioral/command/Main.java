package com.home.patterns.behavioral.command;

public class Main {

	//	Imagine that we are developing a graphical editor. The user can add new text, delete or update existing text.
	// What to do in a case when user does something wrong? The user should be able to return back to the state of
	//the text before the wrong action has been executed.
	//	How to implement such behavior?
	//	One solution would be to hold a list of the text states. If the text is long and if we store a lot of states
	// of such a long text, we can run out of memory, so this solution is not appropriate for our particular scenario.
	//What if we consider an idea where the current state of text is a result of execution of a sequence of operations?
	// These operations can be undone, with the effect that the text reverts to a previous state. The operations that
	//have been undone become redoable, so that later model states can be reached again if necessary. So, we will no
	//longer invoke operations on the text directly, but we will create Command objects, which invoke the operations.
	//	Each text operation will have the appropriate Command object.
	//	This solution is a Command pattern. The Command pattern issues requests to objects without knowing anything
	//about the operation being requested or about the receiver of the request.

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker(command);

		// operation on receiver is not performed
		System.out.println(receiver.isOperationPerfomed());

		// this will invoke method action on receiver
		invoker.execute();

		// operation on receiver is performed
		System.out.println(receiver.isOperationPerfomed());
	}
}
