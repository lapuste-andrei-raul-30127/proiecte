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
public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;
     public HourlyEmployee(String e,String l,double w,double h){
         super(e,l);
         this.wage=w;
         this.hours=h;
         
     }
     @Override
     public double PaymentAmount(){
         return this.wage;
     }
}
