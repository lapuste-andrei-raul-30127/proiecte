/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplu;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author Asus
 */
class Fir extends Thread {
CyclicBarrier bariera;

   public Fir(CyclicBarrier bariera) 
    {

       this.bariera = bariera;
    }

@Override
    public void run() {
        while (true) {
        activitate();
        try {
        bariera.await();
        } catch (InterruptedException e) {

        e.printStackTrace();
        }catch(BrokenBarrierException e) {
        e.printStackTrace();

}
activitate();

}

}

    public void activitate() {

    System.out.println(this.getName() + "> activitate");

    try {
    Thread.sleep(Math.round(Math.random() * 3 + 3) * 1000);
    } catch (InterruptedException e) {
        }
    }
}
