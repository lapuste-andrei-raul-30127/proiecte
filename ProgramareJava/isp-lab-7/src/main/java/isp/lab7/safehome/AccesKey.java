
package isp.lab7.safehome;

public class AccesKey {
    private String pin;
    
    public AccesKey(String s){
        this.pin=s;
    }
    
    public void setPin(String s){
        this.pin=s;
    }
    
    public String getPin(){
        return this.pin;
    }
    @Override
    public boolean equals(Object e){
        return ((AccesKey) e).getPin().equals(this.pin);
    }
}
