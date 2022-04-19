package isp.lab4.exercise4;
import isp.lab4.exercise2.FireAlarm;
import  isp.lab4.exercise1.TemperatureSensor;

public class Controler {
    private TemperatureSensor temperaturesenzor[]=new TemperatureSensor[3];
    private FireAlarm firesenzor;
    
    public Controler(TemperatureSensor tS[],FireAlarm fs){
        this.temperaturesenzor=tS;
        this.firesenzor= fs;
    }
    
    public void ControlStep(){
        int g=1;
        for(int i=0;i<3;i++)
            if(this.temperaturesenzor[i].getValue()<50)
                g=0;
        if(g==1)
           {this.firesenzor.setActive();
            System.out.println(this.firesenzor.toString());}
        else System.out.println(this.firesenzor.toString());
    }
}
