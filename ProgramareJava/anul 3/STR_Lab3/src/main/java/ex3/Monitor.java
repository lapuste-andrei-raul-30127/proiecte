/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author Asus
 */
public class Monitor {
    
    public synchronized void astept() throws InterruptedException{
        wait();
    }
    public synchronized void notific() throws InterruptedException{
        notify();
    }
}
