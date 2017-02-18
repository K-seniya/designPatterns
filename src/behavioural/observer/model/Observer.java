package behavioural.observer.model;

public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
