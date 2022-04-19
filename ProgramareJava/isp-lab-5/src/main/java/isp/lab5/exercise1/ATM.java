
package isp.lab5.exercise1;

import java.util.Scanner;

public class ATM {
    private Card cd=null;
    private Bank bank;
    public boolean cardACTIVE;
    
    public ATM(Bank b){
        this.bank=b;
    }
    
    public boolean insertCard(Card c,String pin){
       
        if(pin.equals(c.getPin()))
        {   this.cd=c;
            return true;
            }
        else return false;
    }
    
    
    
    
    public void withdraw(double money){
        if(this.cd!=null) {
            Transaction tt=new Withdrawmoney(this.bank.getAccountbyCardid(this.cd.getCardid()),money);
            System.out.println( bank.executeTransaction(tt)+"");
            ///adaugarea unei comezi in Account care scade valoarea stocata in "balance" dupa cat ai retras din cont
            
        }
            
     }
    
    public void checkMoney(){
        if(this.cd!=null) {
            Transaction tt=new CheckMoney(this.bank.getAccountbyCardid(this.cd.getCardid()));
            System.out.println( this.bank.executeTransaction(tt)+"");
        }
    }
    
    public void changePin(String newPin){
        
        System.out.print("Pin:");
        Scanner keybord = new Scanner(System.in);
        String d=keybord.next();  
        
        if(d.equals(this.cd.getPin()))
          {
           Transaction tt=new ChangePin(this.bank.getAccountbyCardid(this.cd.getCardid()),newPin);
           System.out.println( this.bank.executeTransaction(tt));
           
          }
        else {System.out.println( "!!!!!!!!!!!!!");
                System.out.println( "fjfhdkd "+this.cd.getPin());}
    }
    public void revomeCard(){
        this.cd=null;
    }
}
