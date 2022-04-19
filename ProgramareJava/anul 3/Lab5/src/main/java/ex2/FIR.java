/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.concurrent.locks.Lock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class FIR extends Thread{
    int nume;
    Lock l2;
    Lock l1;
    
    public FIR(int h, Lock x, Lock y)
    {
        this.nume=h;
        this.l1=x;
        this.l2=y;
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
        System.out.println(this.nume+" START");
        System.out.println(this.nume+" STATE 1");
        l1.lock();
        Merg(2,4);
        Merg(4,6);
        System.out.println(this.nume+" STATE 2");
        
        
        if(l2.tryLock())
                {   
                   System.out.println(this.nume+" STATE 3");
                   
                   try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(FIR.class.getName()).log(Level.SEVERE, null, ex);
            }
                   
                   l1.unlock();
                   l2.unlock();
                }
        
        
        System.out.println(this.nume+" STATE 4");
        
    }
}
