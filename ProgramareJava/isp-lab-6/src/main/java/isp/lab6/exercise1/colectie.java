
package isp.lab6.exercise1;

import java.util.LinkedList;
import java.util.List;

public class colectie implements IReadingRepository  {
    public SensorReading lista[]=new SensorReading[10];
    int y=0;
    
    @Override
    public void addReading(SensorReading reading){
        this.lista[y]=reading;
        this.y++;
    }

    @Override
    public double getAvarageValueByType(Type type, String location) {
        double x=0;
        int nr=0;
        for(int i=0;i<y;i++)
            if(type==this.lista[i].getType() && location==this.lista[i].getLocation())
            {x=x+this.lista[i].getValue();
            nr++;}
        return x/nr;
    }

    @Override
    public List<SensorReading> getReadingsByType(Type type) {
        List<SensorReading> dff=new LinkedList<SensorReading>();
        for(int i=0;i<y;i++)
            if(this.lista[i].getType()==type)
                dff.add(this.lista[i]);
        return dff;
    }

    @Override
    public void listSortedByLocation() {
        SensorReading x;
        int i,j;
        for(i=0;i<y;i++)
            for(j=i+1;j<y;j++)
                if(lista[i].getLocation().compareTo(lista[j].getLocation())>0)
                {
                 x=lista[i];
                 lista[i]=lista[j];
                 lista[j]=x;
                }
         for(i=0;i<y;i++)
         System.out.println(lista[i].getValue()+"; "+lista[i].getLocation() +"; "+lista[i].getType()  );
        
    }

    @Override
    public void listSortedByValue() {
       SensorReading x;
        for(int i=0;i<y;i++)
            for(int j=i+1;j<y;j++)
                if(lista[i].getValue() > lista[j].getValue())
                {
                 x=lista[i];
                 lista[i]=lista[j];
                 lista[j]=x;
                }
        for(int i=0;i<y;i++)
         System.out.println(lista[i].getValue()+"; "+lista[i].getLocation() +"; "+lista[i].getType()  );
    }

    @Override
    public List<SensorReading> findAllByLocationAndType(String location, Type type) {
       List<SensorReading> dff=new LinkedList<SensorReading>();
        for(int i=0;i<y;i++)
            if(lista[i].getType()==type && lista[i].getLocation()==location)
                dff.add(lista[i]);
        return dff;
    }

    
    
}
