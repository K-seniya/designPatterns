package behavioural.interpreter;

import behavioural.interpreter.model.AndExpression;
import behavioural.interpreter.model.Expression;
import behavioural.interpreter.model.OrExpression;
import behavioural.interpreter.model.TerminalExpression;

/**
 * Pitfalls:
 * complexity
 * class per rule
 * use of other patterns
 * adding new variant
 * specific case
 *
 * Contrasts:
 * interpreter: access to properties, functions as methods,  adding functionality change every variant
 * visitor: needs observer functionality, functionality found in one place, adding new variant requires changing
 * every visitor
 *
 * define a grammar
 * rules or validation
 * special case pattern
 * consider the visitor
 *
 */

public class Demo {

    private static Expression buildInterpreterTree() {
        Expression terminalLions = new TerminalExpression("Lions");
        Expression terminalTigers = new TerminalExpression("Tigers");
        Expression terminalBears = new TerminalExpression("Bears");

        Expression subAlternation = new OrExpression(terminalTigers, terminalBears);
        Expression totalAlternation = new OrExpression(terminalLions, subAlternation);

        return new AndExpression(terminalBears, totalAlternation);

    }

    /**
     * main method - build the interpreter and then interpret a specific
     * sequence
     */

    public static void main(String[] args) {
        String lionContext = "Lions";
        String bearContext = "Bears";
        String bearAndTigerContext = "Bears Tigers";

        Expression define = buildInterpreterTree();

        System.out.println(lionContext + " is " + define.interpret(lionContext));
        System.out.println(bearContext + " is " + define.interpret(bearContext));
        System.out.println(bearAndTigerContext + " is " + define.interpret(bearAndTigerContext));

    }
}
