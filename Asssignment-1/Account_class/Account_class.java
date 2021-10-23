package assignment2;
public class Account_class {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private java.util.Date dateCreated;
    public Account_class(){
        id=0;
        balance=0.0;
        annualInterestRate=0.0;
        dateCreated = new java.util.Date();
    }
    public Account_class(int newid, double newbalance){
        id = newid;
        balance=newbalance;
        dateCreated = new java.util.Date();
    }
    public void setId(int newid){
        id = newid;
    }
    public int getId(){
        return id;
    }
    public void setBalance(double newbalance){
        balance = newbalance;
    }
    public double getBalance(){
        return balance;
    }
    public void setAnnualInterestRate(double newnanualInterestRate){
        annualInterestRate = newnanualInterestRate;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public String getDateCreated(){
        return this.dateCreated.toString();
    }
    public double getMonthlyInterestRate(){
        return (annualInterestRate/100)/12;
    }
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double m){
        balance-=m;
    }
    public void deposit(double m){
        balance+=m;
    }
}
