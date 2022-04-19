/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Asus
 */
class Fir extends Thread {
	int nume, intarziere, k, permise;
	Semaphore s;

	Fir(int n, Semaphore sa, int intarziere, int k, int permise) {
		this.nume = n;
		this.s = sa;
		this.intarziere = intarziere;
		this.k = k;
		this.permise = permise;
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
		while (true) {
			try {System.out.println("Fir " + nume+ " este in starea 1");
                                
                                this.s.acquire(1);
                                System.out.println("Fir " + nume+ " a luat un jeton din semafor");
                                System.out.println("Fir " + nume+ " este in starea 2");
				Merg(4,7);
				
				this.s.release(1); // sfarsit regiune critica
                                
				
				
				System.out.println("Fir " + nume+ " este in starea 3");
                                System.out.println("Fir " + nume+ " este in starea 4");
			} catch (InterruptedException e) {
			}
		}
	}
}

