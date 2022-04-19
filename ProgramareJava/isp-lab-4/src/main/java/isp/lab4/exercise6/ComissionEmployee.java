/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab4.exercise6;

/**
 *
 * @author Asus
 */
public class ComissionEmployee extends Employee {
    private double grossSales;
     private double commisionSales;
    public ComissionEmployee(String e,String l,double w,double h){
         super(e,l);
          this.grossSales=h;
         this.commisionSales=w;
        
         
     }
     @Override
     public double PaymentAmount(){
         return this.commisionSales;
     }
}
