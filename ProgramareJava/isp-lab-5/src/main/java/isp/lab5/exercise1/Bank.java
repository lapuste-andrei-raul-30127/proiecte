
package isp.lab5.exercise1;


public class Bank {
    public Account accounts[]=new Account[10];
    public int y=0;
    
    
    public void addAccount(Account p){
        this.accounts[y]=p;
        this.y++;
    }
    
    public Account getAccountbyCardid(String cardid){
        int i;
        Account b = null;
        for(i=0;i<y;i++)
            if(cardid.equals(accounts[i].getCard().getCardid()))
               b=accounts[i];
        return b;
    }
    
   public String executeTransaction(Transaction t){
       return t.execute();
   
   }
    
}
