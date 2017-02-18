package behavioural.observer;

import java.util.Observable;
import java.util.Observer;

public class JavaUsageDemo {

    public static void main(String[] args) {
        TwitterStream twitterStream = new TwitterStream();

        Client clientBryan = new Client("Bryan");
        Client clientMark = new Client("Mark");

        twitterStream.addObserver(clientBryan);
        twitterStream.addObserver(clientMark);

        twitterStream.someoneTwitted();
    }


}

//subject
class TwitterStream extends Observable{
    public void someoneTwitted() {
        setChanged();
        notifyObservers();
    }
}

//observer
class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update " + name + "'s stream. Someone tweeted sth");
    }
}
