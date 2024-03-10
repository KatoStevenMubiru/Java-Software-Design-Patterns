//An interface that defines the method for setting the next processor in the chain and the method to process the request.

public interface DispenseChain{
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency cur);
}