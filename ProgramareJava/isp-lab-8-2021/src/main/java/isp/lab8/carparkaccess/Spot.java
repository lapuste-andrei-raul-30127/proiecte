
package isp.lab8.carparkaccess;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class Spot {
    private Car cr;
    private LocalDateTime in;
    
    public Spot(Car c){
        this.cr=c;
        this.in=LocalDateTime.now();
    }
    
    public Car returnCar(){
        return this.cr;
    }
    
    public LocalDateTime Time_in(){
        return this.in;
    }
    
    public int Cost(){
        return LocalDateTime.now().get(ChronoField.SECOND_OF_DAY) -  this.in.get(ChronoField.SECOND_OF_DAY);
    }
    
    @Override
    public boolean equals(Object e){
        return ((Spot) e).cr.number.equals(this.cr.number);
    }     
}
