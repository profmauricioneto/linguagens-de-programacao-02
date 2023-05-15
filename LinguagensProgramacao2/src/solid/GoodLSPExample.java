/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.solid;

/**
 *
 * @author maumneto
 */
class Account {
    private double balance;
    public Account() {
        this.balance = 0;
    }
    public Account(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void withdraw(double value) {
        if (balance >= value) {
            this.balance = this.balance - value;
        } else {
            System.out.println("No enough funds");
        }
    }
    public void deposit(double value) {
        this.balance = this.balance + value;
    }
    public void income() {
        this.balance = this.balance*1.005;
    }
}

class AccountSpecial {
    private Account account;
    public AccountSpecial() {
        account = new Account();
    }
    public AccountSpecial(double balance) {
        account = new Account(balance);
    }
    public double getBalance() {
        return account.getBalance();
    }
    public void withdraw(double value) {
        account.withdraw(value);
    }
    public void deposit(double value) {
        account.deposit(value);
    }
}
public class GoodLSPExample {
    public static void main(String[] args) {
        AccountSpecial account = new AccountSpecial(500);
        System.out.println("Balance: " + account.getBalance());
        account.deposit(100);
        System.out.println("New Balance: " + account.getBalance());
    }
}
