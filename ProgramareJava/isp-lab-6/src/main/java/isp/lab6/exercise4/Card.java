package isp.lab6.exercise4;

public class Card {
    private String cardid;
    public String pin;
    
    public Card(String c,String p){
        this.cardid=c;
        this.pin=p;
    }
    public String getCardid(){
        return this.cardid;
    }
    public String getPin(){
        return this.pin;
    }
    public void chPin(String g){
        this.pin=g;
    }
}

