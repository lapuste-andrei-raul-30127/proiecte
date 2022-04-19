package isp.lab6.exercise1;

import java.util.List;

public class Exercise1 {
   public static void main(String[] args) {
       colectie h=new colectie();
       SensorReading s1=new SensorReading(40,"garaj",Type.HUMIDITY);
       SensorReading s2=new SensorReading(25,"beci",Type.TEMPERATURE);
       SensorReading s3=new SensorReading(16,"cantina",Type.PRESSURE);
       SensorReading s4=new SensorReading(30,"cantina",Type.PRESSURE);
       ///adaugarea sensorilor
       h.addReading(s1);
       h.addReading(s2);
       h.addReading(s3);
       h.addReading(s4);
       ///media
       System.out.println("Media: "+h.getAvarageValueByType(Type.PRESSURE,"cantina"));
       ///sortare
       System.out.println("Ordonare dupa locatie:");
       h.listSortedByLocation();
          System.out.println("Ordonare dupa valoare:");
          h.listSortedByValue();
          
      ///comenzi liste
      List<SensorReading> dff=h.getReadingsByType(Type.PRESSURE);
      for(int i=0;i<dff.size();i++)
          System.out.println(dff.get(i).getLocation()+" "+dff.get(i).getType()+" "+dff.get(i).getValue() );
      dff=h.findAllByLocationAndType("garaj", Type.HUMIDITY);
      for(int i=0;i<dff.size();i++)
          System.out.println(dff.get(i).getLocation()+" "+dff.get(i).getType()+" "+dff.get(i).getValue() );
   }
}


