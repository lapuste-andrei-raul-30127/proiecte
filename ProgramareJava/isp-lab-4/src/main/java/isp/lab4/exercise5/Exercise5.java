package isp.lab4.exercise5;
import isp.lab4.exercise2.FireAlarm;
import  isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise4.Controler;

public class Exercise5 {
    public static void main(String[] arg){
        FireAlarm ff=new FireAlarm(false);
        TemperatureSensor tt=new TemperatureSensor(69,"Clasa 5");
        TemperatureSensor tt1=new TemperatureSensor(90,"Clasa 6");
        TemperatureSensor tt2=new TemperatureSensor(100,"Clasa 7");
        TemperatureSensor v[]={tt,tt1,tt2};
        Controler dd=new Controler(v,ff);
        Home hm=new Home(dd);
        hm.getControler().ControlStep();
    }
}
