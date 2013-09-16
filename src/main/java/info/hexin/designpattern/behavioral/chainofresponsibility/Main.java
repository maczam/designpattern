package info.hexin.designpattern.behavioral.chainofresponsibility;

public class Main {
	public static void main(String[] args) {
		Request request = new HelpRequest();

		Handler handler = new ConcreteHandler();
		// handler.setNext(successor)
		handler.handleRequest(request);
	}
}
