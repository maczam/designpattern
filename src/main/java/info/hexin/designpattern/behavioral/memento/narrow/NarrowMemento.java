package info.hexin.designpattern.behavioral.memento.narrow;

public interface NarrowMemento {
    public void narrowMethod();
}

class Originator {
    private String state;
    private NarrowMemento memento;

    public Originator() {
    }

    public NarrowMemento createMemento() {
        memento = new Memento(this.state);
        return memento;
    }

    public void restoreMemento(NarrowMemento memento) {
        Memento aMemento = (Memento) memento;
        this.setState(aMemento.getState());
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 内部类
    protected class Memento implements NarrowMemento {
        private String savedState;

        private Memento(String someState) {
            this.savedState = someState;
        }

        protected void setState(String someState) {
            this.savedState = someState;
        }

        protected String getState() {
            return savedState;
        }

        public void narrowMethod() {
            System.out.println("this is narrow method");
        }

    }

    public NarrowMemento getNarrowMemento() {
        return memento;
    }
}
