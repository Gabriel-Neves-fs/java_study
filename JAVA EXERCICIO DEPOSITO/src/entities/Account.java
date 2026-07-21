package entities;

public class Account {

      private int number;
      private String holder;
      private double balance;

      // constructor

      public Account(int number, String holder, double balance) {
            this.number = number;
            this.holder = holder;
            this.balance = balance;
      }

      // methods
      public void deposit(double amount) {
            balance += amount;
      }

      public void withdraw(double amount) {
            balance -= amount + 5.0;
      }

      // getters
      public int getNumber() {
            return number;
      }

      public String getHolder() {
            return holder;
      }

      public double getBalance() {
            return balance;
      }

}
