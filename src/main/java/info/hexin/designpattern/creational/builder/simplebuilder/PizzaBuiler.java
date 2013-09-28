package info.hexin.designpattern.creational.builder.simplebuilder;

/**
 * 只有一个人知道披萨制作的整个过程，制作过程不能改变，不能构造复杂的对象。
 * 
 * @author hexin
 * 
 */
public class PizzaBuiler {

	Pizza pizza = new Pizza();

	public PizzaBuiler buildDough(String dough) {
		System.out.println(" 生产了dough ");
		pizza.setDough(dough);
		return this;
	}

	public PizzaBuiler buildSauce(String sauce) {
		System.out.println(" 生产了sauce ");
		pizza.setSauce(sauce);
		return this;
	}

	public PizzaBuiler buildTopping(String topping) {
		System.out.println(" 生产了topping ");
		pizza.setTopping(topping);
		return this;
	}

	public Pizza builder() {
		return pizza;
	}
}
