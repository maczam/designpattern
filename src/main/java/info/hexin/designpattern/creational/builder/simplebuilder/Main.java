package info.hexin.designpattern.creational.builder.simplebuilder;

public class Main {
	public static void main(String[] args) {
		Pizza pizza = new PizzaBuiler().buildDough("Dough").buildSauce("Sauce")
				.buildTopping("Topping").builder();
		System.out.println(pizza.toString());
	}
}
