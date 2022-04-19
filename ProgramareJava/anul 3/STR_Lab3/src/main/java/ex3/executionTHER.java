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
public class executionTHER extends Thread {
    Monitor monitor;
    Monitor monitor2;
    String nume;
    public executionTHER(Monitor m,Monitor m2,String str){
        this.monitor=m;
        this.monitor2=m2;
        this.nume=str;
    }
    public void Merg(int min,int max)
    {
        int k = (int) Math.round(Math.random()*(max- min) + min);
    
        for (int i = 0; i < k * 100000; i++) 
            {
            i++; i--;
            }
    }
    
    @Override
    public void run(){
        try {
            Thread.sleep(7000);
        } catch (InterruptedException ex) {
            Logger.getLogger(executionTHER.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        System.out.println(this.nume+" START");
         System.out.println(this.nume+" STATE 1");
        Merg(2,3);
        try {
             System.out.println(this.nume+" notificam firele");
            monitor.notific();
            monitor2.notific();
        } catch (InterruptedException ex) {
            Logger.getLogger(executionTHER.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(this.nume+" STATE 2");
        
    }
}
