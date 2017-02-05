package behavioural.chainOfResponsabilities.model;

public class VP extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(RequestType.PURCHASE == request.getRequestType()) {
            if(request.getAmount() < 1500) {
                System.out.println("VPs can approve purchases velow 1500");
            }else{
                successor.handleRequest(request);
            }
        }
    }
}
