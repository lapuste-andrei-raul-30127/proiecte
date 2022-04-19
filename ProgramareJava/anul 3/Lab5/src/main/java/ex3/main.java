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
public class main {
    public static void main(String args[]) {
        Semaphore s = new Semaphore(2);
	  Fir f1, f2,f3;
	  f1 = new Fir(1, s, 2, (int) Math.round(Math.random() * 3 + 2), 2);
	  f2 = new Fir(2, s, 4, (int) Math.round(Math.random() * 3 + 3), 1);
            f3 = new Fir(3, s, 4, (int) Math.round(Math.random() * 3 + 3), 1);
	  f1.start();
	  f2.start();
          f3.start();
    }
}
