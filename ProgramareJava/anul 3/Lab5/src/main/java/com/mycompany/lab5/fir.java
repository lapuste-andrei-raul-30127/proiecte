/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

import java.util.concurrent.locks.Lock;

/**
 *
 * @author Asus
 */
class fir extends Thread {
	int nume;
	Lock l;

	fir(int n, Lock la) {
		this.nume = n;
		this.l = la;
	}

        @Override
	public void run() {
		this.l.lock();
		System.out.println("Fir " + nume + " a pus zavorul");
		regiuneCritica();
		this.l.unlock();
		System.out.println("Fir " + nume + " a eliberat zavorul");
	}

	public void regiuneCritica() {
		System.out.println("SE EXECUTA REGIUNEA CRITICA!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
}

