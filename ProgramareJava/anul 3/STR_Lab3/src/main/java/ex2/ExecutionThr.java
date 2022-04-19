/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Asus
 */
public class ExecutionThr {
    Integer monitor;
    Integer monitor2;
    String nume;
    public ExecutionThr(Integer m,Integer m2,String str){
        this.monitor=m;
        this.monitor2=m2;
        this.nume=str;
    }
    public void Merg(int min,int max){
    int k = (int) Math.round(Math.random()*(max- min) + min);
    
    for (int i = 0; i < k * 100000; i++) 
        {
        i++; i--;
        }
    }
    
    public void run(){
    System.out.println(this.nume+" STATE 1");
    Merg(2,4);
    
    synchronized(monitor2){ 
    synchronized(monitor)
        {
        
        }
      }
    
    }
    

    
}
