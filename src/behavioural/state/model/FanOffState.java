package behavioural.state.model;

public class FanOffState extends State {

    private Fan fan;

    public FanOffState(Fan fan){
        this.fan = fan;
    }

    public void handleRequest(){
        System.out.println("Turning fan to low");
        fan.setState(fan.getFanLowState());
    }

    public String toString(){
        return "Fan is off";
    }
}
