package info.hexin.designpattern.behavioral.strategy;

/**
 * 高级会员
 * 
 * @author ydhexin@gmail.com
 */
public class AdvancedMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {

		System.out.println("对于高等会员的扣头为20％");
		return booksPrice * 0.8;
	}
}
