
package isp.lab6.exercise3;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class SRT implements Comparator<SensorReading> {
    
    @Override
    public int compare(SensorReading a , SensorReading b){
         return Double.compare(a.getValue(),b.getValue());
    }
}


public class Sensor {
    private SENSOR_TYPE type;
    private String ID;
    List<SensorReading> dff = new  LinkedList<SensorReading> ();
    
    public Sensor(SENSOR_TYPE type,String sensorID){
        this.ID=sensorID;
        this.type=type;
    }
    
    public List<SensorReading> getSensorREadingsSortedbyValue(){
        Collections.sort(dff, new SRT());
        return dff;
    }
    
     public List<SensorReading> getSensorREadingsSortedbyDateAndTime(){
         Collections.sort(dff);
        return dff;
    }
     public void addSensorReading(SensorReading s){
         dff.add(s);
      }
     public String getID(){
         return this.ID;
     }
     public SENSOR_TYPE getType(){
         return this.type;
     }
    
    
}
