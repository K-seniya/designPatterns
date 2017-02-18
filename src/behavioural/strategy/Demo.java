package behavioural.strategy;

import behavioural.strategy.model.AmexStrategy;
import behavioural.strategy.model.CreditCard;
import behavioural.strategy.model.VisaStrategy;

/**
 * Concepts:
 * Eliminate conditional statements
 * behaviour encapsulated in classes
 * difficult to add new strategies
 * client aware of strategies
 * client choose strategy
 *
 * java.util.Comparator
 *
 *
 * Pitfalls:
 * client aware of strategies
 * increased number of classes
 *
 *
 * Contrast:
 * Strategy: interface based, algorithm are independent, class per algotytm
 * State: interface based, transitions, class per state
 *
 * Summary:
 * Externalize algorithm
 * client knows strategies
 * class per strategy
 * reduces conditional statements
 *
 */
public class Demo {

    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("378282246310005");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is Amex valid: " + amexCard.isValid());

        CreditCard amexCardInvalid = new CreditCard(new AmexStrategy());

        amexCardInvalid.setNumber("378282246310007");
        amexCardInvalid.setDate("04/2020");
        amexCardInvalid.setCvv("123");

        System.out.println("Is Amex 2 valid: " + amexCardInvalid.isValid());


        CreditCard visa = new CreditCard(new VisaStrategy());

        visa.setNumber("4929316415987346");
        visa.setDate("04/2020");
        visa.setCvv("123");

        System.out.println("Is visa valid: " + visa.isValid());

    }
}
