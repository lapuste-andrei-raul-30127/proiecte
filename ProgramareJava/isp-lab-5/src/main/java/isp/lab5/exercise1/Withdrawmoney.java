
package isp.lab5.exercise1;

public class Withdrawmoney extends Transaction{
    public double amount;
    private Account cc;
    
    public Withdrawmoney(Account gk,double money){
        this.cc=gk;
        this.amount=money;
        
    }
    
    @Override
    public String execute(){
       
        this.cc.changeBalance(amount);
        return "Suma retrasa="+this.amount;
     
    }
}
