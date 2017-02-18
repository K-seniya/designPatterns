package behavioural.command;

import behavioural.command.model.*;

import java.util.ArrayList;

//client
/**
 *Pitfalls:
 * Dependence on other patterns
 * Multiple commands
 * Make use of Memento
 * Prototype for copies
 *
 * Contrast:
 * command: object per command, class contains 'what', encapsulates actions
 * Strategy: object per strategy, class contains 'how', encapsulates algorithm
 *
 * encapsulates each request as an object
 * decouples sender from processor
 * very few drawbacks
 * often used for undo functionality
 */

public class Demo {

    public static void main(String[] args) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

//        command onCommand = new OnCommand(bedroomLight);
//        lightSwitch.storeAndExecute(onCommand);

        Command toggleCommand = new ToggleCommand(bedroomLight);
        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);

        ArrayList<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        Command allLightsCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
