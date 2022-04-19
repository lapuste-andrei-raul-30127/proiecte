/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplu;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author Asus
 */
public class ex1 { 
    public static void main(String args[]) {
        CyclicBarrier bariera = new CyclicBarrier(3,new Runnable() 
            {@Override
            public void run() {
                System.out.println("Rutina barierei"); } 
            }
        );
        Fir fir1 = new Fir(bariera); 
        Fir fir2 = new Fir(bariera); 
        Fir fir3 = new Fir(bariera); 
        fir1.start(); 
        fir2.start(); 
        fir3.start(); 
    } 
}
