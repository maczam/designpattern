package info.hexin.designpattern.creational.builder;

/**
 * Director
 * <p>
 * 构造一个使用Builder接口的对象。
 * </p>
 * 
 * @author hexin
 * 
 */
public class Waiter {

	private PizzaBuilder pizzaBuilder;

	public void setPizzaBuilder(PizzaBuilder pb) {
		pizzaBuilder = pb;
	}

	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

	public void constructPizza() {
		pizzaBuilder.createNewPizzaProduct();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}
}
