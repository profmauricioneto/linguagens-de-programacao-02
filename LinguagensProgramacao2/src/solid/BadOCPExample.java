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
}

class OrdinaryAccount extends Account {
    public OrdinaryAccount() {
        super();
    }
    public OrdinaryAccount(double balance){
        super(balance);
    }
    public void createOrdinaryAccount(){
        System.out.println("Ordinary Account Created.");
    }
}

class SalaryAccount extends Account{
    public SalaryAccount() {
        super();
    }
    public SalaryAccount(double balance){
        super(balance);
    }
    public void createSalaryAccount(){
        System.out.println("Salary Account Created.");
    }
}

class VirtualAccount extends Account {
    public VirtualAccount() {
        super();
    }
    public VirtualAccount(double balance) {
        super(balance);
    }
    public void createVirtualAccount() {
        System.out.println("Virtual Account created.");
    }
}

class CreateAccount {
    public static void createAccountByType(Account account) {
        if (account instanceof OrdinaryAccount) {
            ((OrdinaryAccount) account).createOrdinaryAccount();
        } else if (account instanceof SalaryAccount) {
            ((SalaryAccount) account).createSalaryAccount();
        } else if (account instanceof VirtualAccount) {
            ((VirtualAccount) account).createVirtualAccount();
        } else {
            System.out.println("No one of account type was choosen.");
        }
    }
}

public class BadOCPExample {
    public static void main(String[] args) {
        Account salary = new SalaryAccount(1000);
        CreateAccount.createAccountByType(salary);
    }
}
