package behavioural.mediator.model;

/**
 * Created by kseniya on 05/02/2017.
 */
public class TurnOffAllLightsCommand implements Command {

    private Mediator mediator;

    public TurnOffAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();

    }
}
