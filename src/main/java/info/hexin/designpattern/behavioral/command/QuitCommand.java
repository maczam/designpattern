package info.hexin.designpattern.behavioral.command;

/**
 * 
 * @author ydhexin@gmail.com
 * 
 */
public class QuitCommand implements Command {

	@Override
	public void help() {
		System.out.println("推出命令");
	}

	@Override
	public void execute() {
		System.out.println("程序退出");
		System.exit(0);
	}
}
