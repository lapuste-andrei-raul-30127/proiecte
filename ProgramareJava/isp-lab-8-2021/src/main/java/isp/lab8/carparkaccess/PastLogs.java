
package isp.lab8.carparkaccess;

import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class PastLogs {
    public String car;
    public String time;
    public String Cost;
    
    public PastLogs(String ID,String time,String cost){
        this.Cost=cost;
        this.car=ID;
        this.time=time;
    
    }
    
    public PastLogs(String ID,LocalDateTime h,String cst){
        this.Cost=cst;
        this.car=ID;
        this.time=""+h.getYear()+"."+h.getMonthValue()+"."+h.getDayOfMonth()+" "+h.getHour()+":"+h.getMinute()+":"+h.getSecond();
    }
    
    public void SaveData(BufferedWriter f) throws IOException{
        f.write(this.car+"\n");
        f.write(this.time+"\n");
        f.write(this.Cost+"\n");
     
    }
    @Override
    public boolean equals(Object e){
        return ((PastLogs) e).car.equals(this.car);
    }  
}
