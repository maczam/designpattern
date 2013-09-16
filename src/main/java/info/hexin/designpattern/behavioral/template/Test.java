package info.hexin.designpattern.behavioral.template;

public class Test {
	public static void main(String[] args) {
		AbstractInstallOs installOs = new WindosInstall();
		installOs.installOs();
	}
}
