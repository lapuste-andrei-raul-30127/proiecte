package isp.lab6.exercise4;

public class CheckMoney extends Transaction {
    private Account cc;
    
    public CheckMoney(Account c){
        this.cc=c;
    }
    @Override
    public String execute(){
        return ("Balance="+this.cc.getBalance());
    }
    
}
