package info.hexin.designpattern.behavioral.chainofresponsibility;

public interface Handler {
	public void setNext(Handler successor);

	public void handleRequest(Request request);
}
