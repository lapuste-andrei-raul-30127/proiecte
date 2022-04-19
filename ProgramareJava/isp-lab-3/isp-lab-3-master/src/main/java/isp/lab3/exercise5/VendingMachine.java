
package isp.lab3.exercise5;
import java.util.Scanner;

public class VendingMachine {
    public String[] produse= {"1)Cipsuri","2)Ciocolata","3)Cola","4)Fanta","5)Lapte","6)Corn","7)Sandwich   "};
    public int[] pret={4,3,3,4,5,5,10};
    public int credit=0;
    
    public void displayProducts(){
        for(int i=0;i<produse.length;i++)
        {
            System.out.print(produse[i]+',');
        }
    }
    public void displayCredit(){
        System.out.println("Credit prezent="+credit);
    }
    
    public int insertCoin(){
        Scanner keybord = new Scanner(System.in);
        
        int i = keybord.nextInt();
        return i;
    }
    
    public void Menu(){
        int i;
        this.displayProducts();
        Scanner keybord = new Scanner(System.in);
        System.out.println("Alege un produs");
        i = keybord.nextInt();
        while(this.credit<this.pret[i]){
            this.displayCredit();
            this.credit=this.credit+this.insertCoin();
        }
        System.out.println("Produs cumparat");
        
    }

}
