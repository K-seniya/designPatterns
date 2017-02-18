package behavioural.strategy.model;

/**
 * Created by kseniya on 13/02/2017.
 */
public class AmexStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creaditCard) {
        boolean isValid = true;

        isValid  = creaditCard.getNumber().startsWith("37") ||
                creaditCard.getNumber().startsWith("34");

        if(isValid){
            isValid = creaditCard.getNumber().length() == 15;
        }

        if(isValid) {
            isValid = passesLuhn(creaditCard.getNumber());
        }
        return isValid;
    }
}
