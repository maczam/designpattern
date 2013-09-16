package info.hexin.designpattern.behavioral.command;

public class Main {
	public static void main(String[] args) {
		// 命令执行者
		Invoker invoker = new Invoker();
		Command command = new QuitCommand();
		// 给命令执行者命令， 执行。。。这里少了命令的接受者
		invoker.setCommand(command);
		invoker.executeCommand();
	}
}
