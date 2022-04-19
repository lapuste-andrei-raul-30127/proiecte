
package isp.lab8.carparkaccess;

import java.util.ArrayList;
import java.util.List;

public class ParkingManagmentSystem {
    private List<Spot> parkinglot= new ArrayList<Spot>();
    public int capacity;
    
    public ParkingManagmentSystem(int mx){
        this.capacity=mx;
    }
    
    public boolean CheckSpace(){
        return this.parkinglot.size()<this.capacity;
    }
    
    public void parcare(){
        this.parkinglot.forEach(i -> {
            System.out.println("Numar masina:"+i.returnCar().number+"...Entry time:"+i.Time_in()+"...Cost"+i.Cost());
        });
        System.out.println("Locuri libere  "+ ((int)this.capacity-parkinglot.size()));
    }
    
    
    
    public void enterParkingLot(Car a){
        Spot h=new Spot(a); 
        if(this.parkinglot.contains(h))
            {System.out.println("Masina deja parcata");
             return ;}
        else 
           {
            if(this.CheckSpace())
                   this.parkinglot.add(h);
            else{System.out.println("Capacitate maxima atinsa. Intrare interzisa");return ;}
           }
    }
    
    public PastLogs existParkedCar(Car a){
        int x;
        PastLogs gg=null;
        x=this.parkinglot.indexOf(new Spot(a));
        if(x>-1)
           {    
               gg= new PastLogs(a.number,this.parkinglot.get(x).Time_in(),Integer.toString(this.parkinglot.get(x).Cost()));
               System.out.println("Masina a iesit. Cost "+this.parkinglot.get(x).Cost());
               this.parkinglot.remove(new Spot(a));
           }
        return gg;
        
    }
}
