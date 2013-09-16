package info.hexin.designpattern.behavioral.chainofresponsibility;

public class HelpRequest extends Request {

	public HelpRequest() {
	}

	@Override
	public void execute() {
		System.out.println(" 帮助请求 。。");
	}
}
