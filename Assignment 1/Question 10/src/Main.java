public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Account account1 = new Account(1122, 20000);
        account1.setAnnualInterestRate(4.5);
        account1.withdraw(2500);
        account1.deposit(3000);
        System.out.println(account1.getBalance());
        System.out.println(account1.getMonthlyInterest());
        System.out.println(account1.getDateCreated());
    }
}