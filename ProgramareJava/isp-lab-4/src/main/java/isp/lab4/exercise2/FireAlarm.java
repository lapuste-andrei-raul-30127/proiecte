package isp.lab4.exercise2;

public class FireAlarm {
    private boolean active;
    
    public FireAlarm(boolean a){
        this.active=a;
    }
    public boolean isActive(){
        return this.active;
    }
    public void setActive(){
        this.active=true;
    }
    
    @Override
    public String toString(){
        if(this.active==true)
            return "Alarma activa";
        else return "Alarma inactiva";
    }
}
