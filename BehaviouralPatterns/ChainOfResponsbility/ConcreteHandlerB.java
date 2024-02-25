class ConcreteHandlerB extends Handler{
    @Override
    public void handleRequest(String request ){
        if("B".equals(request)){
            System.out.println("ConcreteHandlerB is handling the request");
        } else if (successor != null){
            successor.handleRequest(request);
        }
    }
}