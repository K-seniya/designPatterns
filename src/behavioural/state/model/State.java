package behavioural.state.model;

public abstract class State {

    public void handleRequest(){
        System.out.println("Should not be able to get here");
    }
}
