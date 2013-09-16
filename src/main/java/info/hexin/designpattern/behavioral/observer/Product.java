package info.hexin.designpattern.behavioral.observer;

import java.util.Observable;

/**
 * 被观察者
 * 
 * @author ydhexin@gmail.com
 */
public class Product extends Observable {
	private double price = 2.0;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setPrice");
		this.price = price;
		this.setChanged();
		this.notifyObservers(price);// 找2个方法次序不能换
	}
}
