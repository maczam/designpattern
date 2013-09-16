package info.hexin.designpattern.creational.builder;

/**
 * 构造不同的对象
 * 
 * @author hexin
 * 
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {

	public void buildDough() {
		pizza.setDough("cross");
		System.out.println(" 生产了 HawaiianPizzaBuilder 的  Dough");
	}

	public void buildSauce() {
		pizza.setSauce("mild");
		System.out.println(" 生产了 HawaiianPizzaBuilder 的  Sauce");
	}

	public void buildTopping() {
		pizza.setTopping("ham+pineapple");
		System.out.println(" 生产了 HawaiianPizzaBuilder 的  Topping");
	}

}
