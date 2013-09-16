package info.hexin.designpattern.behavioral.memento.narrow;

public class Main {
	private static Originator o = new Originator();
	private static Caretaker c = new Caretaker();

	public static void main(String[] args) {
		// use wide interface
		o.setState("On");
		c.saveMemento(o.createMemento());
		o.setState("Off");
		o.restoreMemento(c.retrieveMemento());
		// use narrow interface
		NarrowMemento memento = o.getNarrowMemento();
		memento.narrowMethod();

	}
}
