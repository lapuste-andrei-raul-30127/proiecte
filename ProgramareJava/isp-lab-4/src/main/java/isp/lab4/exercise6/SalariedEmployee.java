package isp.lab4.exercise6;

public class SalariedEmployee extends Employee{
    private double weeklysalari;
    public SalariedEmployee(String e,String l,double w){
         super(e,l);
         this.weeklysalari=w;
         
     }
     @Override
     public double PaymentAmount(){
         return this.weeklysalari;
     }
}
