package info.hexin.designpattern.creational.builder;

/**
 * 
 * ConcreteBuilder
 * <p>
 * 实现Builder的接口以构造和装配该产品的各个部件，定义并明确它所创建的表示，并提供一个检索产品的接口。
 * <p>
 * @author hexin
 * 
 */
public abstract class PizzaBuilder {

	protected Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	public void createNewPizzaProduct() {
		pizza = new Pizza();
	}

	public abstract void buildDough();

	public abstract void buildSauce();

	public abstract void buildTopping();
}
