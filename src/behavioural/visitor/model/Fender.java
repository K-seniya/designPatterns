package behavioural.visitor.model;

public class Fender implements  AtvPart{
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
