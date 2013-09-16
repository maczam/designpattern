package info.hexin.designpattern.behavioral.strategy;

/**
 * 价格抽象 不太和谐
 * 
 * @author ydhexin@gmail.com
 */
public class Price {
	// 持有一个具体的策略对象
	private MemberStrategy strategy;

	public Price(MemberStrategy strategy) {
		this.strategy = strategy;
	}

	public double quote(double booksPrice) {
		return this.strategy.calcPrice(booksPrice);
	}
}
