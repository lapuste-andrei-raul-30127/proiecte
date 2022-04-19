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
public class Fir2_2 extends Thread{
    CountDownLatch count;
    int nume, intarziere, k, permise;
    Semaphore s;
    
    public Fir2_2(CountDownLatch c,int n, Semaphore sa, int intarziere, int k, int permise) 
    {
        this.nume = n;
	this.s = sa;
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
				this.s.acquire(1); // regiune critica
				System.out.println(System.nanoTime()+" Fir " + nume+ " a luat un jeton din semafor-->STATE 2");
                                Merg(2,5);
                                
				this.s.release(1); // sfarsit regiune critica
				System.out.println(System.nanoTime()+" Fir " + nume+ " -->STATE 3");
                                 count.countDown();
                                count.await();
                                System.out.println("Fir "+ this.nume +" eliberat");
                               
                                
      
			} catch (InterruptedException e) {
			}
		
	}
}
