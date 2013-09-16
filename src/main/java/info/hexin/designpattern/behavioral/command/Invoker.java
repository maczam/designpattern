package info.hexin.designpattern.behavioral.command;

/**
 * 命令的执行者
 * 
 * @author ydhexin@gmail.com
 * 
 */
public class Invoker {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public Invoker() {
		super();
	}


	public Invoker(Command command) {
		super();
		this.command = command;
	}

	public void executeCommand() {
		command.execute();
	}
}
