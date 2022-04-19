/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercitiul2;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Asus
 */
public class main2 {
    public static void main(String[] args){
        CyclicBarrier bariera = new CyclicBarrier(3,new Runnable() 
            {@Override
            public void run() {
                System.out.println("Rutina barierei"); } 
            }
        );
        
        Semaphore s1 = new Semaphore(0);
        Semaphore s2 = new Semaphore(0);
	
          Fir1_2 f1;
          Fir2_2 f2,f3;
          
          
	  f2 = new Fir2_2(bariera,2, s1,    4, (int) Math.round(Math.random() * 2 + 2), 2);
          f1 = new Fir1_2(bariera,1, s1,s2, 3,(int) Math.round(Math.random() * 3 + 2),3);
	  f3 = new Fir2_2(bariera,3, s2,    5, (int) Math.round(Math.random() * 7 + 3), 1);
	  f1.start();
          f2.start();
	  f3.start();
    }
}

