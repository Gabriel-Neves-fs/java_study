import java.util.Scanner;

import entities.Account;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        String holder = sc.next();
        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        double balance;
        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            balance = sc.nextDouble();
        } else {
            balance = 0.0;
        }

        Account account = new Account(number, holder, balance);

        System.out.println("Account data: ");
        System.out.println("Account " + account.getNumber() + ", Holder: " + account.getHolder() + ", Balance: $"
                + String.format("%.2f", account.getBalance()));
        System.out.println();
        System.out.println("Enter a deposit value: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
        System.out.println("Updated account data: ");
        System.out.println("Account " + account.getNumber() + ", Holder: " + account.getHolder() + ", Balance: $"
                + String.format("%.2f", account.getBalance()));
        System.out.println();
        System.out.println("Enter a withdraw value ( -5.00 transaction fee): ");
        amount = sc.nextDouble();
        account.withdraw(amount);
        System.out.println("Updated account data: ");
        System.out.println("Account " + account.getNumber() + ", Holder: " + account.getHolder() + ", Balance: $"
                + String.format("%.2f", account.getBalance()));

        sc.close();
    }

}