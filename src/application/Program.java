package application;

import entitites.Account;
import exceptions.AccountException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.print("Numero:");
        int number = sc.nextInt();
        System.out.println("Titular:");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Saldo inicial:");
        double balance = sc.nextDouble();
        System.out.println("Limite de saque:");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, name, balance, withdrawLimit);

        System.out.println();
        System.out.println("Informe uma quantia para sacar:");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", account.getBalance());
        }
        catch (AccountException e) {
            System.out.println(e.getMessage());
        }
    }
}
