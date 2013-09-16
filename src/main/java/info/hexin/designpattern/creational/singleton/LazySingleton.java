package info.hexin.designpattern.creational.singleton;

/**
 * <p>
 * 懒汉式单例
 * <p>
 * 在类加载的时候不创建单例实例。只有在第一次请求实例的时候的时候创建，并且只在第一次创建后， 以后不再创建该类的实例。
 * 
 * @author ydhexin@gmail.com
 */
public class LazySingleton {
	private static LazySingleton intance = null;

	/**
	 * 方法锁每次获取都需要进行枷锁
	 * 
	 * @return
	 */
	public synchronized static LazySingleton getInstance() {
		if (intance == null) {
			intance = new LazySingleton();
		}
		return intance;
	}

	/**
	 * 优化内部结构，将锁放到方法里面。这样锁的使用效果是第一次初始化的时候才加锁
	 * <p>
	 * 双重检查锁存在问题：http://copperfield.iteye.com/blog/1316870
	 * </p>
	 * 双重检查锁定背后的理论是完美的。不幸地是，现实完全不同。双重检查锁定的问题是：并不能保证它会在单处理器或多处理器计算机上顺利运行。
	 * 双重检查锁定失败的问题并不归咎于 JVM 中的实现 bug，而是归咎于 Java
	 * 平台内存模型。内存模型允许所谓的“无序写入”，这也是这些习语失败的一个主要原因。
	 * 这个方式是不错误的。应该放弃掉这种方式。
	 * 
	 * @return
	 */
	public static LazySingleton getInstance1() {
		if (intance == null) {
			synchronized (LazySingleton.class) {
				if (intance == null) {
					intance = new LazySingleton();
				}
			}
		}
		return intance;
	}
}
