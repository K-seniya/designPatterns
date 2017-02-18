package behavioural.command.model;

import java.util.ArrayList;
import java.util.List;

/**
 * concrete command
 */
public class AllLightsCommand implements Command {

    private List<Light> lights;

    public AllLightsCommand(ArrayList<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for (Light light : lights) {
            if(light.isOn()){
                light.toggle();
            }

        }


    }
}
