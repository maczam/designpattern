package info.hexin.designpattern.creational.builder;

/**
 * Director 构造一个使用Builder接口的对象。 将制作过程组合
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
