/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab4.exercise3;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import isp.lab4.exercise2.FireAlarm;
import  isp.lab4.exercise1.TemperatureSensor;
/**
 *
 * @author Asus
 */
public class ControlTest {
    FireAlarm ff=new FireAlarm(true);
        TemperatureSensor tt=new TemperatureSensor(89,"Clasa 5");
        Controler dd=new Controler(tt,ff);
        
    
}
