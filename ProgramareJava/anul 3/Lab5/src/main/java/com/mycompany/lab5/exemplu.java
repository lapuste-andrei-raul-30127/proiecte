/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Asus
 */
public class exemplu {
    public static void main(String args[]) {
		Lock l = new ReentrantLock();
		fir f1, f2;
		f1 = new fir(1, l);
		f2 = new fir(2, l);
		f1.start();
		f2.start();
	}

}
