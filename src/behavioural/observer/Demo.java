package behavioural.observer;


import behavioural.observer.model.MessageStream;
import behavioural.observer.model.PhoneClient;
import behavioural.observer.model.Subject;
import behavioural.observer.model.TabletClient;

/**
 * Concepts:
 * one to many, decoupled, event handling, publisher/subscriber, MVC,
 *
 * Examples:
 * java.util.Observer, java.util.EventListener, javax.jms.Topic
 *
 * Pitfalls:
 * unexpected updates, large size consequences, what changed, debugging difficult
 *
 * Contrast:
 * Observer: one-to-many, decoupled, broadcast communication
 * Mediator: one to-one-to-many, decoupled, complex communication
 *
 * Summary:
 * decoupled communication, build in functionality, used with mediator
 */
public class Demo {

    public static void main(String[] args) {

        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("here is a new message");
        tabletClient.addMessage("new tablet msg");

    }
}
