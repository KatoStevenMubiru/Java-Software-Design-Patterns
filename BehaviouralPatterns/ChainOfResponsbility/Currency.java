//A simple class that represents the amount of money to be dispensed.

public class Currency {
    private int amount;

    public Currency(int amt){
        this.amount = amt;
    }
    public int getAmount(){
        return this.amount;
    }
}