package behavioural.mediator;

import behavioural.mediator.model.*;

/**
 * Concepts: loose coupling, well-defined but complex, reusable components, hub/router.
 * Examples: java.util.Timer, java.lang.reflect.Method#invoke()
 *
 * Pitfalls:
 * deity object; limits subclassing; over or with command
 *
 * Contrast:
 * Mediator: defines interaction; object decoupling; more specific;
 * Observer: one to many; object decoupling; more generic
 *
 * Summary:
 * Loose coupling, simplified communication. mediator complexity, use with command
 */
public class Demo {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);

        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);

        turnOffAllLightsCommand.execute();
    }
}
