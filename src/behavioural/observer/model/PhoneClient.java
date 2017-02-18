package behavioural.observer.model;

public class PhoneClient extends Observer{
    public PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Phone stream: " + subject.getState());
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from phone");
    }
}
