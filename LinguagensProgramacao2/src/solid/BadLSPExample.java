/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

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

class AccountSpecial extends Account {
    public AccountSpecial() {
        super();
    }
    public AccountSpecial(double balance) {
        super(balance);
    }
    @Override
    public void income() {
        System.out.println("There's no income in this account type.");
    }
}
public class BadLSPExample {
    public static void main(String[] args) {
        Account accountExample = new Account(100);
        System.out.println("Balance: " + accountExample.getBalance());
        accountExample.income();
        System.out.println("Balance with income: " + accountExample.getBalance());
        
        Account accountSpecial = new AccountSpecial(1000);
        System.out.println("Balance: " + accountSpecial.getBalance());
        accountSpecial.income();
        System.out.println("Balance with income: " + accountSpecial.getBalance());
        
    }
}
