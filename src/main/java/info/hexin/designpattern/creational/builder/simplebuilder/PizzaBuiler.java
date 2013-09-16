package info.hexin.designpattern.creational.builder.simplebuilder;

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
	
	public Pizza builder(){
		return pizza;
	}
}
