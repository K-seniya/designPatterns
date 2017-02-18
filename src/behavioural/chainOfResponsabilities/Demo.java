package behavioural.chainOfResponsabilities;

import behavioural.chainOfResponsabilities.model.*;

/**
 * Decouples sender and receiver (each of them do not know about each other)
 * Runtime configuration
 * Hierarchical in nature
 * Careful with large chains
 *
 * Pitfalls:
 * Handling/Handler guarantee
 * Runtime configuration risk
 * Chain length/performance issues
 *
 * Contrast:
 * Chain of responsibility: handler is unique, successor, can utilize the command
 * command: also unique, encapsulates function, reversiable or trackable in nature
 *
 * We usually called a command because we know it can handle it. But the chain just send it on the chain just assuming
 * that somebody along the way will handle it
 */

public class Demo {

    public static void main(String[] args) {
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request conferenceRequest = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(conferenceRequest);

        Request smallPurchaseRequest = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(smallPurchaseRequest);

        Request bigPurchaseRequest = new Request(RequestType.PURCHASE, 2000);
        bryan.handleRequest(bigPurchaseRequest);

    }
}
