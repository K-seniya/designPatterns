package behavioural.strategy.model;


public abstract class ValidationStrategy {

    public abstract boolean isValid(CreditCard creaditCard);

    protected boolean passesLuhn(String ccNumber) {
        int sum = 0;
        boolean alternative = false;
        for (int i=ccNumber.length() - 1; i >=0; i--){
            int n = Integer.parseInt(ccNumber.substring(i, i+1));
            if(alternative){
                n *=2;
                if(n>9){
                    n = (n%10) + 1;
                }
            }
            sum += n;
            alternative =! alternative;
        }
        return (sum %10 == 0);
    }
}
