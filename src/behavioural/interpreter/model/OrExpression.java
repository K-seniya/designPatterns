package behavioural.interpreter.model;

public class OrExpression implements Expression{

    private Expression firstExpression;
    private Expression secondExpression;

    public OrExpression(Expression secondExpression, Expression firstExpression) {
        this.secondExpression = secondExpression;
        this.firstExpression = firstExpression;
    }

    @Override
    public boolean interpret(String context) {
        return firstExpression.interpret(context) || secondExpression.interpret(context);
    }
}
