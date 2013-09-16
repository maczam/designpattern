package info.hexin.designpattern.creational.singleton;

/**
 * <p>
 * 饿汉式单例
 * </p>
 * 在类被加载的时候，唯一实例已经被创建。这个设计模式在Java中容易实现，在别的语言中难以实现。
 * 
 * @author ydhexin@gmail.com
 */
public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
		// 获取需要使用的配置文件等
	}

	public static EagerSingleton getInstance() {
		return instance;
	}

}
