package info.hexin.designpattern.behavioral.command;

public interface Command {

	/**
	 * 该命令的帮助
	 */
	void help();

	/**
	 * 执行命令
	 */
	void execute();
}
