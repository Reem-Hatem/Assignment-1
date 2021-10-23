package assignment2;
public class Assignment2 {
    public static void main(String[] args) {
        Account_class account0 = new Account_class(1122, 20000);
        account0.setAnnualInterestRate(4.5);
        account0.withdraw(2500);
        account0.deposit(3000);
        System.out.println("Balance: "+account0.getBalance()+"\nMonthly Interest: "+account0.getMonthlyInterest());
        System.out.println("Date when this account was created: "+account0.getDateCreated());
    }
    
}
