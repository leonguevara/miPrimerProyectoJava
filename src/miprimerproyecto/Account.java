/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerproyecto;

/**
 *
 * @author leonguevara
 */
public class Account {
    private double balance;
    private String number;
    
    public Account(double balance, String number) {
        this.balance = balance;
        this.number = number;
    }
    
    public Account() {
        this(0.00, "SinNumero");
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public String getNumber() {
        return this.number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public void deposit(double amount) {
        this.balance += amount;  // balance = balance + amount;
    }
    
    public boolean withdrawal(double amount) {
        //this.balance -= amount;
        if (balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient founds");
            return false;
        }
    }
}
