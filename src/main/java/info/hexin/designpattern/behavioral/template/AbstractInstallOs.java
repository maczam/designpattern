package info.hexin.designpattern.behavioral.template;

public abstract class AbstractInstallOs {

	abstract void formateDisk();

	void copyOs() {
		System.out.println("将ios文件copy到计算机中");
	}

	abstract void runInstall();

	void loginOs() {
		System.out.println("登录操作系统！");
	}

	public void installOs() {
		formateDisk();
		copyOs();
		runInstall();
		loginOs();
	}
}
