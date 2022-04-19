/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class executionTHER2 extends Thread {
    Monitor monitor;
    String nume;
    
    public executionTHER2(Monitor m,String str){
        this.monitor=m;
        this.nume=str;
    }
    public void Merg(int min,int max){
    int k = (int) Math.round(Math.random()*(max- min) + min);
    
    for (int i = 0; i < k * 100000; i++) 
        {
        i++; i--;
        }
    }
    
    @Override
    public void run(){
        System.out.println(this.nume + "  START");
        try {
            System.out.println(this.nume + " WAITING...");
            monitor.astept();
        } catch (InterruptedException ex) {
            Logger.getLogger(executionTHER2.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println(this.nume + " STATE 1");
        Merg(3,5);
            
        
        System.out.println(this.nume + " STATE 2");
       
    }
    
}
