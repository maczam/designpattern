package info.hexin.designpattern.behavioral.strategy;

/**
 * 初级会员计算价格
 * 
 * @author ydhexin@gmail.com
 */
public class PrimaryMemberStrategy implements MemberStrategy {
	
	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("对于初级会员的没有扣头");
		return booksPrice;
	}
}
