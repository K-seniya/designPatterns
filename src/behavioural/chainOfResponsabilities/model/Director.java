package behavioural.chainOfResponsabilities.model;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(RequestType.CONFERENCE == request.getRequestType()) {
            System.out.println("Directors can approve conferences");
        }else{
            successor.handleRequest(request);
        }
    }
}
