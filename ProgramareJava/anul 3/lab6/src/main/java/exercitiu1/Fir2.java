package exercitiu1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Asus
 */
public class Fir2 extends Thread{
    CyclicBarrier bariera;
    int nume, intarziere, k, permise;
    Semaphore s1;
    Semaphore s2;
    
    public Fir2(CyclicBarrier bariera,int n, Semaphore sa,Semaphore sb, int intarziere, int k, int permise) 
    {
        this.nume = n;
	this.s1 = sa;
        this.s2=sb;
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
		while (true) {
			try {
				System.out.println(System.nanoTime()+" Thread "+this.nume+" este in STATE 1");
                                this.s1.acquire(1); 
                                this.s2.acquire(1);
                                
                                 // regiune critica
				
                                System.out.println(System.nanoTime()+" Fir " + nume+ " a luat jetoane-->STATE 2");
                                Merg(2,6);
                                Thread.sleep(4000);
				this.s1.release(1);
                                this.s2.release(1);// sfarsit regiune critica
				System.out.println(System.nanoTime()+" Fir " + nume+ " a eliberat jetoanele din semafoare-->STATE 3");
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
}

