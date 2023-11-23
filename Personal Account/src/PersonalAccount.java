
import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;

//This class contains methods and constructors
public class PersonalAccount {
    public int accountNumber;
    public String accountHolder;
    private double balance;

    ArrayList<Amount> transaction = new ArrayList<Amount>();

    // with this constructor we can create new account
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    // this method helps us to deposit money to your personal account
    public void deposit(double amount) {
        balance = balance + amount;
        transaction.add(new Amount(amount, "Deposit"));
    }

    // using this method can help us to withdraw money from your account (balance)
    public void withdraw(double amount) throws InsufficientBalanceException{
        if (balance < amount) {
            throw new InsufficientBalanceException("You do not have enough money to withdraw!");
        } else {
            balance = balance - amount;
        }
        transaction.add(new Amount(amount, "Withdrawal"));
    }


    // this method returns us current balance in your account
    public double getBalance(){
        System.out.println("Your current balance: " + balance);
        return balance;
    }


    // this method shows your account number, which you set when CREATING NEW ACCOUNT
    public int getAccountNumber() {
        System.out.println("Your Account Number: " + accountNumber);
        return accountNumber;
    }

    // this shows your account holder
    public String getAccountHolder() {
        System.out.println("Your Account Holder: " + accountHolder);
        return accountHolder;
    }

    // this method prints all transactions which you have done
    public void printTransactionHistory() {
        for (Amount t : transaction) {
            System.out.println(t);
        }
    }

}
