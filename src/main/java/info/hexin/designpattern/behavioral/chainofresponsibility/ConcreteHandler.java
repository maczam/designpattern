package info.hexin.designpattern.behavioral.chainofresponsibility;

public class ConcreteHandler implements Handler {
	private Handler successor;

	public ConcreteHandler() {
	}

	// 下一个
	public void setNext(Handler successor) {
		this.successor = successor;
	}

	@Override
	public void handleRequest(Request request) {
		if (request instanceof HelpRequest) {
			request.execute();
		} else {
			successor.handleRequest(request);
		}
	}
}
