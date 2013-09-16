package info.hexin.designpattern.behavioral.strategy;

/**
 * 中级会员
 * 
 * @author ydhexin@gmail.com
 */
public class IntermediateMemberStrategy implements MemberStrategy {
	
	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("对于中级会员的扣头为10％");
		return booksPrice * 0.9;
	}

}
