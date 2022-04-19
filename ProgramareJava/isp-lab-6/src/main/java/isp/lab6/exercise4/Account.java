
package isp.lab6.exercise4;

import java.util.Scanner;

public class Account {
    private Card cd;
    private String owner;
    private double balance;
    
    public Account(Card c, String o,double b){
        this.balance=b;
        this.owner=o;
        this.cd=c;
    }
    
    public Card getCard(){
        return this.cd;
    }
    public String getName(){
        return this.owner;
    }
    public double getBalance(){
        return this.balance;
    }
    ///comanda urmatoare scade din variabila "balance" suma de bani retrasa
    public void changeBalance(double money){
        this.balance=this.balance-money;
    }
    
}
