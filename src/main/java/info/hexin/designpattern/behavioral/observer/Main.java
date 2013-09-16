package info.hexin.designpattern.behavioral.observer;

public class Main {
	public static void main(String[] args) {
		Product p = new Product();
		PriceObserver po = new PriceObserver(p.getPrice());
		p.addObserver(po);
		p.setPrice(3.0);
		p.setPrice(3.1);
	}
}
