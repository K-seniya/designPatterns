package behavioural.command.model;

/**
 * invoker
 */
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
