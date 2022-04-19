
package isp.lab6.exercise3;

import java.time.LocalDateTime;

public class SensorReading implements Comparable<SensorReading>{
     private LocalDateTime datetime; 
     private double value;
     
     public SensorReading(LocalDateTime f,double h){
         this.datetime=f;
         this.value=h;
     }
     
     public LocalDateTime getDateTime(){
         return this.datetime;
     }
     public double getValue(){
         return this.value;
     }
    @Override
    public int compareTo(SensorReading arg0) {
        return this.datetime.compareTo(arg0.getDateTime());
    }
   
    
}
