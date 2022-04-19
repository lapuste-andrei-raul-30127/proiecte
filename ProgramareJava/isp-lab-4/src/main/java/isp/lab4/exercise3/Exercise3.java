package isp.lab4.exercise3;
import isp.lab4.exercise2.FireAlarm;
import  isp.lab4.exercise1.TemperatureSensor;

public class Exercise3 {
    
    
    public static void main(String[] arg){
        FireAlarm ff=new FireAlarm(true);
        TemperatureSensor tt=new TemperatureSensor(89,"Clasa 5");
        Controler dd=new Controler(tt,ff);
        dd.ControlStep();
    }
}
