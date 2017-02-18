package behavioural.visitor;

import behavioural.visitor.model.*;

/**
 * Concepts:
 * separate algorithm from object
 * adding new features
 * maintain open/closed principle
 * visitor changes
 *
 * examples: java.lang.model.element.Element, java.lang.model.element.ElementVisitor
 *
 * Pitfalls:
 * plan for adaptability
 * indirection somewhat confusing
 * adapter pattern
 *
 * contrast:
 * visitor: interface based, externalized czhnges, multiple visitors
 * iterator: interfaced based/anonymous, encapsulates, singular
 *
 * summary:
 * expect changes, minor complexity, externalize change
 *
 */
public class Demo {

    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Oil());
        order.addPart(new Fender());

        order.accept(new AtvPartsShippingVisitor());
    }

}

