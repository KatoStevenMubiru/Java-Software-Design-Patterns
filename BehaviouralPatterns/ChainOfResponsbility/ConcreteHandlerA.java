class ConcreteHandlerA extends Handler{
    @Override
    public void handlerRequest(String request){
        if("A".equals(request)){
            System.out.println("ConcreteHandlerA is handling the request.");

        } else if(successor != null){
           successor.handleRequest(request);
        }
    }

}