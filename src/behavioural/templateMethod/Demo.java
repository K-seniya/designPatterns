package behavioural.templateMethod;

import behavioural.templateMethod.model.OrderTemplate;
import behavioural.templateMethod.model.WebOrder;

/**
 * Concepts:
 * code reuse
 * common in libraries/frameworks
 * IoC
 * algorithm emphasis
 *
 * Examples: java.util.Collections#sort(), java.util.AbstractList#indexOf()
 *
 *
 * Pitfalls:
 * restrict access, confusing hierarchy, difficult program flow
 *
 *
 * contrast:
 * template method: same algorithm, class based, compile time
 * strategy: algorithm per strategy, interface based, run time
 *
 * Summary:
 * guarantees algorithm adherence, IoC, easier implementation
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println("Web order");

        OrderTemplate webOrder = new WebOrder();

        webOrder.processOrder();

    }
}
