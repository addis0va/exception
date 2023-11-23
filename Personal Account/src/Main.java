public class Main {

    // This is testing main class

    public static void main(String[] args) {
        PersonalAccount a1 = new PersonalAccount(12345, "Name Surname");
        try {
            a1.deposit(500);
            a1.deposit(400);
            a1.withdraw(1000);
        } catch (InsufficientBalanceException e){
            System.out.println("" + e.getMessage());
        }

    }
}