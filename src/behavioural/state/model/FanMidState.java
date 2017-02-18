package behavioural.state.model;


public class FanMidState extends State{
    private Fan fan;

    public FanMidState(Fan fan){
        this.fan = fan;
    }

    public void handleRequest(){
        System.out.println("Turning fan to med");
        fan.setState(fan.getFanHighState());
    }

    public String toString(){
        return "Fan is medium";
    }
}
