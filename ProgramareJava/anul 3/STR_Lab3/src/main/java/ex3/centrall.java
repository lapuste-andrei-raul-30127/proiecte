/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class centrall {
    public static void main(String[] args){
        Monitor m= new Monitor();
        Monitor m2=new Monitor();
        executionTHER  f1=new executionTHER(m,m2,"f1");
        executionTHER2 f2=new executionTHER2(m,"f2");
        executionTHER2 f3=new executionTHER2(m2,"f3");
        f1.start();
        f2.start();
        f3.start();
        try {
            f1.join();
            f2.join();
            f3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(centrall.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
}
