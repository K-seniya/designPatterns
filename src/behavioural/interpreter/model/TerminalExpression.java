package behavioural.interpreter.model;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression{

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    public boolean interpret(String str){
        StringTokenizer tokenizer = new StringTokenizer(str);
        while ((tokenizer.hasMoreTokens())) {
            String nextToken = tokenizer.nextToken();
            if(nextToken.equals(data)){
                return true;
            }
        }
        return false;
    }
}
