/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semafor;

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

        @Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(this.intarziere * 500);
				this.s.acquire(1); // regiune critica
				System.out.println("Fir " + nume+ " a luat un jeton din semafor");
                                
				for (int i = 0; i < k * 100000; i++) {
					i++;
					i--;
				}
				this.s.release(1); // sfarsit regiune critica
				System.out.println("Fir " + nume+ " a eliberat un jeton din semafor");
			} catch (InterruptedException e) {
			}
		}
	}
}

