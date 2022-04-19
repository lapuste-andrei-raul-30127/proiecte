package isp.lab6.exercise3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {
            Sensor s1=new Sensor(SENSOR_TYPE.HUMIDITY,"ln133");
            Sensor s2=new Sensor(SENSOR_TYPE.TEMPERATURE,"ln990");
            SensorCluster a=new SensorCluster();
            Sensor b=null;
            b=a.addSensor(s1);
            System.out.println(b.getID()+ " introdus ");
            b=a.addSensor(s2);
            System.out.println(b.getID()+ " introdus ");
            
            a.writeSensorReading("ln990", 40, LocalDateTime.now());
            a.writeSensorReading("ln990", 33, LocalDateTime.now());
            a.writeSensorReading("ln990", 58, LocalDateTime.now());
            System.out.println("=============");
            int i;
            List<SensorReading> dff ;
            dff=a.getSensorByID("ln990").getSensorREadingsSortedbyValue();
            if(dff==null) System.out.println("NIMIC DE GASIT");
            for(i=0;i<dff.size();i++)
                System.out.println(dff.get(i).getValue()+ "  " + dff.get(i).getDateTime());
            
            System.out.println("=============");
            dff=a.getSensorByID("ln990").getSensorREadingsSortedbyDateAndTime();
            if(dff==null) System.out.println("NIMIC DE GASIT");
            for(i=0;i<dff.size();i++)
                System.out.println(dff.get(i).getValue()+ "  " + dff.get(i).getDateTime());
    }
}
