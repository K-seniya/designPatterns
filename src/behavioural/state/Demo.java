package behavioural.state;

import behavioural.state.model.Fan;

/**
 * Concepts:
 * Localize state behavior, state object, Separates what from where, OCP
 *
 * Examples: JSF, Iterator(?)
 *
 * Pitfalls:
 * know your States, more classes; keep logic out of context, state change triggers
 *
 * Contrast:
 * State: interface based, transitions, class per state
 * Strategy: interface based, algorithm are independent, class per algorithm
 *
 * Summary:
 * simplifies cyclomatic complexity, dding additional states made easier, more classes, similar to strategy
 */
public class Demo {
    public static void main(String[] args) {
        Fan fan = new Fan();

        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);

    }
}
