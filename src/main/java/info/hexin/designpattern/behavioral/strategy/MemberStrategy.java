package info.hexin.designpattern.behavioral.strategy;

/**
 * 会员计算价格
 * 
 * @author ydhexin@gmail.com
 */
public interface MemberStrategy {
	public double calcPrice(double booksPrice);
}
