package isp.lab5.exercise1;
import java.util.Scanner;


public class Exercise1 {

    public static void main(String[] args) {
        Card c=new Card("555-11","7777");
        Card c1=new Card("444-11","1234");
        Account a=new Account(c,"Lapuste",1800);
        Account a1=new Account(c1,"Mihlea",3800);
        Bank b=new Bank();
        b.addAccount(a);
        b.addAccount(a1);
        ///
       ATM g=new ATM(b);
       Scanner keybord = new Scanner(System.in);
       System.out.println("Introduceti cod PIN:");
       String d=keybord.next();
       boolean h=g.insertCard(c,d );
       g.checkMoney();
       g.withdraw(280);
       g.checkMoney();
       g.changePin("4343");
       System.out.println(c.getPin());
       g.revomeCard();
       
       
       
       
    }
}
