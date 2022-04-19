/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercitiul2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Asus
 */
public class Fir2_2 extends Thread{
    CyclicBarrier bariera;
    int nume, intarziere, k, permise;
    Semaphore s;
    
    public Fir2_2(CyclicBarrier bariera,int n, Semaphore sa, int intarziere, int k, int permise) 
    {
        this.nume = n;
	this.s = sa;
	this.intarziere = intarziere;
	this.k = k;
	this.permise = permise;
        this.bariera = bariera;
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
				System.out.println(System.nanoTime()+" Fir " + nume+ " a eliberat un jeton din semafor-->STATE 3");
                                try {
        bariera.await();
        } catch (InterruptedException e) {

        e.printStackTrace();
        }catch(BrokenBarrierException e) {
        e.printStackTrace();}
			} catch (InterruptedException e) {
			}
		
	}
}
