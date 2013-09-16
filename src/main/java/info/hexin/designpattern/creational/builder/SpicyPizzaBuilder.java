package info.hexin.designpattern.creational.builder;

/**
 * 构造不同的对象
 * 
 * @author hexin
 * 
 */
public class SpicyPizzaBuilder extends PizzaBuilder {

	public void buildDough() {
		pizza.setDough("pan baked");
		System.out.println(" 生产了 SpicyPizzaBuilder 的  Dough");
	}

	public void buildSauce() {
		pizza.setSauce("hot");
		System.out.println(" 生产了 SpicyPizzaBuilder 的  Sauce");
	}

	public void buildTopping() {
		pizza.setTopping("pepperoni+salami");
		System.out.println(" 生产了 SpicyPizzaBuilder 的  Topping");
	}

}
