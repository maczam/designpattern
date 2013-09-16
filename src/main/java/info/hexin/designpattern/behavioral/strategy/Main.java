package info.hexin.designpattern.behavioral.strategy;

public class Main {
	public static void main(String[] args) {
		// 选择并创建须要应用的策略对象
		MemberStrategy strategy = new AdvancedMemberStrategy();
		// 创建景象
		Price price = new Price(strategy);
		// 策画价格
		double quote = price.quote(300);
		System.out.println("图书的终极价格为：" + quote);

	}
}
