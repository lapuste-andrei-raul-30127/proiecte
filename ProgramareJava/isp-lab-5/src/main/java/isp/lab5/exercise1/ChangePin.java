
package isp.lab5.exercise1;


public class ChangePin extends Transaction {
    public String NewPin;
    public Account cc;
    
    public ChangePin(Account c,String nw){
        this.cc=c;
        this.NewPin=nw;
        
       
    }
    
    @Override
    public String execute(){
        cc.getCard().chPin(this.NewPin);
        return "Schimbarea pinului Executata";
        
    }
}
