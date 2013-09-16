package info.hexin.designpattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * 
 * @author ydhexin@gmail.com
 */
public class PriceObserver implements Observer {
	private double price;

	public PriceObserver(double price) {
		this.price = price;
	}

	public void update(Observable ob, Object obj) {
		double pri = (Double) obj;
		if (pri > 1.1 * price) {
			System.out.println("通货膨胀");
		} else {
			System.out.println("物价正常");
		}
		this.price = pri;
	}
}
