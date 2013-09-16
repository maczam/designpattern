package info.hexin.designpattern.behavioral.template;

public class WindosInstall extends AbstractInstallOs {

	@Override
	void runInstall() {
		System.out.println("运行windos操作系统安装程序！！！");
	}

	@Override
	void formateDisk() {
		System.out.println("windos 格式话硬盘！！");
	}
}
