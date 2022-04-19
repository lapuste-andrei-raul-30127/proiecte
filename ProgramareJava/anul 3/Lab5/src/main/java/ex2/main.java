/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Asus
 */
public class main {
    public static void main(String[] args)
    {
        Lock l1 = new ReentrantLock();
        Lock l2 = new ReentrantLock();
		FIR f1, f2;
		f1 = new FIR(1, l1,l2);
		f2 = new FIR(2, l1,l2);
		f1.start();
		f2.start();
    }
}
