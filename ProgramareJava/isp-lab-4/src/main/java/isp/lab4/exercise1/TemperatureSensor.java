package isp.lab4.exercise1;

public class TemperatureSensor {
     private int value;
     private String locatie;
     
     public TemperatureSensor(){
      }
     public TemperatureSensor(int v,String l){
         this.value=v;
         this.locatie=l;
     }
     public int getValue(){
         return this.value;
     }
      public String getLocation(){
         return this.locatie;
     }
     @Override
      public String toString(){
         return "Temperatura este "+ this.value + " in "+ this.locatie;
      }
}
