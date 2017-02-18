package behavioural.strategy.model;


public class VisaStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creaditCard) {
        boolean isValid = true;

        isValid = creaditCard.getNumber().startsWith("4");

        if (isValid) {
            isValid = creaditCard.getNumber().length() == 16;
        }

        if (isValid) {
            isValid = passesLuhn(creaditCard.getNumber());
        }
        return isValid;
    }
}
