package behavioural.command.model;

/**
 * receiver
 */
public class Light {

    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public  void toggle () {
        if(isOn) {
            off();
            isOn = false;
        }else{
            on();
            isOn = true;
        }
    }

    public void on() {
        isOn = true;
        System.out.println("Light switch on.");
    }

    public void off() {
        isOn = false;
        System.out.println("Light switch off.");
    }

}
