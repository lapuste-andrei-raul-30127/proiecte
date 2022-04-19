package isp.lab3.exercise3;

public class vehicul {
    private String model;
    private String type;
    private int speed;
    private char fuel;
    
    public vehicul(String m,String t,int s,char f){
        this.fuel=f;
        this.model=m;
        this.speed=s;
        this.type=t;
    }
    
    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int u){
        this.speed=u;
    }
    
    public String getModel(){
        return this.model;
    }
    
    public void setModel(String u){
        this.model=u;
    }
    
    public char getFuel(){
        return this.fuel;
    }
    public void setFuel(char u){
        this.fuel=u;
    }
    
     public String getType(){
        return this.type;
    }
     public void setType(String u){
        this.type=u;
    }
     
    
     public void car(){
         System.out.println("Model " + this.model +" Type "+this.type+" speed "+this.speed+" Fuel "+this.fuel);
     }
     
     
     
}
