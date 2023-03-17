import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated = new Date();

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return balance * (annualInterestRate/100);
    }
    public void withdraw(double amount){
        if(amount < balance)
            balance -= amount;
        else
            System.out.println("you dont have money");
    }
    public void deposit(double amount){
        balance += amount;
    }

}
