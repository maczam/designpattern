package info.hexin.designpattern.behavioral.memento;

public class Main {
	
	private static Originator o = new Originator();
	private static Caretaker c = new Caretaker();

	public static void main(String[] args) {
		o.setState("ON");
		c.saveMemento(o.CreateMemento());
		o.setState("OFF");
		o.restoreMemento(c.retrieveMemento());
		System.out.println(o.getState());
	}
}
