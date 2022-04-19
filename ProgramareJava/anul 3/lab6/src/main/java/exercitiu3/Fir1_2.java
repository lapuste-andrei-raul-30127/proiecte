/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercitiu3;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Asus
 */
public class Fir1_2 extends Thread{
    CountDownLatch count;
    int nume, intarziere, k, permise;
    Semaphore s1;
    Semaphore s2;
    
    public Fir1_2(CountDownLatch c,int n, Semaphore sa,Semaphore sb, int intarziere, int k, int permise) 
    {
        this.nume = n;
	this.s1 = sa;
        this.s2=sb;
	this.intarziere = intarziere;
	this.k = k;
	this.permise = permise;
        this.count=c;
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
	public void run() {
		
			try {
				System.out.println(System.nanoTime()+" Thread "+this.nume+" este in STATE 1");
				Thread.sleep(4000); // regiune critica
				System.out.println(System.nanoTime()+" Fir " + nume+ " -->STATE 2");
                                Merg(2,5);
                                
                                System.out.println(System.nanoTime()+" Fir " + nume+ " a eliberat jetoane pentru fire-->STATE 3");
				this.s1.release(1);
                                this.s2.release(1);// sfarsit regiune critica
                                count.countDown();
                                count.await();
                                System.out.println("Fir "+ this.nume +" eliberat");
                                
                                
                                
                             
			} catch (InterruptedException e) {
			}
		
	}
}

