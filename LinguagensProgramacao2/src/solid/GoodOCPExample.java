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
        this.balance =0;
    }
    public Account(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void createAccount() {
        System.out.println("Account Created");
    }
}

class SalaryAccount extends Account {
    public SalaryAccount() {
        super();
    }
    public SalaryAccount(double balance) {
        super(balance);
    }
    @Override
    public void createAccount() {
        System.out.println("Salary Account Created.");
    }
}

class OrdinaryAccount extends Account {
    public OrdinaryAccount() {
        super();
    }
    public OrdinaryAccount(double balance) {
        super(balance);
    }
    @Override
    public void createAccount() {
        System.out.println("Ordinary Account Created.");
    }
}

class VirtualAccount extends Account {
    public VirtualAccount() {
        super();
    }
    public VirtualAccount(double balance) {
        super(balance);
    }
    @Override
    public void createAccount() {
        System.out.println("Virtual Account Created.");
    }
}

class SavingsAccount extends Account {
    public SavingsAccount() {
        super();
    }
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void createAccount() {
        System.out.println("Savings account created.");
    }
    
}

class SpecialAccount extends Account{

    public SpecialAccount() {
        super();
    }
    
    public SpecialAccount(double balance) {
        super(balance);
    }

    @Override
    public void createAccount() {
        System.out.println("Special Account created!");
    }
}

public class GoodOCPExample {
    public static void main(String[] args) {
        Account salaryAccount = new SalaryAccount(1000);
        salaryAccount.createAccount();
        
        Account ordinaryAccount = new OrdinaryAccount(500);
        ordinaryAccount.createAccount();
        
        Account vAccount = new VirtualAccount();
        vAccount.createAccount();
        
        Account sAccount = new SavingsAccount();
        sAccount.createAccount();
        
        Account specialAccount = new SpecialAccount();
        specialAccount.createAccount();
    }
}
