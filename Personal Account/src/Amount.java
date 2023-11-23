public class Amount {
    public double amount;
    public String transactionType;


    // this constructor helps us set an amount and transaction type
    public Amount(double amount, String transactionType){
        this.amount = amount;
        this.transactionType = transactionType;
    }

    //we use toString() to return transaction Array in main class
    public String toString(){
        return amount + " $ - " + transactionType;
    }

}