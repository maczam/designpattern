package info.hexin.designpattern.creational.builder;

/**
 * 
 * @author hexin
 * 
 */
public class Main {
	public static void main(String[] args) {
		//组装器
		Waiter waiter = new Waiter();
		//样式
		PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		// PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

		waiter.setPizzaBuilder(hawaiianPizzaBuilder);
		//组合
		waiter.constructPizza();

		Pizza pizza = waiter.getPizza();
		System.out.println(pizza.toString());
	}
}
