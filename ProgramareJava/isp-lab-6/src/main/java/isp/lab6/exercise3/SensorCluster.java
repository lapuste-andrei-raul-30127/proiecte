
package isp.lab6.exercise3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.time.LocalDateTime;
import java.util.Iterator;


public class SensorCluster {
    private List<Sensor> tff= new ArrayList<Sensor>();
    private int y=0;
    
    public Sensor addSensor(Sensor s){
        this.tff.add(s);
        this.y++;
        return tff.get(y-1);
    }
    
    public boolean writeSensorReading(String ID,double value,LocalDateTime datetime){
        int i;
        for(i=0;i<tff.size();i++)
            if(tff.get(i).getID().equals(ID))
                {tff.get(i).addSensorReading(new SensorReading(datetime,value));
                return true;}
        return false;
    }
    public Sensor getSensorByID(String ID){
        int i;
        for(i=0;i<tff.size();i++)
            if(tff.get(i).getID().equals(ID))
                return tff.get(i);
      return null;      
    }
}
