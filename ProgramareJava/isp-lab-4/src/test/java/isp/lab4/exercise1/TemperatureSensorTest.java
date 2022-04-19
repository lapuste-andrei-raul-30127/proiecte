package isp.lab4.exercise1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TemperatureSensorTest {
   
    TemperatureSensor F=new TemperatureSensor(25,"Bahamas");
    
    @Test
    public void getValueTest(){
    assertEquals("Temperatura ar fi 25",25,F.getValue());
    }
    
    @Test
    public void getLocationTest(){
    assertEquals("Locatia ar fi Bahamas","Bahamas",F.getLocation());
    }
    
    }
