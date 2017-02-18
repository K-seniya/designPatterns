package behavioural.state.model;

/**
 * Created by kseniya on 12/02/2017.
 */
public class FanLowState extends State {

    private Fan fan;

    public FanLowState(Fan fan){
        this.fan = fan;
    }

    public void handleRequest(){
        System.out.println("Turning fan to low");
        fan.setState(fan.getFanMedState());
    }

    public String toString(){
        return "Fan is low";
    }
}
