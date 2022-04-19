package isp.lab4.exercise3;
import isp.lab4.exercise2.FireAlarm;
import  isp.lab4.exercise1.TemperatureSensor;

public class Controler {
    private TemperatureSensor temperaturesenzor;
    private FireAlarm firesenzor;
    
    public Controler(TemperatureSensor tS,FireAlarm fs){
        this.temperaturesenzor=tS;
        this.firesenzor= fs;
    }
    
    public void ControlStep(){
        if(this.temperaturesenzor.getValue()>50)
        {this.firesenzor.setActive();
        System.out.println("Fire alarm started");
        }
        else  System.out.println("Fire alarm NOT started");
    }
}
