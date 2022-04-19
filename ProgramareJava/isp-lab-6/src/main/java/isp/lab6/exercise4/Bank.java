
package isp.lab6.exercise4;

import java.util.ArrayList;
import java.util.List;


public class Bank {
    public List<Account> accounts=new ArrayList<Account>();
    
    public int y=0;
    
    
    public void addAccount(Account p){
        this.accounts.add(p);
        this.y++;
    }
    
    public Account getAccountbyCardid(String cardid){
        int i;
        Account b = null;
        for(i=0;i<y;i++)
            if(cardid.equals(accounts.get(i).getCard().getCardid()))
               b=accounts.get(i);
        return b;
    }
    
   public String executeTransaction(Transaction t){
       return t.execute();
   
   }
    
}
