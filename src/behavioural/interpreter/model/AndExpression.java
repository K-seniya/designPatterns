package behavioural.interpreter.model;

public class AndExpression implements Expression {

    private Expression firstExpression;
    private Expression secondExpression;

    public AndExpression(Expression secondExpression, Expression firstExpression) {
        this.secondExpression = secondExpression;
        this.firstExpression = firstExpression;
    }

    @Override
    public boolean interpret(String context) {
        return firstExpression.interpret(context) && secondExpression.interpret(context);
    }
}
